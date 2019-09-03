package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReconciliationsRetrieveOutputModelReconciliationsInstanceAnalysis
 */
public class BQReconciliationsRetrieveOutputModelReconciliationsInstanceAnalysis   {
  private Object reconciliationsInstanceAnalysisRecord = null;

  private String reconciliationsInstanceAnalysisReportType = null;

  private String reconciliationsInstanceAnalysisParameters = null;

  private Object reconciliationsInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return reconciliationsInstanceAnalysisRecord
  **/

  public Object getReconciliationsInstanceAnalysisRecord() {
    return reconciliationsInstanceAnalysisRecord;
  }

  public void setReconciliationsInstanceAnalysisRecord(Object reconciliationsInstanceAnalysisRecord) {
    this.reconciliationsInstanceAnalysisRecord = reconciliationsInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return reconciliationsInstanceAnalysisReportType
  **/

  public String getReconciliationsInstanceAnalysisReportType() {
    return reconciliationsInstanceAnalysisReportType;
  }

  public void setReconciliationsInstanceAnalysisReportType(String reconciliationsInstanceAnalysisReportType) {
    this.reconciliationsInstanceAnalysisReportType = reconciliationsInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return reconciliationsInstanceAnalysisParameters
  **/

  public String getReconciliationsInstanceAnalysisParameters() {
    return reconciliationsInstanceAnalysisParameters;
  }

  public void setReconciliationsInstanceAnalysisParameters(String reconciliationsInstanceAnalysisParameters) {
    this.reconciliationsInstanceAnalysisParameters = reconciliationsInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return reconciliationsInstanceAnalysisReport
  **/

  public Object getReconciliationsInstanceAnalysisReport() {
    return reconciliationsInstanceAnalysisReport;
  }

  public void setReconciliationsInstanceAnalysisReport(Object reconciliationsInstanceAnalysisReport) {
    this.reconciliationsInstanceAnalysisReport = reconciliationsInstanceAnalysisReport;
  }


}

