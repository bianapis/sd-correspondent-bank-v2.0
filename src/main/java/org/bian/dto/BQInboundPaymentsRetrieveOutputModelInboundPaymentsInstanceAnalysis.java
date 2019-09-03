package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInboundPaymentsRetrieveOutputModelInboundPaymentsInstanceAnalysis
 */
public class BQInboundPaymentsRetrieveOutputModelInboundPaymentsInstanceAnalysis   {
  private Object inboundPaymentsInstanceAnalysisRecord = null;

  private String inboundPaymentsInstanceAnalysisReportType = null;

  private String inboundPaymentsInstanceAnalysisParameters = null;

  private Object inboundPaymentsInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return inboundPaymentsInstanceAnalysisRecord
  **/

  public Object getInboundPaymentsInstanceAnalysisRecord() {
    return inboundPaymentsInstanceAnalysisRecord;
  }

  public void setInboundPaymentsInstanceAnalysisRecord(Object inboundPaymentsInstanceAnalysisRecord) {
    this.inboundPaymentsInstanceAnalysisRecord = inboundPaymentsInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return inboundPaymentsInstanceAnalysisReportType
  **/

  public String getInboundPaymentsInstanceAnalysisReportType() {
    return inboundPaymentsInstanceAnalysisReportType;
  }

  public void setInboundPaymentsInstanceAnalysisReportType(String inboundPaymentsInstanceAnalysisReportType) {
    this.inboundPaymentsInstanceAnalysisReportType = inboundPaymentsInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return inboundPaymentsInstanceAnalysisParameters
  **/

  public String getInboundPaymentsInstanceAnalysisParameters() {
    return inboundPaymentsInstanceAnalysisParameters;
  }

  public void setInboundPaymentsInstanceAnalysisParameters(String inboundPaymentsInstanceAnalysisParameters) {
    this.inboundPaymentsInstanceAnalysisParameters = inboundPaymentsInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return inboundPaymentsInstanceAnalysisReport
  **/

  public Object getInboundPaymentsInstanceAnalysisReport() {
    return inboundPaymentsInstanceAnalysisReport;
  }

  public void setInboundPaymentsInstanceAnalysisReport(Object inboundPaymentsInstanceAnalysisReport) {
    this.inboundPaymentsInstanceAnalysisReport = inboundPaymentsInstanceAnalysisReport;
  }


}

