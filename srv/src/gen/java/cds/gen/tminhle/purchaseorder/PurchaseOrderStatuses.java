package cds.gen.tminhle.purchaseorder;

import cds.gen.tminhle.purchaseorder.purchaseorderstatuses.Texts;
import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.String;
import java.time.Instant;
import java.util.List;
import java.util.Map;

@CdsName("tminhle.purchaseorder.PurchaseOrderStatuses")
public interface PurchaseOrderStatuses extends CdsData {
  String CREATED_AT = "createdAt";

  String CREATED_BY = "createdBy";

  String MODIFIED_AT = "modifiedAt";

  String MODIFIED_BY = "modifiedBy";

  String NAME = "name";

  String DESCR = "descr";

  String CODE = "code";

  String TEXTS = "texts";

  String LOCALIZED = "localized";

  Instant getCreatedAt();

  void setCreatedAt(Instant createdAt);

  String getCreatedBy();

  void setCreatedBy(String createdBy);

  Instant getModifiedAt();

  void setModifiedAt(Instant modifiedAt);

  String getModifiedBy();

  void setModifiedBy(String modifiedBy);

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

  PurchaseOrderStatuses_ ref();

  static PurchaseOrderStatuses create() {
    return Struct.create(PurchaseOrderStatuses.class);
  }
}
