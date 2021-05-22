package cds.gen.poservice;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@CdsName("POService.PurchaseOrderItems")
public interface PurchaseOrderItems extends CdsData {
  String ID = "ID";

  String CREATED_AT = "createdAt";

  String CREATED_BY = "createdBy";

  String MODIFIED_AT = "modifiedAt";

  String MODIFIED_BY = "modifiedBy";

  String PURCHASE_ORDER = "purchaseOrder";

  String PURCHASE_ORDER_VERSION = "purchaseOrderVersion";

  String PURCHASE_ORDER_ITEM = "purchaseOrderItem";

  String PURCHASE_ORDER_ITEM_CAT = "purchaseOrderItemCat";

  String PURCHASE_ORDER_ITEM_CAT_CODE = "purchaseOrderItemCat_code";

  String MATERIAL = "material";

  String MATERIAL_CODE = "material_code";

  String MATERIAL_GROUP = "materialGroup";

  String MATERIAL_GROUP_CODE = "materialGroup_code";

  String PLANT = "plant";

  String PLANT_CODE = "plant_code";

  String SUPPLIER_MATERIAL = "supplierMaterial";

  String SUPPLIER_MATERIAL_CODE = "supplierMaterial_code";

  String ORDER_QUANTITY = "orderQuantity";

  String QUANTITY_UNIT = "quantityUnit";

  String ORDER_PRICE = "orderPrice";

  String DOCUMENT_CURRENCY = "documentCurrency";

  String DOCUMENT_CURRENCY_CODE = "documentCurrency_code";

  String PRICE_UNIT = "priceUnit";

  String NET_VALUE = "netValue";

  String GROSS_VALUE = "grossValue";

  String DATE_OF_DELIVERY = "dateOfDelivery";

  String SCHEDULE_LINE_INC = "scheduleLineInc";

  String CONFIRMATION_ORDER = "confirmationOrder";

  String CONFIRMATION_INC = "confirmationInc";

  String CONFIRMED_QUANTITY = "confirmedQuantity";

  String CONFIRMED_PRICE = "confirmedPrice";

  String CONFIRMED_DATE_OF_DELIVERY = "confirmedDateOfDelivery";

  String GOOD_RECEIPT = "goodReceipt";

  String UNLOADING_POINT = "unloadingPoint";

  String INCO_TERM_VERION = "incoTermVerion";

  String INCO_TERM_CLASSIFICATION = "incoTermClassification";

  String INCO_TERM_LOCATION1 = "incoTermLocation1";

  String INCO_TERM_LOCATION2 = "incoTermLocation2";

  String LONG_PLAIN_TEXT = "longPlainText";

  String DELIVERY_ADDRESS = "deliveryAddress";

  String DELIVERY_ADDRESS_CODE = "deliveryAddress_code";

  String PARENT_PURCHASE_ORDER = "parentPurchaseOrder";

  String PARENT_PURCHASE_ORDER_ID = "parentPurchaseOrder_ID";

  String ATTACHMENTS = "attachments";

  String SCHEDULE_LINES = "scheduleLines";

  String IS_ACTIVE_ENTITY = "IsActiveEntity";

  String HAS_ACTIVE_ENTITY = "HasActiveEntity";

  String HAS_DRAFT_ENTITY = "HasDraftEntity";

  String DRAFT_ADMINISTRATIVE_DATA = "DraftAdministrativeData";

  String DRAFT_ADMINISTRATIVE_DATA_DRAFT_UUID = "DraftAdministrativeData_DraftUUID";

  String SIBLING_ENTITY = "SiblingEntity";

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

  Integer getPurchaseOrderItem();

  void setPurchaseOrderItem(Integer purchaseOrderItem);

  ItemCategories getPurchaseOrderItemCat();

  void setPurchaseOrderItemCat(Map<String, ?> purchaseOrderItemCat);

  @CdsName(PURCHASE_ORDER_ITEM_CAT_CODE)
  String getPurchaseOrderItemCatCode();

  @CdsName(PURCHASE_ORDER_ITEM_CAT_CODE)
  void setPurchaseOrderItemCatCode(String purchaseOrderItemCatCode);

  Materials getMaterial();

  void setMaterial(Map<String, ?> material);

  @CdsName(MATERIAL_CODE)
  String getMaterialCode();

  @CdsName(MATERIAL_CODE)
  void setMaterialCode(String materialCode);

  MaterialGroups getMaterialGroup();

  void setMaterialGroup(Map<String, ?> materialGroup);

  @CdsName(MATERIAL_GROUP_CODE)
  String getMaterialGroupCode();

  @CdsName(MATERIAL_GROUP_CODE)
  void setMaterialGroupCode(String materialGroupCode);

  Plants getPlant();

  void setPlant(Map<String, ?> plant);

  @CdsName(PLANT_CODE)
  String getPlantCode();

  @CdsName(PLANT_CODE)
  void setPlantCode(String plantCode);

  Materials getSupplierMaterial();

  void setSupplierMaterial(Map<String, ?> supplierMaterial);

  @CdsName(SUPPLIER_MATERIAL_CODE)
  String getSupplierMaterialCode();

  @CdsName(SUPPLIER_MATERIAL_CODE)
  void setSupplierMaterialCode(String supplierMaterialCode);

  BigDecimal getOrderQuantity();

  void setOrderQuantity(BigDecimal orderQuantity);

  String getQuantityUnit();

  void setQuantityUnit(String quantityUnit);

  BigDecimal getOrderPrice();

  void setOrderPrice(BigDecimal orderPrice);

  Currencies getDocumentCurrency();

  void setDocumentCurrency(Map<String, ?> documentCurrency);

  @CdsName(DOCUMENT_CURRENCY_CODE)
  String getDocumentCurrencyCode();

  @CdsName(DOCUMENT_CURRENCY_CODE)
  void setDocumentCurrencyCode(String documentCurrencyCode);

  BigDecimal getPriceUnit();

  void setPriceUnit(BigDecimal priceUnit);

  BigDecimal getNetValue();

  void setNetValue(BigDecimal netValue);

  BigDecimal getGrossValue();

  void setGrossValue(BigDecimal grossValue);

  LocalDate getDateOfDelivery();

  void setDateOfDelivery(LocalDate dateOfDelivery);

  String getScheduleLineInc();

  void setScheduleLineInc(String scheduleLineInc);

  String getConfirmationOrder();

  void setConfirmationOrder(String confirmationOrder);

  String getConfirmationInc();

  void setConfirmationInc(String confirmationInc);

  BigDecimal getConfirmedQuantity();

  void setConfirmedQuantity(BigDecimal confirmedQuantity);

  BigDecimal getConfirmedPrice();

  void setConfirmedPrice(BigDecimal confirmedPrice);

  LocalDate getConfirmedDateOfDelivery();

  void setConfirmedDateOfDelivery(LocalDate confirmedDateOfDelivery);

  String getGoodReceipt();

  void setGoodReceipt(String goodReceipt);

  String getUnloadingPoint();

  void setUnloadingPoint(String unloadingPoint);

  String getIncoTermVerion();

  void setIncoTermVerion(String incoTermVerion);

  String getIncoTermClassification();

  void setIncoTermClassification(String incoTermClassification);

  String getIncoTermLocation1();

  void setIncoTermLocation1(String incoTermLocation1);

  String getIncoTermLocation2();

  void setIncoTermLocation2(String incoTermLocation2);

  String getLongPlainText();

  void setLongPlainText(String longPlainText);

  Addresses getDeliveryAddress();

  void setDeliveryAddress(Map<String, ?> deliveryAddress);

  @CdsName(DELIVERY_ADDRESS_CODE)
  String getDeliveryAddressCode();

  @CdsName(DELIVERY_ADDRESS_CODE)
  void setDeliveryAddressCode(String deliveryAddressCode);

  PurchaseOrders getParentPurchaseOrder();

  void setParentPurchaseOrder(Map<String, ?> parentPurchaseOrder);

  @CdsName(PARENT_PURCHASE_ORDER_ID)
  String getParentPurchaseOrderId();

  @CdsName(PARENT_PURCHASE_ORDER_ID)
  void setParentPurchaseOrderId(String parentPurchaseOrderId);

  List<Attachments> getAttachments();

  void setAttachments(List<? extends Map<String, ?>> attachments);

  List<ScheduleLines> getScheduleLines();

  void setScheduleLines(List<? extends Map<String, ?>> scheduleLines);

  @CdsName(IS_ACTIVE_ENTITY)
  Boolean getIsActiveEntity();

  @CdsName(IS_ACTIVE_ENTITY)
  void setIsActiveEntity(Boolean isActiveEntity);

  @CdsName(HAS_ACTIVE_ENTITY)
  Boolean getHasActiveEntity();

  @CdsName(HAS_ACTIVE_ENTITY)
  void setHasActiveEntity(Boolean hasActiveEntity);

  @CdsName(HAS_DRAFT_ENTITY)
  Boolean getHasDraftEntity();

  @CdsName(HAS_DRAFT_ENTITY)
  void setHasDraftEntity(Boolean hasDraftEntity);

  @CdsName(DRAFT_ADMINISTRATIVE_DATA)
  DraftAdministrativeData getDraftAdministrativeData();

  @CdsName(DRAFT_ADMINISTRATIVE_DATA)
  void setDraftAdministrativeData(Map<String, ?> draftAdministrativeData);

  @CdsName(DRAFT_ADMINISTRATIVE_DATA_DRAFT_UUID)
  String getDraftAdministrativeDataDraftUUID();

  @CdsName(DRAFT_ADMINISTRATIVE_DATA_DRAFT_UUID)
  void setDraftAdministrativeDataDraftUUID(String draftAdministrativeDataDraftUUID);

  @CdsName(SIBLING_ENTITY)
  PurchaseOrderItems getSiblingEntity();

  @CdsName(SIBLING_ENTITY)
  void setSiblingEntity(Map<String, ?> siblingEntity);

  PurchaseOrderItems_ ref();

  static PurchaseOrderItems create() {
    return Struct.create(PurchaseOrderItems.class);
  }
}
