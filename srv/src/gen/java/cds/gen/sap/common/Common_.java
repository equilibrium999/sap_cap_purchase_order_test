package cds.gen.sap.common;

import com.sap.cds.ql.CdsName;
import java.lang.Class;
import java.lang.String;

@CdsName("sap.common")
public interface Common_ {
  String CDS_NAME = "sap.common";

  Class<Languages_> LANGUAGES = Languages_.class;

  Class<Countries_> COUNTRIES = Countries_.class;

  Class<Currencies_> CURRENCIES = Currencies_.class;
}
