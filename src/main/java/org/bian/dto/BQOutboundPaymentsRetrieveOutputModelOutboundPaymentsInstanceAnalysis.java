package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOutboundPaymentsRetrieveOutputModelOutboundPaymentsInstanceAnalysis
 */
public class BQOutboundPaymentsRetrieveOutputModelOutboundPaymentsInstanceAnalysis   {
  private Object outboundPaymentsInstanceAnalysisRecord = null;

  private String outboundPaymentsInstanceAnalysisReportType = null;

  private String outboundPaymentsInstanceAnalysisParameters = null;

  private Object outboundPaymentsInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return outboundPaymentsInstanceAnalysisRecord
  **/

  public Object getOutboundPaymentsInstanceAnalysisRecord() {
    return outboundPaymentsInstanceAnalysisRecord;
  }

  public void setOutboundPaymentsInstanceAnalysisRecord(Object outboundPaymentsInstanceAnalysisRecord) {
    this.outboundPaymentsInstanceAnalysisRecord = outboundPaymentsInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return outboundPaymentsInstanceAnalysisReportType
  **/

  public String getOutboundPaymentsInstanceAnalysisReportType() {
    return outboundPaymentsInstanceAnalysisReportType;
  }

  public void setOutboundPaymentsInstanceAnalysisReportType(String outboundPaymentsInstanceAnalysisReportType) {
    this.outboundPaymentsInstanceAnalysisReportType = outboundPaymentsInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return outboundPaymentsInstanceAnalysisParameters
  **/

  public String getOutboundPaymentsInstanceAnalysisParameters() {
    return outboundPaymentsInstanceAnalysisParameters;
  }

  public void setOutboundPaymentsInstanceAnalysisParameters(String outboundPaymentsInstanceAnalysisParameters) {
    this.outboundPaymentsInstanceAnalysisParameters = outboundPaymentsInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return outboundPaymentsInstanceAnalysisReport
  **/

  public Object getOutboundPaymentsInstanceAnalysisReport() {
    return outboundPaymentsInstanceAnalysisReport;
  }

  public void setOutboundPaymentsInstanceAnalysisReport(Object outboundPaymentsInstanceAnalysisReport) {
    this.outboundPaymentsInstanceAnalysisReport = outboundPaymentsInstanceAnalysisReport;
  }


}

