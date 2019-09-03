package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQClearingandSettlementExchangeInputModelClearingandSettlementExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQClearingandSettlementExchangeInputModel
 */
public class BQClearingandSettlementExchangeInputModel   {
  private String correspondentBankFulfillmentArrangementInstanceReference = null;

  private String clearingandSettlementInstanceReference = null;

  private Object clearingandSettlementExchangeActionTaskRecord = null;

  private BQClearingandSettlementExchangeInputModelClearingandSettlementExchangeActionRequest clearingandSettlementExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Correspondent Bank Fulfillment Arrangement instance 
   * @return correspondentBankFulfillmentArrangementInstanceReference
  **/

  public String getCorrespondentBankFulfillmentArrangementInstanceReference() {
    return correspondentBankFulfillmentArrangementInstanceReference;
  }

  public void setCorrespondentBankFulfillmentArrangementInstanceReference(String correspondentBankFulfillmentArrangementInstanceReference) {
    this.correspondentBankFulfillmentArrangementInstanceReference = correspondentBankFulfillmentArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Clearing and Settlement instance 
   * @return clearingandSettlementInstanceReference
  **/

  public String getClearingandSettlementInstanceReference() {
    return clearingandSettlementInstanceReference;
  }

  public void setClearingandSettlementInstanceReference(String clearingandSettlementInstanceReference) {
    this.clearingandSettlementInstanceReference = clearingandSettlementInstanceReference;
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
   * Get clearingandSettlementExchangeActionRequest
   * @return clearingandSettlementExchangeActionRequest
  **/

  public BQClearingandSettlementExchangeInputModelClearingandSettlementExchangeActionRequest getClearingandSettlementExchangeActionRequest() {
    return clearingandSettlementExchangeActionRequest;
  }

  public void setClearingandSettlementExchangeActionRequest(BQClearingandSettlementExchangeInputModelClearingandSettlementExchangeActionRequest clearingandSettlementExchangeActionRequest) {
    this.clearingandSettlementExchangeActionRequest = clearingandSettlementExchangeActionRequest;
  }


}

