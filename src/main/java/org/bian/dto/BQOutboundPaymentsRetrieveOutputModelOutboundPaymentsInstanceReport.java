package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOutboundPaymentsRetrieveOutputModelOutboundPaymentsInstanceReport
 */
public class BQOutboundPaymentsRetrieveOutputModelOutboundPaymentsInstanceReport   {
  private Object outboundPaymentsInstanceReportRecord = null;

  private String outboundPaymentsInstanceReportType = null;

  private String outboundPaymentsInstanceReportParameters = null;

  private Object outboundPaymentsInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return outboundPaymentsInstanceReportRecord
  **/

  public Object getOutboundPaymentsInstanceReportRecord() {
    return outboundPaymentsInstanceReportRecord;
  }

  public void setOutboundPaymentsInstanceReportRecord(Object outboundPaymentsInstanceReportRecord) {
    this.outboundPaymentsInstanceReportRecord = outboundPaymentsInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return outboundPaymentsInstanceReportType
  **/

  public String getOutboundPaymentsInstanceReportType() {
    return outboundPaymentsInstanceReportType;
  }

  public void setOutboundPaymentsInstanceReportType(String outboundPaymentsInstanceReportType) {
    this.outboundPaymentsInstanceReportType = outboundPaymentsInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return outboundPaymentsInstanceReportParameters
  **/

  public String getOutboundPaymentsInstanceReportParameters() {
    return outboundPaymentsInstanceReportParameters;
  }

  public void setOutboundPaymentsInstanceReportParameters(String outboundPaymentsInstanceReportParameters) {
    this.outboundPaymentsInstanceReportParameters = outboundPaymentsInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return outboundPaymentsInstanceReport
  **/

  public Object getOutboundPaymentsInstanceReport() {
    return outboundPaymentsInstanceReport;
  }

  public void setOutboundPaymentsInstanceReport(Object outboundPaymentsInstanceReport) {
    this.outboundPaymentsInstanceReport = outboundPaymentsInstanceReport;
  }


}

