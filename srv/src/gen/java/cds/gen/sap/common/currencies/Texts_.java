package cds.gen.sap.common.currencies;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.String;

@CdsName("sap.common.Currencies.texts")
public interface Texts_ extends StructuredType<Texts_> {
  String CDS_NAME = "sap.common.Currencies.texts";

  ElementRef<String> locale();

  ElementRef<String> name();

  ElementRef<String> descr();

  ElementRef<String> code();
}
