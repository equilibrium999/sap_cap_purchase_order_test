package cds.gen.tminhle.purchaseorder;

import com.sap.cds.ql.CdsName;
import java.lang.Class;
import java.lang.String;

@CdsName("tminhle.purchaseorder")
public interface Purchaseorder_ {
  String CDS_NAME = "tminhle.purchaseorder";

  Class<ScheduleLines_> SCHEDULE_LINES = ScheduleLines_.class;

  Class<Materials_> MATERIALS = Materials_.class;

  Class<ContactPersons_> CONTACT_PERSONS = ContactPersons_.class;

  Class<PurchaseOrders_> PURCHASE_ORDERS = PurchaseOrders_.class;

  Class<Addresses_> ADDRESSES = Addresses_.class;

  Class<PurchasingGroups_> PURCHASING_GROUPS = PurchasingGroups_.class;

  Class<Plants_> PLANTS = Plants_.class;

  Class<PurchaseOrderStatuses_> PURCHASE_ORDER_STATUSES = PurchaseOrderStatuses_.class;

  Class<ItemCategories_> ITEM_CATEGORIES = ItemCategories_.class;

  Class<TermPayments_> TERM_PAYMENTS = TermPayments_.class;

  Class<CompanyCodes_> COMPANY_CODES = CompanyCodes_.class;

  Class<Attachments_> ATTACHMENTS = Attachments_.class;

  Class<PurchasingOrganizations_> PURCHASING_ORGANIZATIONS = PurchasingOrganizations_.class;

  Class<PurchaseOrderItems_> PURCHASE_ORDER_ITEMS = PurchaseOrderItems_.class;

  Class<MaterialGroups_> MATERIAL_GROUPS = MaterialGroups_.class;
}
