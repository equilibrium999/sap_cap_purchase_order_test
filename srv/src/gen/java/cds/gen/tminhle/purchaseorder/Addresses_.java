package cds.gen.tminhle.purchaseorder;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.String;

@CdsName("tminhle.purchaseorder.Addresses")
public interface Addresses_ extends StructuredType<Addresses_> {
  String CDS_NAME = "tminhle.purchaseorder.Addresses";

  ElementRef<String> code();

  ElementRef<String> addressName();

  ElementRef<String> cityName();

  ElementRef<String> faxNumber();

  ElementRef<String> houseNumber();

  ElementRef<String> postalCode();

  ElementRef<String> streetName();

  ElementRef<String> phoneNumber();

  ElementRef<String> region();

  ElementRef<String> country();
}
