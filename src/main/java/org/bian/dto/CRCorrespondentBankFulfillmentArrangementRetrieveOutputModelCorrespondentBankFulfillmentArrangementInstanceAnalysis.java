package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorrespondentBankFulfillmentArrangementRetrieveOutputModelCorrespondentBankFulfillmentArrangementInstanceAnalysis
 */
public class CRCorrespondentBankFulfillmentArrangementRetrieveOutputModelCorrespondentBankFulfillmentArrangementInstanceAnalysis   {
  private String correspondentBankFulfillmentArrangementInstanceAnalysisData = null;

  private String correspondentBankFulfillmentArrangementInstanceAnalysisReportType = null;

  private Object correspondentBankFulfillmentArrangementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return correspondentBankFulfillmentArrangementInstanceAnalysisData
  **/

  public String getCorrespondentBankFulfillmentArrangementInstanceAnalysisData() {
    return correspondentBankFulfillmentArrangementInstanceAnalysisData;
  }

  public void setCorrespondentBankFulfillmentArrangementInstanceAnalysisData(String correspondentBankFulfillmentArrangementInstanceAnalysisData) {
    this.correspondentBankFulfillmentArrangementInstanceAnalysisData = correspondentBankFulfillmentArrangementInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return correspondentBankFulfillmentArrangementInstanceAnalysisReportType
  **/

  public String getCorrespondentBankFulfillmentArrangementInstanceAnalysisReportType() {
    return correspondentBankFulfillmentArrangementInstanceAnalysisReportType;
  }

  public void setCorrespondentBankFulfillmentArrangementInstanceAnalysisReportType(String correspondentBankFulfillmentArrangementInstanceAnalysisReportType) {
    this.correspondentBankFulfillmentArrangementInstanceAnalysisReportType = correspondentBankFulfillmentArrangementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return correspondentBankFulfillmentArrangementInstanceAnalysisReport
  **/

  public Object getCorrespondentBankFulfillmentArrangementInstanceAnalysisReport() {
    return correspondentBankFulfillmentArrangementInstanceAnalysisReport;
  }

  public void setCorrespondentBankFulfillmentArrangementInstanceAnalysisReport(Object correspondentBankFulfillmentArrangementInstanceAnalysisReport) {
    this.correspondentBankFulfillmentArrangementInstanceAnalysisReport = correspondentBankFulfillmentArrangementInstanceAnalysisReport;
  }


}

