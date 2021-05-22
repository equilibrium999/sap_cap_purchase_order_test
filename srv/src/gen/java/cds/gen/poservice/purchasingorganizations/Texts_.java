package cds.gen.poservice.purchasingorganizations;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.String;

@CdsName("POService.PurchasingOrganizations.texts")
public interface Texts_ extends StructuredType<Texts_> {
  String CDS_NAME = "POService.PurchasingOrganizations.texts";

  ElementRef<String> locale();

  ElementRef<String> name();

  ElementRef<String> descr();

  ElementRef<String> code();
}
