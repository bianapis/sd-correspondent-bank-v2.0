package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorrespondentBankFulfillmentArrangementRetrieveInputModelCorrespondentBankFulfillmentArrangementInstanceAnalysis;
import org.bian.dto.CRCorrespondentBankFulfillmentArrangementRetrieveInputModelCorrespondentBankFulfillmentArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCorrespondentBankFulfillmentArrangementRetrieveInputModel
 */
public class CRCorrespondentBankFulfillmentArrangementRetrieveInputModel   {
  private Object correspondentBankFulfillmentArrangementRetrieveActionTaskRecord = null;

  private String correspondentBankFulfillmentArrangementRetrieveActionRequest = null;

  private CRCorrespondentBankFulfillmentArrangementRetrieveInputModelCorrespondentBankFulfillmentArrangementInstanceReportRecord correspondentBankFulfillmentArrangementInstanceReportRecord = null;

  private CRCorrespondentBankFulfillmentArrangementRetrieveInputModelCorrespondentBankFulfillmentArrangementInstanceAnalysis correspondentBankFulfillmentArrangementInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return correspondentBankFulfillmentArrangementRetrieveActionTaskRecord
  **/

  public Object getCorrespondentBankFulfillmentArrangementRetrieveActionTaskRecord() {
    return correspondentBankFulfillmentArrangementRetrieveActionTaskRecord;
  }

  public void setCorrespondentBankFulfillmentArrangementRetrieveActionTaskRecord(Object correspondentBankFulfillmentArrangementRetrieveActionTaskRecord) {
    this.correspondentBankFulfillmentArrangementRetrieveActionTaskRecord = correspondentBankFulfillmentArrangementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return correspondentBankFulfillmentArrangementRetrieveActionRequest
  **/

  public String getCorrespondentBankFulfillmentArrangementRetrieveActionRequest() {
    return correspondentBankFulfillmentArrangementRetrieveActionRequest;
  }

  public void setCorrespondentBankFulfillmentArrangementRetrieveActionRequest(String correspondentBankFulfillmentArrangementRetrieveActionRequest) {
    this.correspondentBankFulfillmentArrangementRetrieveActionRequest = correspondentBankFulfillmentArrangementRetrieveActionRequest;
  }


  /**
   * Get correspondentBankFulfillmentArrangementInstanceReportRecord
   * @return correspondentBankFulfillmentArrangementInstanceReportRecord
  **/

  public CRCorrespondentBankFulfillmentArrangementRetrieveInputModelCorrespondentBankFulfillmentArrangementInstanceReportRecord getCorrespondentBankFulfillmentArrangementInstanceReportRecord() {
    return correspondentBankFulfillmentArrangementInstanceReportRecord;
  }

  public void setCorrespondentBankFulfillmentArrangementInstanceReportRecord(CRCorrespondentBankFulfillmentArrangementRetrieveInputModelCorrespondentBankFulfillmentArrangementInstanceReportRecord correspondentBankFulfillmentArrangementInstanceReportRecord) {
    this.correspondentBankFulfillmentArrangementInstanceReportRecord = correspondentBankFulfillmentArrangementInstanceReportRecord;
  }


  /**
   * Get correspondentBankFulfillmentArrangementInstanceAnalysis
   * @return correspondentBankFulfillmentArrangementInstanceAnalysis
  **/

  public CRCorrespondentBankFulfillmentArrangementRetrieveInputModelCorrespondentBankFulfillmentArrangementInstanceAnalysis getCorrespondentBankFulfillmentArrangementInstanceAnalysis() {
    return correspondentBankFulfillmentArrangementInstanceAnalysis;
  }

  public void setCorrespondentBankFulfillmentArrangementInstanceAnalysis(CRCorrespondentBankFulfillmentArrangementRetrieveInputModelCorrespondentBankFulfillmentArrangementInstanceAnalysis correspondentBankFulfillmentArrangementInstanceAnalysis) {
    this.correspondentBankFulfillmentArrangementInstanceAnalysis = correspondentBankFulfillmentArrangementInstanceAnalysis;
  }


}

