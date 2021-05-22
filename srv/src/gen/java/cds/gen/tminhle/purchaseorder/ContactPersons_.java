package cds.gen.tminhle.purchaseorder;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.String;

@CdsName("tminhle.purchaseorder.ContactPersons")
public interface ContactPersons_ extends StructuredType<ContactPersons_> {
  String CDS_NAME = "tminhle.purchaseorder.ContactPersons";

  ElementRef<String> code();

  ElementRef<String> name();

  ElementRef<String> faxNumber();

  ElementRef<String> telNumber();

  ElementRef<String> email();
}
