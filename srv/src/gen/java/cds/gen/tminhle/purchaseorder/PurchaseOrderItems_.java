package cds.gen.tminhle.purchaseorder;

import cds.gen.sap.common.Currencies_;
import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Integer;
import java.lang.String;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.function.Function;

@CdsName("tminhle.purchaseorder.PurchaseOrderItems")
public interface PurchaseOrderItems_ extends StructuredType<PurchaseOrderItems_> {
  String CDS_NAME = "tminhle.purchaseorder.PurchaseOrderItems";

  ElementRef<String> ID();

  ElementRef<Instant> createdAt();

  ElementRef<String> createdBy();

  ElementRef<Instant> modifiedAt();

  ElementRef<String> modifiedBy();

  ElementRef<String> purchaseOrder();

  ElementRef<Integer> purchaseOrderVersion();

  ElementRef<Integer> purchaseOrderItem();

  ItemCategories_ purchaseOrderItemCat();

  ItemCategories_ purchaseOrderItemCat(Function<ItemCategories_, CqnPredicate> filter);

  ElementRef<String> purchaseOrderItemCat_code();

  Materials_ material();

  Materials_ material(Function<Materials_, CqnPredicate> filter);

  ElementRef<String> material_code();

  MaterialGroups_ materialGroup();

  MaterialGroups_ materialGroup(Function<MaterialGroups_, CqnPredicate> filter);

  ElementRef<String> materialGroup_code();

  Plants_ plant();

  Plants_ plant(Function<Plants_, CqnPredicate> filter);

  ElementRef<String> plant_code();

  Materials_ supplierMaterial();

  Materials_ supplierMaterial(Function<Materials_, CqnPredicate> filter);

  ElementRef<String> supplierMaterial_code();

  ElementRef<BigDecimal> orderQuantity();

  ElementRef<String> quantityUnit();

  ElementRef<BigDecimal> orderPrice();

  Currencies_ documentCurrency();

  Currencies_ documentCurrency(Function<Currencies_, CqnPredicate> filter);

  ElementRef<String> documentCurrency_code();

  ElementRef<BigDecimal> priceUnit();

  ElementRef<BigDecimal> netValue();

  ElementRef<BigDecimal> grossValue();

  ElementRef<LocalDate> dateOfDelivery();

  ElementRef<String> scheduleLineInc();

  ElementRef<String> confirmationOrder();

  ElementRef<String> confirmationInc();

  ElementRef<BigDecimal> confirmedQuantity();

  ElementRef<BigDecimal> confirmedPrice();

  ElementRef<LocalDate> confirmedDateOfDelivery();

  ElementRef<String> goodReceipt();

  ElementRef<String> unloadingPoint();

  ElementRef<String> incoTermVerion();

  ElementRef<String> incoTermClassification();

  ElementRef<String> incoTermLocation1();

  ElementRef<String> incoTermLocation2();

  ElementRef<String> longPlainText();

  Addresses_ deliveryAddress();

  Addresses_ deliveryAddress(Function<Addresses_, CqnPredicate> filter);

  ElementRef<String> deliveryAddress_code();

  PurchaseOrders_ parentPurchaseOrder();

  PurchaseOrders_ parentPurchaseOrder(Function<PurchaseOrders_, CqnPredicate> filter);

  ElementRef<String> parentPurchaseOrder_ID();

  Attachments_ attachments();

  Attachments_ attachments(Function<Attachments_, CqnPredicate> filter);

  ScheduleLines_ scheduleLines();

  ScheduleLines_ scheduleLines(Function<ScheduleLines_, CqnPredicate> filter);
}
