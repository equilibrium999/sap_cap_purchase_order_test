package cds.gen.poservice;

import com.sap.cds.ql.CdsName;
import java.lang.Class;
import java.lang.String;

@CdsName("POService")
public interface POService_ {
  String CDS_NAME = "POService";

  Class<Currencies_> CURRENCIES = Currencies_.class;

  Class<Addresses_> ADDRESSES = Addresses_.class;

  Class<PurchasingOrganizations_> PURCHASING_ORGANIZATIONS = PurchasingOrganizations_.class;

  Class<Plants_> PLANTS = Plants_.class;

  Class<ItemCategories_> ITEM_CATEGORIES = ItemCategories_.class;

  Class<CompanyCodes_> COMPANY_CODES = CompanyCodes_.class;

  Class<PurchaseOrderItems_> PURCHASE_ORDER_ITEMS = PurchaseOrderItems_.class;

  Class<ScheduleLines_> SCHEDULE_LINES = ScheduleLines_.class;

  Class<PurchasingGroups_> PURCHASING_GROUPS = PurchasingGroups_.class;

  Class<MaterialGroups_> MATERIAL_GROUPS = MaterialGroups_.class;

  Class<PurchaseOrders_> PURCHASE_ORDERS = PurchaseOrders_.class;

  Class<DraftAdministrativeData_> DRAFT_ADMINISTRATIVE_DATA = DraftAdministrativeData_.class;

  Class<TermPayments_> TERM_PAYMENTS = TermPayments_.class;

  Class<Languages_> LANGUAGES = Languages_.class;

  Class<PurchaseOrderStatuses_> PURCHASE_ORDER_STATUSES = PurchaseOrderStatuses_.class;

  Class<Materials_> MATERIALS = Materials_.class;

  Class<Attachments_> ATTACHMENTS = Attachments_.class;
}
