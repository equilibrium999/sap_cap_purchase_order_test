package cds.gen.tminhle.purchaseorder;

import cds.gen.tminhle.purchaseorder.materialgroups.Texts_;
import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.String;
import java.util.function.Function;

@CdsName("tminhle.purchaseorder.MaterialGroups")
public interface MaterialGroups_ extends StructuredType<MaterialGroups_> {
  String CDS_NAME = "tminhle.purchaseorder.MaterialGroups";

  ElementRef<String> name();

  ElementRef<String> descr();

  ElementRef<String> code();

  Texts_ texts();

  Texts_ texts(Function<Texts_, CqnPredicate> filter);

  Texts_ localized();

  Texts_ localized(Function<Texts_, CqnPredicate> filter);
}
