package cds.gen.tminhle.purchaseorder;

import cds.gen.sap.common.Currencies;
import cds.gen.sap.common.Languages;
import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.String;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@CdsName("tminhle.purchaseorder.PurchaseOrders")
public interface PurchaseOrders extends CdsData {
  String ID = "ID";

  String CREATED_AT = "createdAt";

  String CREATED_BY = "createdBy";

  String MODIFIED_AT = "modifiedAt";

  String MODIFIED_BY = "modifiedBy";

  String PURCHASE_ORDER = "purchaseOrder";

  String PURCHASE_ORDER_VERSION = "purchaseOrderVersion";

  String PURCHASE_ORDER_DESC = "purchaseOrderDesc";

  String PURCHASE_ORDER_STATUS = "purchaseOrderStatus";

  String PURCHASE_ORDER_STATUS_CODE = "purchaseOrderStatus_code";

  String PURCHASE_ORDER_DATE = "purchaseOrderDate";

  String TITLE = "title";

  String LANGUAGE = "language";

  String LANGUAGE_CODE = "language_code";

  String SUPPLIER = "supplier";

  String SUPPLIER_NAME = "supplierName";

  String SUPPLIER_ADDRESS = "supplierAddress";

  String SUPPLIER_ADDRESS_CODE = "supplierAddress_code";

  String TOTAL_AMOUNT = "totalAmount";

  String DOCUMENT_CURRENCY = "documentCurrency";

  String DOCUMENT_CURRENCY_CODE = "documentCurrency_code";

  String EXCHANGE_RATE = "exchangeRate";

  String PURCHASING_ORGANIZATION = "purchasingOrganization";

  String PURCHASING_ORGANIZATION_CODE = "purchasingOrganization_code";

  String PURCHASING_GROUP = "purchasingGroup";

  String PURCHASING_GROUP_CODE = "purchasingGroup_code";

  String COMPANY_CODE = "companyCode";

  String COMPANY_CODE_CODE = "companyCode_code";

  String ORDER_CONFIRMATION = "orderConfirmation";

  String INCO_TERM_VERION = "incoTermVerion";

  String INCO_TERM_CLASSIFICATION = "incoTermClassification";

  String INCO_TERM_LOCATION1 = "incoTermLocation1";

  String INCO_TERM_LOCATION2 = "incoTermLocation2";

  String TERM_OF_PAYMENT = "termOfPayment";

  String TERM_OF_PAYMENT_CODE = "termOfPayment_code";

  String NET_PAYMENT_TERM = "netPaymentTerm";

  String CASH_DISCOUNT1_DAYS = "cashDiscount1Days";

  String CASH_DISCOUNT1_PERCENT = "cashDiscount1Percent";

  String CASH_DISCOUNT2_DAYS = "cashDiscount2Days";

  String CASH_DISCOUNT2_PERCENT = "cashDiscount2Percent";

  String DATE_OF_DELIVERY = "dateOfDelivery";

  String START_PERIOD = "startPeriod";

  String END_PERIOD = "endPeriod";

  String PLAIN_LONG_TEXT = "plainLongText";

  String CONTACT_PERSON = "contactPerson";

  String CONTACT_PERSON_CODE = "contactPerson_code";

  String DELIVERY_ADDRESS = "deliveryAddress";

  String DELIVERY_ADDRESS_CODE = "deliveryAddress_code";

  String ATTACHMENTS = "attachments";

  String ITEMS = "items";

  @CdsName(ID)
  String getId();

  @CdsName(ID)
  void setId(String id);

  Instant getCreatedAt();

  void setCreatedAt(Instant createdAt);

  String getCreatedBy();

  void setCreatedBy(String createdBy);

  Instant getModifiedAt();

  void setModifiedAt(Instant modifiedAt);

  String getModifiedBy();

  void setModifiedBy(String modifiedBy);

  String getPurchaseOrder();

  void setPurchaseOrder(String purchaseOrder);

  Integer getPurchaseOrderVersion();

  void setPurchaseOrderVersion(Integer purchaseOrderVersion);

  String getPurchaseOrderDesc();

  void setPurchaseOrderDesc(String purchaseOrderDesc);

  PurchaseOrderStatuses getPurchaseOrderStatus();

  void setPurchaseOrderStatus(Map<String, ?> purchaseOrderStatus);

  @CdsName(PURCHASE_ORDER_STATUS_CODE)
  String getPurchaseOrderStatusCode();

  @CdsName(PURCHASE_ORDER_STATUS_CODE)
  void setPurchaseOrderStatusCode(String purchaseOrderStatusCode);

  LocalDate getPurchaseOrderDate();

  void setPurchaseOrderDate(LocalDate purchaseOrderDate);

  String getTitle();

  void setTitle(String title);

  Languages getLanguage();

  void setLanguage(Map<String, ?> language);

  @CdsName(LANGUAGE_CODE)
  String getLanguageCode();

  @CdsName(LANGUAGE_CODE)
  void setLanguageCode(String languageCode);

  String getSupplier();

  void setSupplier(String supplier);

  String getSupplierName();

  void setSupplierName(String supplierName);

  Addresses getSupplierAddress();

  void setSupplierAddress(Map<String, ?> supplierAddress);

  @CdsName(SUPPLIER_ADDRESS_CODE)
  String getSupplierAddressCode();

  @CdsName(SUPPLIER_ADDRESS_CODE)
  void setSupplierAddressCode(String supplierAddressCode);

  BigDecimal getTotalAmount();

  void setTotalAmount(BigDecimal totalAmount);

  Currencies getDocumentCurrency();

  void setDocumentCurrency(Map<String, ?> documentCurrency);

  @CdsName(DOCUMENT_CURRENCY_CODE)
  String getDocumentCurrencyCode();

  @CdsName(DOCUMENT_CURRENCY_CODE)
  void setDocumentCurrencyCode(String documentCurrencyCode);

  BigDecimal getExchangeRate();

  void setExchangeRate(BigDecimal exchangeRate);

  PurchasingOrganizations getPurchasingOrganization();

  void setPurchasingOrganization(Map<String, ?> purchasingOrganization);

  @CdsName(PURCHASING_ORGANIZATION_CODE)
  String getPurchasingOrganizationCode();

  @CdsName(PURCHASING_ORGANIZATION_CODE)
  void setPurchasingOrganizationCode(String purchasingOrganizationCode);

  PurchasingGroups getPurchasingGroup();

  void setPurchasingGroup(Map<String, ?> purchasingGroup);

  @CdsName(PURCHASING_GROUP_CODE)
  String getPurchasingGroupCode();

  @CdsName(PURCHASING_GROUP_CODE)
  void setPurchasingGroupCode(String purchasingGroupCode);

  CompanyCodes getCompanyCode();

  void setCompanyCode(Map<String, ?> companyCode);

  @CdsName(COMPANY_CODE_CODE)
  String getCompanyCodeCode();

  @CdsName(COMPANY_CODE_CODE)
  void setCompanyCodeCode(String companyCodeCode);

  String getOrderConfirmation();

  void setOrderConfirmation(String orderConfirmation);

  String getIncoTermVerion();

  void setIncoTermVerion(String incoTermVerion);

  String getIncoTermClassification();

  void setIncoTermClassification(String incoTermClassification);

  String getIncoTermLocation1();

  void setIncoTermLocation1(String incoTermLocation1);

  String getIncoTermLocation2();

  void setIncoTermLocation2(String incoTermLocation2);

  TermPayments getTermOfPayment();

  void setTermOfPayment(Map<String, ?> termOfPayment);

  @CdsName(TERM_OF_PAYMENT_CODE)
  String getTermOfPaymentCode();

  @CdsName(TERM_OF_PAYMENT_CODE)
  void setTermOfPaymentCode(String termOfPaymentCode);

  BigDecimal getNetPaymentTerm();

  void setNetPaymentTerm(BigDecimal netPaymentTerm);

  BigDecimal getCashDiscount1Days();

  void setCashDiscount1Days(BigDecimal cashDiscount1Days);

  BigDecimal getCashDiscount1Percent();

  void setCashDiscount1Percent(BigDecimal cashDiscount1Percent);

  BigDecimal getCashDiscount2Days();

  void setCashDiscount2Days(BigDecimal cashDiscount2Days);

  BigDecimal getCashDiscount2Percent();

  void setCashDiscount2Percent(BigDecimal cashDiscount2Percent);

  LocalDate getDateOfDelivery();

  void setDateOfDelivery(LocalDate dateOfDelivery);

  LocalDate getStartPeriod();

  void setStartPeriod(LocalDate startPeriod);

  LocalDate getEndPeriod();

  void setEndPeriod(LocalDate endPeriod);

  String getPlainLongText();

  void setPlainLongText(String plainLongText);

  ContactPersons getContactPerson();

  void setContactPerson(Map<String, ?> contactPerson);

  @CdsName(CONTACT_PERSON_CODE)
  String getContactPersonCode();

  @CdsName(CONTACT_PERSON_CODE)
  void setContactPersonCode(String contactPersonCode);

  Addresses getDeliveryAddress();

  void setDeliveryAddress(Map<String, ?> deliveryAddress);

  @CdsName(DELIVERY_ADDRESS_CODE)
  String getDeliveryAddressCode();

  @CdsName(DELIVERY_ADDRESS_CODE)
  void setDeliveryAddressCode(String deliveryAddressCode);

  List<Attachments> getAttachments();

  void setAttachments(List<? extends Map<String, ?>> attachments);

  List<PurchaseOrderItems> getItems();

  void setItems(List<? extends Map<String, ?>> items);

  PurchaseOrders_ ref();

  static PurchaseOrders create() {
    return Struct.create(PurchaseOrders.class);
  }
}
