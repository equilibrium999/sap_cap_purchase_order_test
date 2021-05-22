package cds.gen.poservice;

import cds.gen.poservice.currencies.Texts_;
import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.String;
import java.util.function.Function;

@CdsName("POService.Currencies")
public interface Currencies_ extends StructuredType<Currencies_> {
  String CDS_NAME = "POService.Currencies";

  ElementRef<String> name();

  ElementRef<String> descr();

  ElementRef<String> code();

  ElementRef<String> symbol();

  Texts_ texts();

  Texts_ texts(Function<Texts_, CqnPredicate> filter);

  Texts_ localized();

  Texts_ localized(Function<Texts_, CqnPredicate> filter);
}
