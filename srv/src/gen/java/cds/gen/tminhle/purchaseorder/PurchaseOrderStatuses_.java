package cds.gen.tminhle.purchaseorder;

import cds.gen.tminhle.purchaseorder.purchaseorderstatuses.Texts_;
import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.String;
import java.time.Instant;
import java.util.function.Function;

@CdsName("tminhle.purchaseorder.PurchaseOrderStatuses")
public interface PurchaseOrderStatuses_ extends StructuredType<PurchaseOrderStatuses_> {
  String CDS_NAME = "tminhle.purchaseorder.PurchaseOrderStatuses";

  ElementRef<Instant> createdAt();

  ElementRef<String> createdBy();

  ElementRef<Instant> modifiedAt();

  ElementRef<String> modifiedBy();

  ElementRef<String> name();

  ElementRef<String> descr();

  ElementRef<String> code();

  Texts_ texts();

  Texts_ texts(Function<Texts_, CqnPredicate> filter);

  Texts_ localized();

  Texts_ localized(Function<Texts_, CqnPredicate> filter);
}
