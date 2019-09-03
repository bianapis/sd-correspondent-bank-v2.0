package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOutboundPaymentsExecuteOutputModel
 */
public class BQOutboundPaymentsExecuteOutputModel   {
  private String outboundPaymentsExecuteActionTaskReference = null;

  private Object outboundPaymentsExecuteActionTaskRecord = null;

  private String outboundPaymentsExecuteRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Outbound Payments instance execute service call 
   * @return outboundPaymentsExecuteActionTaskReference
  **/

  public String getOutboundPaymentsExecuteActionTaskReference() {
    return outboundPaymentsExecuteActionTaskReference;
  }

  public void setOutboundPaymentsExecuteActionTaskReference(String outboundPaymentsExecuteActionTaskReference) {
    this.outboundPaymentsExecuteActionTaskReference = outboundPaymentsExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return outboundPaymentsExecuteActionTaskRecord
  **/

  public Object getOutboundPaymentsExecuteActionTaskRecord() {
    return outboundPaymentsExecuteActionTaskRecord;
  }

  public void setOutboundPaymentsExecuteActionTaskRecord(Object outboundPaymentsExecuteActionTaskRecord) {
    this.outboundPaymentsExecuteActionTaskRecord = outboundPaymentsExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Outbound Payments execute transaction/record 
   * @return outboundPaymentsExecuteRecordReference
  **/

  public String getOutboundPaymentsExecuteRecordReference() {
    return outboundPaymentsExecuteRecordReference;
  }

  public void setOutboundPaymentsExecuteRecordReference(String outboundPaymentsExecuteRecordReference) {
    this.outboundPaymentsExecuteRecordReference = outboundPaymentsExecuteRecordReference;
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

