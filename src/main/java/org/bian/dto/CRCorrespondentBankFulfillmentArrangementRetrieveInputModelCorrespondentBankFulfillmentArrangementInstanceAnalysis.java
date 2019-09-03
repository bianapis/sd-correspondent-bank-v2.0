package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorrespondentBankFulfillmentArrangementRetrieveInputModelCorrespondentBankFulfillmentArrangementInstanceAnalysis
 */
public class CRCorrespondentBankFulfillmentArrangementRetrieveInputModelCorrespondentBankFulfillmentArrangementInstanceAnalysis   {
  private String correspondentBankFulfillmentArrangementInstanceAnalysisReference = null;

  private String correspondentBankFulfillmentArrangementInstanceAnalysisReportType = null;

  private String correspondentBankFulfillmentArrangementInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return correspondentBankFulfillmentArrangementInstanceAnalysisReference
  **/

  public String getCorrespondentBankFulfillmentArrangementInstanceAnalysisReference() {
    return correspondentBankFulfillmentArrangementInstanceAnalysisReference;
  }

  public void setCorrespondentBankFulfillmentArrangementInstanceAnalysisReference(String correspondentBankFulfillmentArrangementInstanceAnalysisReference) {
    this.correspondentBankFulfillmentArrangementInstanceAnalysisReference = correspondentBankFulfillmentArrangementInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return correspondentBankFulfillmentArrangementInstanceAnalysisParameters
  **/

  public String getCorrespondentBankFulfillmentArrangementInstanceAnalysisParameters() {
    return correspondentBankFulfillmentArrangementInstanceAnalysisParameters;
  }

  public void setCorrespondentBankFulfillmentArrangementInstanceAnalysisParameters(String correspondentBankFulfillmentArrangementInstanceAnalysisParameters) {
    this.correspondentBankFulfillmentArrangementInstanceAnalysisParameters = correspondentBankFulfillmentArrangementInstanceAnalysisParameters;
  }


}

