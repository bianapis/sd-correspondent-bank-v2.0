package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQClearingandSettlementRequestInputModelClearingandSettlementInstanceRecord;
import org.bian.dto.BQClearingandSettlementRetrieveOutputModelClearingandSettlementInstanceAnalysis;
import org.bian.dto.BQClearingandSettlementRetrieveOutputModelClearingandSettlementInstanceReport;
import org.bian.dto.BQClearingandSettlementRetrieveOutputModelCorrespondentBankFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQClearingandSettlementRetrieveOutputModel
 */
public class BQClearingandSettlementRetrieveOutputModel   {
  private BQClearingandSettlementRetrieveOutputModelCorrespondentBankFulfillmentArrangementInstanceRecord correspondentBankFulfillmentArrangementInstanceRecord = null;

  private BQClearingandSettlementRequestInputModelClearingandSettlementInstanceRecord clearingandSettlementInstanceRecord = null;

  private String clearingandSettlementRetrieveActionTaskReference = null;

  private Object clearingandSettlementRetrieveActionTaskRecord = null;

  private String clearingandSettlementRetrieveActionResponse = null;

  private BQClearingandSettlementRetrieveOutputModelClearingandSettlementInstanceReport clearingandSettlementInstanceReport = null;

  private BQClearingandSettlementRetrieveOutputModelClearingandSettlementInstanceAnalysis clearingandSettlementInstanceAnalysis = null;


  /**
   * Get correspondentBankFulfillmentArrangementInstanceRecord
   * @return correspondentBankFulfillmentArrangementInstanceRecord
  **/

  public BQClearingandSettlementRetrieveOutputModelCorrespondentBankFulfillmentArrangementInstanceRecord getCorrespondentBankFulfillmentArrangementInstanceRecord() {
    return correspondentBankFulfillmentArrangementInstanceRecord;
  }

  public void setCorrespondentBankFulfillmentArrangementInstanceRecord(BQClearingandSettlementRetrieveOutputModelCorrespondentBankFulfillmentArrangementInstanceRecord correspondentBankFulfillmentArrangementInstanceRecord) {
    this.correspondentBankFulfillmentArrangementInstanceRecord = correspondentBankFulfillmentArrangementInstanceRecord;
  }


  /**
   * Get clearingandSettlementInstanceRecord
   * @return clearingandSettlementInstanceRecord
  **/

  public BQClearingandSettlementRequestInputModelClearingandSettlementInstanceRecord getClearingandSettlementInstanceRecord() {
    return clearingandSettlementInstanceRecord;
  }

  public void setClearingandSettlementInstanceRecord(BQClearingandSettlementRequestInputModelClearingandSettlementInstanceRecord clearingandSettlementInstanceRecord) {
    this.clearingandSettlementInstanceRecord = clearingandSettlementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Clearing and Settlement instance retrieve service call 
   * @return clearingandSettlementRetrieveActionTaskReference
  **/

  public String getClearingandSettlementRetrieveActionTaskReference() {
    return clearingandSettlementRetrieveActionTaskReference;
  }

  public void setClearingandSettlementRetrieveActionTaskReference(String clearingandSettlementRetrieveActionTaskReference) {
    this.clearingandSettlementRetrieveActionTaskReference = clearingandSettlementRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return clearingandSettlementRetrieveActionTaskRecord
  **/

  public Object getClearingandSettlementRetrieveActionTaskRecord() {
    return clearingandSettlementRetrieveActionTaskRecord;
  }

  public void setClearingandSettlementRetrieveActionTaskRecord(Object clearingandSettlementRetrieveActionTaskRecord) {
    this.clearingandSettlementRetrieveActionTaskRecord = clearingandSettlementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return clearingandSettlementRetrieveActionResponse
  **/

  public String getClearingandSettlementRetrieveActionResponse() {
    return clearingandSettlementRetrieveActionResponse;
  }

  public void setClearingandSettlementRetrieveActionResponse(String clearingandSettlementRetrieveActionResponse) {
    this.clearingandSettlementRetrieveActionResponse = clearingandSettlementRetrieveActionResponse;
  }


  /**
   * Get clearingandSettlementInstanceReport
   * @return clearingandSettlementInstanceReport
  **/

  public BQClearingandSettlementRetrieveOutputModelClearingandSettlementInstanceReport getClearingandSettlementInstanceReport() {
    return clearingandSettlementInstanceReport;
  }

  public void setClearingandSettlementInstanceReport(BQClearingandSettlementRetrieveOutputModelClearingandSettlementInstanceReport clearingandSettlementInstanceReport) {
    this.clearingandSettlementInstanceReport = clearingandSettlementInstanceReport;
  }


  /**
   * Get clearingandSettlementInstanceAnalysis
   * @return clearingandSettlementInstanceAnalysis
  **/

  public BQClearingandSettlementRetrieveOutputModelClearingandSettlementInstanceAnalysis getClearingandSettlementInstanceAnalysis() {
    return clearingandSettlementInstanceAnalysis;
  }

  public void setClearingandSettlementInstanceAnalysis(BQClearingandSettlementRetrieveOutputModelClearingandSettlementInstanceAnalysis clearingandSettlementInstanceAnalysis) {
    this.clearingandSettlementInstanceAnalysis = clearingandSettlementInstanceAnalysis;
  }


}

