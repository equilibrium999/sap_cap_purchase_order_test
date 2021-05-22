package cds.gen.poservice.itemcategories;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.String;

@CdsName("POService.ItemCategories.texts")
public interface Texts_ extends StructuredType<Texts_> {
  String CDS_NAME = "POService.ItemCategories.texts";

  ElementRef<String> locale();

  ElementRef<String> name();

  ElementRef<String> descr();

  ElementRef<String> code();
}
