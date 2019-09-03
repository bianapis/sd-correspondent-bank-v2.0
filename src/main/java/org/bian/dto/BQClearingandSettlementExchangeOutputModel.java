package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQClearingandSettlementExchangeOutputModel
 */
public class BQClearingandSettlementExchangeOutputModel   {
  private String clearingandSettlementExchangeActionTaskReference = null;

  private Object clearingandSettlementExchangeActionTaskRecord = null;

  private String clearingandSettlementExchangeActionResponse = null;

  private String clearingandSettlementInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Clearing and Settlement instance exchange service call 
   * @return clearingandSettlementExchangeActionTaskReference
  **/

  public String getClearingandSettlementExchangeActionTaskReference() {
    return clearingandSettlementExchangeActionTaskReference;
  }

  public void setClearingandSettlementExchangeActionTaskReference(String clearingandSettlementExchangeActionTaskReference) {
    this.clearingandSettlementExchangeActionTaskReference = clearingandSettlementExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return clearingandSettlementExchangeActionTaskRecord
  **/

  public Object getClearingandSettlementExchangeActionTaskRecord() {
    return clearingandSettlementExchangeActionTaskRecord;
  }

  public void setClearingandSettlementExchangeActionTaskRecord(Object clearingandSettlementExchangeActionTaskRecord) {
    this.clearingandSettlementExchangeActionTaskRecord = clearingandSettlementExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return clearingandSettlementExchangeActionResponse
  **/

  public String getClearingandSettlementExchangeActionResponse() {
    return clearingandSettlementExchangeActionResponse;
  }

  public void setClearingandSettlementExchangeActionResponse(String clearingandSettlementExchangeActionResponse) {
    this.clearingandSettlementExchangeActionResponse = clearingandSettlementExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Clearing and Settlement instance (e.g. accepted, rejected, verified) 
   * @return clearingandSettlementInstanceStatus
  **/

  public String getClearingandSettlementInstanceStatus() {
    return clearingandSettlementInstanceStatus;
  }

  public void setClearingandSettlementInstanceStatus(String clearingandSettlementInstanceStatus) {
    this.clearingandSettlementInstanceStatus = clearingandSettlementInstanceStatus;
  }


}

