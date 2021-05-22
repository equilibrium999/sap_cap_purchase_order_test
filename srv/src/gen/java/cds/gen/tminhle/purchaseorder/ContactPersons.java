package cds.gen.tminhle.purchaseorder;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.String;

@CdsName("tminhle.purchaseorder.ContactPersons")
public interface ContactPersons extends CdsData {
  String CODE = "code";

  String NAME = "name";

  String FAX_NUMBER = "faxNumber";

  String TEL_NUMBER = "telNumber";

  String EMAIL = "email";

  String getCode();

  void setCode(String code);

  String getName();

  void setName(String name);

  String getFaxNumber();

  void setFaxNumber(String faxNumber);

  String getTelNumber();

  void setTelNumber(String telNumber);

  String getEmail();

  void setEmail(String email);

  ContactPersons_ ref();

  static ContactPersons create() {
    return Struct.create(ContactPersons.class);
  }
}
