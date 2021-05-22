package cds.gen.poservice;

import cds.gen.tminhle.purchaseorder.ContactPersons_;
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

@CdsName("POService.PurchaseOrders")
public interface PurchaseOrders_ extends StructuredType<PurchaseOrders_> {
  String CDS_NAME = "POService.PurchaseOrders";

  ElementRef<String> ID();

  ElementRef<Instant> createdAt();

  ElementRef<String> createdBy();

  ElementRef<Instant> modifiedAt();

  ElementRef<String> modifiedBy();

  ElementRef<String> purchaseOrder();

  ElementRef<Integer> purchaseOrderVersion();

  ElementRef<String> purchaseOrderDesc();

  PurchaseOrderStatuses_ purchaseOrderStatus();

  PurchaseOrderStatuses_ purchaseOrderStatus(Function<PurchaseOrderStatuses_, CqnPredicate> filter);

  ElementRef<String> purchaseOrderStatus_code();

  ElementRef<LocalDate> purchaseOrderDate();

  ElementRef<String> title();

  Languages_ language();

  Languages_ language(Function<Languages_, CqnPredicate> filter);

  ElementRef<String> language_code();

  ElementRef<String> supplier();

  ElementRef<String> supplierName();

  Addresses_ supplierAddress();

  Addresses_ supplierAddress(Function<Addresses_, CqnPredicate> filter);

  ElementRef<String> supplierAddress_code();

  ElementRef<BigDecimal> totalAmount();

  Currencies_ documentCurrency();

  Currencies_ documentCurrency(Function<Currencies_, CqnPredicate> filter);

  ElementRef<String> documentCurrency_code();

  ElementRef<BigDecimal> exchangeRate();

  PurchasingOrganizations_ purchasingOrganization();

  PurchasingOrganizations_ purchasingOrganization(
      Function<PurchasingOrganizations_, CqnPredicate> filter);

  ElementRef<String> purchasingOrganization_code();

  PurchasingGroups_ purchasingGroup();

  PurchasingGroups_ purchasingGroup(Function<PurchasingGroups_, CqnPredicate> filter);

  ElementRef<String> purchasingGroup_code();

  CompanyCodes_ companyCode();

  CompanyCodes_ companyCode(Function<CompanyCodes_, CqnPredicate> filter);

  ElementRef<String> companyCode_code();

  ElementRef<String> orderConfirmation();

  ElementRef<String> incoTermVerion();

  ElementRef<String> incoTermClassification();

  ElementRef<String> incoTermLocation1();

  ElementRef<String> incoTermLocation2();

  TermPayments_ termOfPayment();

  TermPayments_ termOfPayment(Function<TermPayments_, CqnPredicate> filter);

  ElementRef<String> termOfPayment_code();

  ElementRef<BigDecimal> netPaymentTerm();

  ElementRef<BigDecimal> cashDiscount1Days();

  ElementRef<BigDecimal> cashDiscount1Percent();

  ElementRef<BigDecimal> cashDiscount2Days();

  ElementRef<BigDecimal> cashDiscount2Percent();

  ElementRef<LocalDate> dateOfDelivery();

  ElementRef<LocalDate> startPeriod();

  ElementRef<LocalDate> endPeriod();

  ElementRef<String> plainLongText();

  ContactPersons_ contactPerson();

  ContactPersons_ contactPerson(Function<ContactPersons_, CqnPredicate> filter);

  ElementRef<String> contactPerson_code();

  Addresses_ deliveryAddress();

  Addresses_ deliveryAddress(Function<Addresses_, CqnPredicate> filter);

  ElementRef<String> deliveryAddress_code();

  Attachments_ attachments();

  Attachments_ attachments(Function<Attachments_, CqnPredicate> filter);

  PurchaseOrderItems_ items();

  PurchaseOrderItems_ items(Function<PurchaseOrderItems_, CqnPredicate> filter);

  ElementRef<Boolean> IsActiveEntity();

  ElementRef<Boolean> HasActiveEntity();

  ElementRef<Boolean> HasDraftEntity();

  DraftAdministrativeData_ DraftAdministrativeData();

  DraftAdministrativeData_ DraftAdministrativeData(
      Function<DraftAdministrativeData_, CqnPredicate> filter);

  ElementRef<String> DraftAdministrativeData_DraftUUID();

  PurchaseOrders_ SiblingEntity();

  PurchaseOrders_ SiblingEntity(Function<PurchaseOrders_, CqnPredicate> filter);
}
