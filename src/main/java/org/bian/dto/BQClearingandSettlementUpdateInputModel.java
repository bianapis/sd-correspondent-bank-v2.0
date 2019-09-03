package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQClearingandSettlementUpdateInputModelClearingandSettlementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQClearingandSettlementUpdateInputModel
 */
public class BQClearingandSettlementUpdateInputModel   {
  private String correspondentBankFulfillmentArrangementInstanceReference = null;

  private String clearingandSettlementInstanceReference = null;

  private BQClearingandSettlementUpdateInputModelClearingandSettlementInstanceRecord clearingandSettlementInstanceRecord = null;

  private Object clearingandSettlementUpdateActionTaskRecord = null;

  private String clearingandSettlementUpdateActionRequest = null;


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
   * Get clearingandSettlementInstanceRecord
   * @return clearingandSettlementInstanceRecord
  **/

  public BQClearingandSettlementUpdateInputModelClearingandSettlementInstanceRecord getClearingandSettlementInstanceRecord() {
    return clearingandSettlementInstanceRecord;
  }

  public void setClearingandSettlementInstanceRecord(BQClearingandSettlementUpdateInputModelClearingandSettlementInstanceRecord clearingandSettlementInstanceRecord) {
    this.clearingandSettlementInstanceRecord = clearingandSettlementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return clearingandSettlementUpdateActionTaskRecord
  **/

  public Object getClearingandSettlementUpdateActionTaskRecord() {
    return clearingandSettlementUpdateActionTaskRecord;
  }

  public void setClearingandSettlementUpdateActionTaskRecord(Object clearingandSettlementUpdateActionTaskRecord) {
    this.clearingandSettlementUpdateActionTaskRecord = clearingandSettlementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return clearingandSettlementUpdateActionRequest
  **/

  public String getClearingandSettlementUpdateActionRequest() {
    return clearingandSettlementUpdateActionRequest;
  }

  public void setClearingandSettlementUpdateActionRequest(String clearingandSettlementUpdateActionRequest) {
    this.clearingandSettlementUpdateActionRequest = clearingandSettlementUpdateActionRequest;
  }


}

