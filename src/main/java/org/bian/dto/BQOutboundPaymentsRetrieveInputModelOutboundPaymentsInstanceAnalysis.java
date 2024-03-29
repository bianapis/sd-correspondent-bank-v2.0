package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOutboundPaymentsRetrieveInputModelOutboundPaymentsInstanceAnalysis
 */
public class BQOutboundPaymentsRetrieveInputModelOutboundPaymentsInstanceAnalysis   {
  private String outboundPaymentsInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return outboundPaymentsInstanceAnalysisReference
  **/

  public String getOutboundPaymentsInstanceAnalysisReference() {
    return outboundPaymentsInstanceAnalysisReference;
  }

  public void setOutboundPaymentsInstanceAnalysisReference(String outboundPaymentsInstanceAnalysisReference) {
    this.outboundPaymentsInstanceAnalysisReference = outboundPaymentsInstanceAnalysisReference;
  }


}

