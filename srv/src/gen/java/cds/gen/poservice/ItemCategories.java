package cds.gen.poservice;

import cds.gen.poservice.itemcategories.Texts;
import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.String;
import java.util.List;
import java.util.Map;

@CdsName("POService.ItemCategories")
public interface ItemCategories extends CdsData {
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

  ItemCategories_ ref();

  static ItemCategories create() {
    return Struct.create(ItemCategories.class);
  }
}
