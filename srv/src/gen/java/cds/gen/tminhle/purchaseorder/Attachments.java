package cds.gen.tminhle.purchaseorder;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;

@CdsName("tminhle.purchaseorder.Attachments")
public interface Attachments extends CdsData {
  String ID = "ID";

  String PURCHASE_ORDER = "purchaseOrder";

  String PURCHASE_ORDER_VERSION = "purchaseOrderVersion";

  String PURCHASE_ORDER_ITEM = "purchaseOrderItem";

  String FILE_ID = "fileId";

  String FILE_NAME = "fileName";

  String FILE_SIZE = "fileSize";

  String MIME_TYPE = "mimeType";

  String PARENT_PURCHASE_ORDER = "parentPurchaseOrder";

  String PARENT_PURCHASE_ORDER_ID = "parentPurchaseOrder_ID";

  String PARENT_ORDER_ITEM = "parentOrderItem";

  String PARENT_ORDER_ITEM_ID = "parentOrderItem_ID";

  @CdsName(ID)
  String getId();

  @CdsName(ID)
  void setId(String id);

  String getPurchaseOrder();

  void setPurchaseOrder(String purchaseOrder);

  Integer getPurchaseOrderVersion();

  void setPurchaseOrderVersion(Integer purchaseOrderVersion);

  Integer getPurchaseOrderItem();

  void setPurchaseOrderItem(Integer purchaseOrderItem);

  String getFileId();

  void setFileId(String fileId);

  String getFileName();

  void setFileName(String fileName);

  Integer getFileSize();

  void setFileSize(Integer fileSize);

  String getMimeType();

  void setMimeType(String mimeType);

  PurchaseOrders getParentPurchaseOrder();

  void setParentPurchaseOrder(Map<String, ?> parentPurchaseOrder);

  @CdsName(PARENT_PURCHASE_ORDER_ID)
  String getParentPurchaseOrderId();

  @CdsName(PARENT_PURCHASE_ORDER_ID)
  void setParentPurchaseOrderId(String parentPurchaseOrderId);

  PurchaseOrderItems getParentOrderItem();

  void setParentOrderItem(Map<String, ?> parentOrderItem);

  @CdsName(PARENT_ORDER_ITEM_ID)
  String getParentOrderItemId();

  @CdsName(PARENT_ORDER_ITEM_ID)
  void setParentOrderItemId(String parentOrderItemId);

  Attachments_ ref();

  static Attachments create() {
    return Struct.create(Attachments.class);
  }
}
