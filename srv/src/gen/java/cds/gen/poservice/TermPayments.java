package cds.gen.poservice;

import cds.gen.poservice.termpayments.Texts;
import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.String;
import java.util.List;
import java.util.Map;

@CdsName("POService.TermPayments")
public interface TermPayments extends CdsData {
  String NAME = "name";

  String DESCR = "descr";

  String CODE = "code";

  String TEXTS = "texts";

  String LOCALIZED = "localized";

  String getName();

  void setName(String name);

  String getDescr();

  void setDescr(String descr);

  String getCode();

  void setCode(String code);

  List<Texts> getTexts();

  void setTexts(List<? extends Map<String, ?>> texts);

  Texts getLocalized();

  void setLocalized(Map<String, ?> localized);

  TermPayments_ ref();

  static TermPayments create() {
    return Struct.create(TermPayments.class);
  }
}
