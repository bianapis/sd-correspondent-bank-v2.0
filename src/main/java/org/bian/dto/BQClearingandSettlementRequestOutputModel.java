package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQClearingandSettlementRequestOutputModel
 */
public class BQClearingandSettlementRequestOutputModel   {
  private String clearingandSettlementRequestActionTaskReference = null;

  private Object clearingandSettlementRequestActionTaskRecord = null;

  private String clearingandSettlementRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Clearing and Settlement instance request service call 
   * @return clearingandSettlementRequestActionTaskReference
  **/

  public String getClearingandSettlementRequestActionTaskReference() {
    return clearingandSettlementRequestActionTaskReference;
  }

  public void setClearingandSettlementRequestActionTaskReference(String clearingandSettlementRequestActionTaskReference) {
    this.clearingandSettlementRequestActionTaskReference = clearingandSettlementRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return clearingandSettlementRequestActionTaskRecord
  **/

  public Object getClearingandSettlementRequestActionTaskRecord() {
    return clearingandSettlementRequestActionTaskRecord;
  }

  public void setClearingandSettlementRequestActionTaskRecord(Object clearingandSettlementRequestActionTaskRecord) {
    this.clearingandSettlementRequestActionTaskRecord = clearingandSettlementRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Clearing and Settlement service request record 
   * @return clearingandSettlementRequestRecordReference
  **/

  public String getClearingandSettlementRequestRecordReference() {
    return clearingandSettlementRequestRecordReference;
  }

  public void setClearingandSettlementRequestRecordReference(String clearingandSettlementRequestRecordReference) {
    this.clearingandSettlementRequestRecordReference = clearingandSettlementRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

