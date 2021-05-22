package cds.gen.tminhle.purchaseorder;

import cds.gen.tminhle.purchaseorder.companycodes.Texts_;
import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.String;
import java.util.function.Function;

@CdsName("tminhle.purchaseorder.CompanyCodes")
public interface CompanyCodes_ extends StructuredType<CompanyCodes_> {
  String CDS_NAME = "tminhle.purchaseorder.CompanyCodes";

  ElementRef<String> name();

  ElementRef<String> descr();

  ElementRef<String> code();

  Texts_ texts();

  Texts_ texts(Function<Texts_, CqnPredicate> filter);

  Texts_ localized();

  Texts_ localized(Function<Texts_, CqnPredicate> filter);
}
