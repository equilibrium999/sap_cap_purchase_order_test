package cds.gen.tminhle.purchaseorder;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Integer;
import java.lang.String;
import java.util.function.Function;

@CdsName("tminhle.purchaseorder.Attachments")
public interface Attachments_ extends StructuredType<Attachments_> {
  String CDS_NAME = "tminhle.purchaseorder.Attachments";

  ElementRef<String> ID();

  ElementRef<String> purchaseOrder();

  ElementRef<Integer> purchaseOrderVersion();

  ElementRef<Integer> purchaseOrderItem();

  ElementRef<String> fileId();

  ElementRef<String> fileName();

  ElementRef<Integer> fileSize();

  ElementRef<String> mimeType();

  PurchaseOrders_ parentPurchaseOrder();

  PurchaseOrders_ parentPurchaseOrder(Function<PurchaseOrders_, CqnPredicate> filter);

  ElementRef<String> parentPurchaseOrder_ID();

  PurchaseOrderItems_ parentOrderItem();

  PurchaseOrderItems_ parentOrderItem(Function<PurchaseOrderItems_, CqnPredicate> filter);

  ElementRef<String> parentOrderItem_ID();
}
