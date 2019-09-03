package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQClearingandSettlementExchangeInputModelClearingandSettlementExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQReconciliationsExchangeInputModel
 */
public class BQReconciliationsExchangeInputModel   {
  private String correspondentBankFulfillmentArrangementInstanceReference = null;

  private String reconciliationsInstanceReference = null;

  private Object reconciliationsExchangeActionTaskRecord = null;

  private BQClearingandSettlementExchangeInputModelClearingandSettlementExchangeActionRequest reconciliationsExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Reconciliations instance 
   * @return reconciliationsInstanceReference
  **/

  public String getReconciliationsInstanceReference() {
    return reconciliationsInstanceReference;
  }

  public void setReconciliationsInstanceReference(String reconciliationsInstanceReference) {
    this.reconciliationsInstanceReference = reconciliationsInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return reconciliationsExchangeActionTaskRecord
  **/

  public Object getReconciliationsExchangeActionTaskRecord() {
    return reconciliationsExchangeActionTaskRecord;
  }

  public void setReconciliationsExchangeActionTaskRecord(Object reconciliationsExchangeActionTaskRecord) {
    this.reconciliationsExchangeActionTaskRecord = reconciliationsExchangeActionTaskRecord;
  }


  /**
   * Get reconciliationsExchangeActionRequest
   * @return reconciliationsExchangeActionRequest
  **/

  public BQClearingandSettlementExchangeInputModelClearingandSettlementExchangeActionRequest getReconciliationsExchangeActionRequest() {
    return reconciliationsExchangeActionRequest;
  }

  public void setReconciliationsExchangeActionRequest(BQClearingandSettlementExchangeInputModelClearingandSettlementExchangeActionRequest reconciliationsExchangeActionRequest) {
    this.reconciliationsExchangeActionRequest = reconciliationsExchangeActionRequest;
  }


}

