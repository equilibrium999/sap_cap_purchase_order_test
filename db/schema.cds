namespace tminhle.purchaseorder;

using {
    Currency,
    Language,
    sap,
    managed,
    cuid,
    Country,
    sap.common.CodeList
} from '@sap/cds/common';

// Type definitions

// Purchase order status
type Purchase_Order_Status : Association to PurchaseOrderStatuses;

@assert.unique : {name : [name]}
entity PurchaseOrderStatuses : managed, CodeList {
    key code : String(2) not null @mandatory;
}

// type Contact_Person: Association to ContactPersons;
type Contact_Person : Association to ContactPersons;

entity ContactPersons {
    key code      : String(3) not null @mandatory;
        name      : String(18);
        faxNumber : String(31);
        telNumber : String(30);
        email     : String(241);
}


// Address
type Address : Association to Addresses;

entity Addresses {
    key code        : String not null @mandatory;
        addressName : String(40);
        cityName    : String(40);
        faxNumber   : String(30);
        houseNumber : String(10);
        postalCode  : String(10);
        streetName  : String(60);
        phoneNumber : String(30);
        region      : String(3);
        country     : String(2);
};

type Purchasing_Organization : Association to PurchasingOrganizations;

entity PurchasingOrganizations : CodeList {
    key code : String(4) not null @mandatory;
}

type Purchasing_Group : Association to PurchasingGroups;

entity PurchasingGroups : CodeList {
    key code : String(3) not null @mandatory;
}

type Company_Code : Association to CompanyCodes;

entity CompanyCodes : CodeList {
    key code : String(4) not null @mandatory;
}

type Term_Payment : Association to TermPayments;

entity TermPayments : CodeList {
    key code : String(4) not null @mandatory;
}

type Item_Category : Association to ItemCategories;

entity ItemCategories : CodeList {
    key code : String(1) not null @mandatory;
}

type Material : Association to Materials;

entity Materials : CodeList {
    key code : String(40) not null @mandatory;
}

type Material_Group : Association to MaterialGroups;

entity MaterialGroups : CodeList {
    key code : String(9) not null @mandatory;
}

type Plant : Association to Plants;

entity Plants : CodeList {
    key code : String(9) not null @mandatory;
}

// Entity definitions
@fiori.draft.enabled
@assert.unique : {purchaseOrder : [
    purchaseOrder,
    purchaseOrderVersion
]}
entity PurchaseOrders : cuid, managed {
    //Purchase order header information
    purchaseOrder          : String(10) not null     @mandatory;
    purchaseOrderVersion   : Integer not null        @mandatory;
    purchaseOrderDesc      : String(100);
    purchaseOrderStatus    : Purchase_Order_Status;
    purchaseOrderDate      : Date;
    title                  : String;
    language               : Language;
    supplier               : String(10)              @mandatory;
    supplierName           : String(35);
    supplierAddress        : Address;
    totalAmount            : Decimal(23, 4);
    documentCurrency       : Currency                @mandatory;
    exchangeRate           : Decimal(9, 5);
    purchasingOrganization : Purchasing_Organization @mandatory;
    purchasingGroup        : Purchasing_Group        @mandatory;
    companyCode            : Company_Code            @mandatory;
    orderConfirmation      : String(10);
    incoTermVerion         : String(4);
    incoTermClassification : String(3);
    incoTermLocation1      : String(70);
    incoTermLocation2      : String(70);
    termOfPayment          : Term_Payment;
    netPaymentTerm         : Decimal(3, 0);
    cashDiscount1Days      : Decimal(3, 0);
    cashDiscount1Percent   : Decimal(5, 0);
    cashDiscount2Days      : Decimal(3, 0);
    cashDiscount2Percent   : Decimal(5, 0);
    dateOfDelivery         : Date;
    startPeriod            : Date;
    endPeriod              : Date;
    plainLongText          : String;
    contactPerson          : Contact_Person;
    deliveryAddress        : Address;
    // versions                : Composition of many PurchaseOrderVersions on versions.parentPurchaseOrder = $self;
    attachments            : Association to many Attachments
                                 on attachments.parentPurchaseOrder.ID = $self.ID;
    items                  : Composition of many PurchaseOrderItems
                                 on items.parentPurchaseOrder = $self;
}

@fiori.draft.enabled
@assert.unique : {purchaseOrderItem : [
    purchaseOrder,
    purchaseOrderVersion,
    purchaseOrderItem
]}
entity PurchaseOrderItems : cuid, managed {
    //Purchase order item information
    purchaseOrder           : String(10) not null @mandatory;
    purchaseOrderVersion    : Integer not null    @mandatory;
    purchaseOrderItem       : Integer not null    @mandatory;
    purchaseOrderItemCat    : Item_Category;
    material                : Material;
    materialGroup           : Material_Group;
    plant                   : Plant;
    supplierMaterial        : Material;
    orderQuantity           : Decimal(13, 3);
    quantityUnit            : String(3);
    orderPrice              : Decimal(11, 2);
    documentCurrency        : Currency;
    priceUnit               : Decimal(5, 0);
    netValue                : Decimal(23, 4);
    grossValue              : Decimal(23, 4);
    dateOfDelivery          : Date;
    scheduleLineInc         : String(1);
    confirmationOrder       : String(10);
    confirmationInc         : String(1);
    confirmedQuantity       : Decimal(13, 3);
    confirmedPrice          : Decimal(11, 2);
    confirmedDateOfDelivery : Date;
    goodReceipt             : String(25);
    unloadingPoint          : String(12);
    incoTermVerion          : String(4);
    incoTermClassification  : String(3);
    incoTermLocation1       : String(70);
    incoTermLocation2       : String(70);
    longPlainText           : String;
    deliveryAddress         : Address;
    parentPurchaseOrder     : Association to PurchaseOrders;
    attachments             : Association to many Attachments
                                  on attachments.parentOrderItem = $self;
    scheduleLines           : Composition of many ScheduleLines
                                  on scheduleLines.parentOrderItem = $self;
}

@fiori.draft.enabled
@assert.unique : {scheduleLine : [
    purchaseOrder,
    purchaseOrderVersion,
    purchaseOrderItem,
    scheduleLine
]}
entity ScheduleLines : cuid, managed {
    purchaseOrder           : String(10) not null @mandatory;
    purchaseOrderVersion    : Integer not null    @mandatory;
    purchaseOrderItem       : Integer not null    @mandatory;
    scheduleLine            : Integer not null    @mandatory;
    dateOfDeliveryCategory  : String(1);
    dateOfDelivery          : Date;
    scheduleLineQuantity    : Decimal(13, 3);
    quantityUnit            : String(3);
    confirmedQuantity       : Decimal(13, 3);
    confirmedDateOfDelivery : Date;
    parentOrderItem         : Association to PurchaseOrderItems;
}

@fiori.draft.enabled
@assert.unique : {purchaseOrderAttachment : [
    purchaseOrder,
    purchaseOrderVersion,
    purchaseOrderItem,
    fileId
]}
entity Attachments : cuid {
    purchaseOrder        : String(10) not null @mandatory;
    purchaseOrderVersion : Integer not null    @mandatory;
    purchaseOrderItem    : Integer not null    @mandatory;
    fileId               : String not null     @mandatory;
    fileName             : String(255);
    fileSize             : Integer;
    mimeType             : String(100);
    parentPurchaseOrder  : Association to PurchaseOrders;
    parentOrderItem      : Association to PurchaseOrderItems;
}
