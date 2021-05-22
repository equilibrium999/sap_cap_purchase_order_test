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
import java.util.Map;

@CdsName("POService.ScheduleLines")
public interface ScheduleLines extends CdsData {
  String ID = "ID";

  String CREATED_AT = "createdAt";

  String CREATED_BY = "createdBy";

  String MODIFIED_AT = "modifiedAt";

  String MODIFIED_BY = "modifiedBy";

  String PURCHASE_ORDER = "purchaseOrder";

  String PURCHASE_ORDER_VERSION = "purchaseOrderVersion";

  String PURCHASE_ORDER_ITEM = "purchaseOrderItem";

  String SCHEDULE_LINE = "scheduleLine";

  String DATE_OF_DELIVERY_CATEGORY = "dateOfDeliveryCategory";

  String DATE_OF_DELIVERY = "dateOfDelivery";

  String SCHEDULE_LINE_QUANTITY = "scheduleLineQuantity";

  String QUANTITY_UNIT = "quantityUnit";

  String CONFIRMED_QUANTITY = "confirmedQuantity";

  String CONFIRMED_DATE_OF_DELIVERY = "confirmedDateOfDelivery";

  String PARENT_ORDER_ITEM = "parentOrderItem";

  String PARENT_ORDER_ITEM_ID = "parentOrderItem_ID";

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

  Integer getScheduleLine();

  void setScheduleLine(Integer scheduleLine);

  String getDateOfDeliveryCategory();

  void setDateOfDeliveryCategory(String dateOfDeliveryCategory);

  LocalDate getDateOfDelivery();

  void setDateOfDelivery(LocalDate dateOfDelivery);

  BigDecimal getScheduleLineQuantity();

  void setScheduleLineQuantity(BigDecimal scheduleLineQuantity);

  String getQuantityUnit();

  void setQuantityUnit(String quantityUnit);

  BigDecimal getConfirmedQuantity();

  void setConfirmedQuantity(BigDecimal confirmedQuantity);

  LocalDate getConfirmedDateOfDelivery();

  void setConfirmedDateOfDelivery(LocalDate confirmedDateOfDelivery);

  PurchaseOrderItems getParentOrderItem();

  void setParentOrderItem(Map<String, ?> parentOrderItem);

  @CdsName(PARENT_ORDER_ITEM_ID)
  String getParentOrderItemId();

  @CdsName(PARENT_ORDER_ITEM_ID)
  void setParentOrderItemId(String parentOrderItemId);

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
  ScheduleLines getSiblingEntity();

  @CdsName(SIBLING_ENTITY)
  void setSiblingEntity(Map<String, ?> siblingEntity);

  ScheduleLines_ ref();

  static ScheduleLines create() {
    return Struct.create(ScheduleLines.class);
  }
}
