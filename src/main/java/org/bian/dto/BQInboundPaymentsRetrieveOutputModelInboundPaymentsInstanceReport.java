package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInboundPaymentsRetrieveOutputModelInboundPaymentsInstanceReport
 */
public class BQInboundPaymentsRetrieveOutputModelInboundPaymentsInstanceReport   {
  private Object inboundPaymentsInstanceReportRecord = null;

  private String inboundPaymentsInstanceReportType = null;

  private String inboundPaymentsInstanceReportParameters = null;

  private Object inboundPaymentsInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return inboundPaymentsInstanceReportRecord
  **/

  public Object getInboundPaymentsInstanceReportRecord() {
    return inboundPaymentsInstanceReportRecord;
  }

  public void setInboundPaymentsInstanceReportRecord(Object inboundPaymentsInstanceReportRecord) {
    this.inboundPaymentsInstanceReportRecord = inboundPaymentsInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return inboundPaymentsInstanceReportType
  **/

  public String getInboundPaymentsInstanceReportType() {
    return inboundPaymentsInstanceReportType;
  }

  public void setInboundPaymentsInstanceReportType(String inboundPaymentsInstanceReportType) {
    this.inboundPaymentsInstanceReportType = inboundPaymentsInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return inboundPaymentsInstanceReportParameters
  **/

  public String getInboundPaymentsInstanceReportParameters() {
    return inboundPaymentsInstanceReportParameters;
  }

  public void setInboundPaymentsInstanceReportParameters(String inboundPaymentsInstanceReportParameters) {
    this.inboundPaymentsInstanceReportParameters = inboundPaymentsInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return inboundPaymentsInstanceReport
  **/

  public Object getInboundPaymentsInstanceReport() {
    return inboundPaymentsInstanceReport;
  }

  public void setInboundPaymentsInstanceReport(Object inboundPaymentsInstanceReport) {
    this.inboundPaymentsInstanceReport = inboundPaymentsInstanceReport;
  }


}

