package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOutboundPaymentsRetrieveInputModelOutboundPaymentsInstanceReport
 */
public class BQOutboundPaymentsRetrieveInputModelOutboundPaymentsInstanceReport   {
  private String outboundPaymentsInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return outboundPaymentsInstanceReportReference
  **/

  public String getOutboundPaymentsInstanceReportReference() {
    return outboundPaymentsInstanceReportReference;
  }

  public void setOutboundPaymentsInstanceReportReference(String outboundPaymentsInstanceReportReference) {
    this.outboundPaymentsInstanceReportReference = outboundPaymentsInstanceReportReference;
  }


}

