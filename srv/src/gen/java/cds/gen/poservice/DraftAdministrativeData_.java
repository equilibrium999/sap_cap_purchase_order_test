package cds.gen.poservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.Boolean;
import java.lang.String;
import java.time.Instant;

@CdsName("POService.DraftAdministrativeData")
public interface DraftAdministrativeData_ extends StructuredType<DraftAdministrativeData_> {
  String CDS_NAME = "POService.DraftAdministrativeData";

  ElementRef<String> DraftUUID();

  ElementRef<Instant> CreationDateTime();

  ElementRef<String> CreatedByUser();

  ElementRef<Boolean> DraftIsCreatedByMe();

  ElementRef<Instant> LastChangeDateTime();

  ElementRef<String> LastChangedByUser();

  ElementRef<String> InProcessByUser();

  ElementRef<Boolean> DraftIsProcessedByMe();
}
