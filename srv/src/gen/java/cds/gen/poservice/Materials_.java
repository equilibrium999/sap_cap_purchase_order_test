package cds.gen.poservice;

import cds.gen.poservice.materials.Texts_;
import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.String;
import java.util.function.Function;

@CdsName("POService.Materials")
public interface Materials_ extends StructuredType<Materials_> {
  String CDS_NAME = "POService.Materials";

  ElementRef<String> name();

  ElementRef<String> descr();

  ElementRef<String> code();

  Texts_ texts();

  Texts_ texts(Function<Texts_, CqnPredicate> filter);

  Texts_ localized();

  Texts_ localized(Function<Texts_, CqnPredicate> filter);
}
