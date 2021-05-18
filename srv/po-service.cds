using {sap.common.Languages as CommonLanguages} from '@sap/cds/common';
using {tminhle.purchaseorder as tminhle} from '../db/schema';

service POService @(requires:'admin') {
    entity PurchaseOrders     as projection on tminhle.PurchaseOrders;
    entity PurchaseOrderItems as projection on tminhle.PurchaseOrderItems;
    entity ScheduleLines      as projection on tminhle.ScheduleLines;
    entity Attachments        as projection on tminhle.Attachments;
    entity Addresses          as projection on tminhle.Addresses;
}

// workaround to enable the value help for languages
// Necessary because auto exposure is currently not working
// for if Languages is only referenced by the generated
// _texts table
extend service POService with {
    entity Languages as projection on CommonLanguages;
}

// Enable Fiori Draft for Purchase Order, Item, Schedule Line
annotate POService.PurchaseOrders with @odata.draft.enabled;
annotate POService.PurchaseOrders with @fiori.draft.enabled;