package cds.gen.tminhle.purchaseorder.companycodes;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.String;

@CdsName("tminhle.purchaseorder.CompanyCodes.texts")
public interface Texts_ extends StructuredType<Texts_> {
  String CDS_NAME = "tminhle.purchaseorder.CompanyCodes.texts";

  ElementRef<String> locale();

  ElementRef<String> name();

  ElementRef<String> descr();

  ElementRef<String> code();
}
