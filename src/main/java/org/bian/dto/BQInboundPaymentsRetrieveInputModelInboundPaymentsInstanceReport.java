package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInboundPaymentsRetrieveInputModelInboundPaymentsInstanceReport
 */
public class BQInboundPaymentsRetrieveInputModelInboundPaymentsInstanceReport   {
  private String inboundPaymentsInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return inboundPaymentsInstanceReportReference
  **/

  public String getInboundPaymentsInstanceReportReference() {
    return inboundPaymentsInstanceReportReference;
  }

  public void setInboundPaymentsInstanceReportReference(String inboundPaymentsInstanceReportReference) {
    this.inboundPaymentsInstanceReportReference = inboundPaymentsInstanceReportReference;
  }


}

