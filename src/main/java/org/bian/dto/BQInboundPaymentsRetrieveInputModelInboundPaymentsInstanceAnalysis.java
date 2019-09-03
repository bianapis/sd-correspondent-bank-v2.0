package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInboundPaymentsRetrieveInputModelInboundPaymentsInstanceAnalysis
 */
public class BQInboundPaymentsRetrieveInputModelInboundPaymentsInstanceAnalysis   {
  private String inboundPaymentsInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return inboundPaymentsInstanceAnalysisReference
  **/

  public String getInboundPaymentsInstanceAnalysisReference() {
    return inboundPaymentsInstanceAnalysisReference;
  }

  public void setInboundPaymentsInstanceAnalysisReference(String inboundPaymentsInstanceAnalysisReference) {
    this.inboundPaymentsInstanceAnalysisReference = inboundPaymentsInstanceAnalysisReference;
  }


}

