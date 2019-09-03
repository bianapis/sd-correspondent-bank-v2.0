package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQReconciliationsUpdateInputModelReconciliationsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQReconciliationsUpdateInputModel
 */
public class BQReconciliationsUpdateInputModel   {
  private String correspondentBankFulfillmentArrangementInstanceReference = null;

  private String reconciliationsInstanceReference = null;

  private BQReconciliationsUpdateInputModelReconciliationsInstanceRecord reconciliationsInstanceRecord = null;

  private Object reconciliationsUpdateActionTaskRecord = null;

  private String reconciliationsUpdateActionRequest = null;


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
   * Get reconciliationsInstanceRecord
   * @return reconciliationsInstanceRecord
  **/

  public BQReconciliationsUpdateInputModelReconciliationsInstanceRecord getReconciliationsInstanceRecord() {
    return reconciliationsInstanceRecord;
  }

  public void setReconciliationsInstanceRecord(BQReconciliationsUpdateInputModelReconciliationsInstanceRecord reconciliationsInstanceRecord) {
    this.reconciliationsInstanceRecord = reconciliationsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return reconciliationsUpdateActionTaskRecord
  **/

  public Object getReconciliationsUpdateActionTaskRecord() {
    return reconciliationsUpdateActionTaskRecord;
  }

  public void setReconciliationsUpdateActionTaskRecord(Object reconciliationsUpdateActionTaskRecord) {
    this.reconciliationsUpdateActionTaskRecord = reconciliationsUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return reconciliationsUpdateActionRequest
  **/

  public String getReconciliationsUpdateActionRequest() {
    return reconciliationsUpdateActionRequest;
  }

  public void setReconciliationsUpdateActionRequest(String reconciliationsUpdateActionRequest) {
    this.reconciliationsUpdateActionRequest = reconciliationsUpdateActionRequest;
  }


}

