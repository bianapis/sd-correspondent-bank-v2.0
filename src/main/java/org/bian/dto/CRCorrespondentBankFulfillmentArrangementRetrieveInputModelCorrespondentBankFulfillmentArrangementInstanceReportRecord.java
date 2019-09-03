package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorrespondentBankFulfillmentArrangementRetrieveInputModelCorrespondentBankFulfillmentArrangementInstanceReportRecord
 */
public class CRCorrespondentBankFulfillmentArrangementRetrieveInputModelCorrespondentBankFulfillmentArrangementInstanceReportRecord   {
  private String correspondentBankFulfillmentArrangementInstanceReportReference = null;

  private String correspondentBankFulfillmentArrangementInstanceReportType = null;

  private String correspondentBankFulfillmentArrangementInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return correspondentBankFulfillmentArrangementInstanceReportReference
  **/

  public String getCorrespondentBankFulfillmentArrangementInstanceReportReference() {
    return correspondentBankFulfillmentArrangementInstanceReportReference;
  }

  public void setCorrespondentBankFulfillmentArrangementInstanceReportReference(String correspondentBankFulfillmentArrangementInstanceReportReference) {
    this.correspondentBankFulfillmentArrangementInstanceReportReference = correspondentBankFulfillmentArrangementInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return correspondentBankFulfillmentArrangementInstanceReportType
  **/

  public String getCorrespondentBankFulfillmentArrangementInstanceReportType() {
    return correspondentBankFulfillmentArrangementInstanceReportType;
  }

  public void setCorrespondentBankFulfillmentArrangementInstanceReportType(String correspondentBankFulfillmentArrangementInstanceReportType) {
    this.correspondentBankFulfillmentArrangementInstanceReportType = correspondentBankFulfillmentArrangementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return correspondentBankFulfillmentArrangementInstanceReportParameters
  **/

  public String getCorrespondentBankFulfillmentArrangementInstanceReportParameters() {
    return correspondentBankFulfillmentArrangementInstanceReportParameters;
  }

  public void setCorrespondentBankFulfillmentArrangementInstanceReportParameters(String correspondentBankFulfillmentArrangementInstanceReportParameters) {
    this.correspondentBankFulfillmentArrangementInstanceReportParameters = correspondentBankFulfillmentArrangementInstanceReportParameters;
  }


}

