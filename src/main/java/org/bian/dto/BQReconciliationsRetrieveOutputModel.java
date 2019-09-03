package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQReconciliationsRetrieveOutputModelCorrespondentBankFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQReconciliationsRetrieveOutputModelReconciliationsInstanceAnalysis;
import org.bian.dto.BQReconciliationsRetrieveOutputModelReconciliationsInstanceRecord;
import org.bian.dto.BQReconciliationsRetrieveOutputModelReconciliationsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQReconciliationsRetrieveOutputModel
 */
public class BQReconciliationsRetrieveOutputModel   {
  private BQReconciliationsRetrieveOutputModelCorrespondentBankFulfillmentArrangementInstanceRecord correspondentBankFulfillmentArrangementInstanceRecord = null;

  private BQReconciliationsRetrieveOutputModelReconciliationsInstanceRecord reconciliationsInstanceRecord = null;

  private String reconciliationsRetrieveActionTaskReference = null;

  private Object reconciliationsRetrieveActionTaskRecord = null;

  private String reconciliationsRetrieveActionResponse = null;

  private BQReconciliationsRetrieveOutputModelReconciliationsInstanceReport reconciliationsInstanceReport = null;

  private BQReconciliationsRetrieveOutputModelReconciliationsInstanceAnalysis reconciliationsInstanceAnalysis = null;


  /**
   * Get correspondentBankFulfillmentArrangementInstanceRecord
   * @return correspondentBankFulfillmentArrangementInstanceRecord
  **/

  public BQReconciliationsRetrieveOutputModelCorrespondentBankFulfillmentArrangementInstanceRecord getCorrespondentBankFulfillmentArrangementInstanceRecord() {
    return correspondentBankFulfillmentArrangementInstanceRecord;
  }

  public void setCorrespondentBankFulfillmentArrangementInstanceRecord(BQReconciliationsRetrieveOutputModelCorrespondentBankFulfillmentArrangementInstanceRecord correspondentBankFulfillmentArrangementInstanceRecord) {
    this.correspondentBankFulfillmentArrangementInstanceRecord = correspondentBankFulfillmentArrangementInstanceRecord;
  }


  /**
   * Get reconciliationsInstanceRecord
   * @return reconciliationsInstanceRecord
  **/

  public BQReconciliationsRetrieveOutputModelReconciliationsInstanceRecord getReconciliationsInstanceRecord() {
    return reconciliationsInstanceRecord;
  }

  public void setReconciliationsInstanceRecord(BQReconciliationsRetrieveOutputModelReconciliationsInstanceRecord reconciliationsInstanceRecord) {
    this.reconciliationsInstanceRecord = reconciliationsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Reconciliations instance retrieve service call 
   * @return reconciliationsRetrieveActionTaskReference
  **/

  public String getReconciliationsRetrieveActionTaskReference() {
    return reconciliationsRetrieveActionTaskReference;
  }

  public void setReconciliationsRetrieveActionTaskReference(String reconciliationsRetrieveActionTaskReference) {
    this.reconciliationsRetrieveActionTaskReference = reconciliationsRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return reconciliationsRetrieveActionTaskRecord
  **/

  public Object getReconciliationsRetrieveActionTaskRecord() {
    return reconciliationsRetrieveActionTaskRecord;
  }

  public void setReconciliationsRetrieveActionTaskRecord(Object reconciliationsRetrieveActionTaskRecord) {
    this.reconciliationsRetrieveActionTaskRecord = reconciliationsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return reconciliationsRetrieveActionResponse
  **/

  public String getReconciliationsRetrieveActionResponse() {
    return reconciliationsRetrieveActionResponse;
  }

  public void setReconciliationsRetrieveActionResponse(String reconciliationsRetrieveActionResponse) {
    this.reconciliationsRetrieveActionResponse = reconciliationsRetrieveActionResponse;
  }


  /**
   * Get reconciliationsInstanceReport
   * @return reconciliationsInstanceReport
  **/

  public BQReconciliationsRetrieveOutputModelReconciliationsInstanceReport getReconciliationsInstanceReport() {
    return reconciliationsInstanceReport;
  }

  public void setReconciliationsInstanceReport(BQReconciliationsRetrieveOutputModelReconciliationsInstanceReport reconciliationsInstanceReport) {
    this.reconciliationsInstanceReport = reconciliationsInstanceReport;
  }


  /**
   * Get reconciliationsInstanceAnalysis
   * @return reconciliationsInstanceAnalysis
  **/

  public BQReconciliationsRetrieveOutputModelReconciliationsInstanceAnalysis getReconciliationsInstanceAnalysis() {
    return reconciliationsInstanceAnalysis;
  }

  public void setReconciliationsInstanceAnalysis(BQReconciliationsRetrieveOutputModelReconciliationsInstanceAnalysis reconciliationsInstanceAnalysis) {
    this.reconciliationsInstanceAnalysis = reconciliationsInstanceAnalysis;
  }


}

