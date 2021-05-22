package cds.gen.poservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.function.Function;

@CdsName("POService.ScheduleLines")
public interface ScheduleLines_ extends StructuredType<ScheduleLines_> {
  String CDS_NAME = "POService.ScheduleLines";

  ElementRef<String> ID();

  ElementRef<Instant> createdAt();

  ElementRef<String> createdBy();

  ElementRef<Instant> modifiedAt();

  ElementRef<String> modifiedBy();

  ElementRef<String> purchaseOrder();

  ElementRef<Integer> purchaseOrderVersion();

  ElementRef<Integer> purchaseOrderItem();

  ElementRef<Integer> scheduleLine();

  ElementRef<String> dateOfDeliveryCategory();

  ElementRef<LocalDate> dateOfDelivery();

  ElementRef<BigDecimal> scheduleLineQuantity();

  ElementRef<String> quantityUnit();

  ElementRef<BigDecimal> confirmedQuantity();

  ElementRef<LocalDate> confirmedDateOfDelivery();

  PurchaseOrderItems_ parentOrderItem();

  PurchaseOrderItems_ parentOrderItem(Function<PurchaseOrderItems_, CqnPredicate> filter);

  ElementRef<String> parentOrderItem_ID();

  ElementRef<Boolean> IsActiveEntity();

  ElementRef<Boolean> HasActiveEntity();

  ElementRef<Boolean> HasDraftEntity();

  DraftAdministrativeData_ DraftAdministrativeData();

  DraftAdministrativeData_ DraftAdministrativeData(
      Function<DraftAdministrativeData_, CqnPredicate> filter);

  ElementRef<String> DraftAdministrativeData_DraftUUID();

  ScheduleLines_ SiblingEntity();

  ScheduleLines_ SiblingEntity(Function<ScheduleLines_, CqnPredicate> filter);
}
