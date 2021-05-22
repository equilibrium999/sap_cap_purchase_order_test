package cds.gen.tminhle.purchaseorder;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.String;

@CdsName("tminhle.purchaseorder.Addresses")
public interface Addresses extends CdsData {
  String CODE = "code";

  String ADDRESS_NAME = "addressName";

  String CITY_NAME = "cityName";

  String FAX_NUMBER = "faxNumber";

  String HOUSE_NUMBER = "houseNumber";

  String POSTAL_CODE = "postalCode";

  String STREET_NAME = "streetName";

  String PHONE_NUMBER = "phoneNumber";

  String REGION = "region";

  String COUNTRY = "country";

  String getCode();

  void setCode(String code);

  String getAddressName();

  void setAddressName(String addressName);

  String getCityName();

  void setCityName(String cityName);

  String getFaxNumber();

  void setFaxNumber(String faxNumber);

  String getHouseNumber();

  void setHouseNumber(String houseNumber);

  String getPostalCode();

  void setPostalCode(String postalCode);

  String getStreetName();

  void setStreetName(String streetName);

  String getPhoneNumber();

  void setPhoneNumber(String phoneNumber);

  String getRegion();

  void setRegion(String region);

  String getCountry();

  void setCountry(String country);

  Addresses_ ref();

  static Addresses create() {
    return Struct.create(Addresses.class);
  }
}
