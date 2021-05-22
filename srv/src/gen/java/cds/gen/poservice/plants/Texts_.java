package cds.gen.poservice.plants;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.String;

@CdsName("POService.Plants.texts")
public interface Texts_ extends StructuredType<Texts_> {
  String CDS_NAME = "POService.Plants.texts";

  ElementRef<String> locale();

  ElementRef<String> name();

  ElementRef<String> descr();

  ElementRef<String> code();
}
