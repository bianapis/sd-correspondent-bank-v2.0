package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInboundPaymentsExecuteOutputModel
 */
public class BQInboundPaymentsExecuteOutputModel   {
  private String inboundPaymentsExecuteActionTaskReference = null;

  private Object inboundPaymentsExecuteActionTaskRecord = null;

  private String inboundPaymentsExecuteRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Inbound Payments instance execute service call 
   * @return inboundPaymentsExecuteActionTaskReference
  **/

  public String getInboundPaymentsExecuteActionTaskReference() {
    return inboundPaymentsExecuteActionTaskReference;
  }

  public void setInboundPaymentsExecuteActionTaskReference(String inboundPaymentsExecuteActionTaskReference) {
    this.inboundPaymentsExecuteActionTaskReference = inboundPaymentsExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return inboundPaymentsExecuteActionTaskRecord
  **/

  public Object getInboundPaymentsExecuteActionTaskRecord() {
    return inboundPaymentsExecuteActionTaskRecord;
  }

  public void setInboundPaymentsExecuteActionTaskRecord(Object inboundPaymentsExecuteActionTaskRecord) {
    this.inboundPaymentsExecuteActionTaskRecord = inboundPaymentsExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Inbound Payments execute transaction/record 
   * @return inboundPaymentsExecuteRecordReference
  **/

  public String getInboundPaymentsExecuteRecordReference() {
    return inboundPaymentsExecuteRecordReference;
  }

  public void setInboundPaymentsExecuteRecordReference(String inboundPaymentsExecuteRecordReference) {
    this.inboundPaymentsExecuteRecordReference = inboundPaymentsExecuteRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

