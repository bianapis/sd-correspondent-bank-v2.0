package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReconciliationsRetrieveOutputModelReconciliationsInstanceReport
 */
public class BQReconciliationsRetrieveOutputModelReconciliationsInstanceReport   {
  private Object reconciliationsInstanceReportRecord = null;

  private String reconciliationsInstanceReportType = null;

  private String reconciliationsInstanceReportParameters = null;

  private Object reconciliationsInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return reconciliationsInstanceReportRecord
  **/

  public Object getReconciliationsInstanceReportRecord() {
    return reconciliationsInstanceReportRecord;
  }

  public void setReconciliationsInstanceReportRecord(Object reconciliationsInstanceReportRecord) {
    this.reconciliationsInstanceReportRecord = reconciliationsInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return reconciliationsInstanceReportType
  **/

  public String getReconciliationsInstanceReportType() {
    return reconciliationsInstanceReportType;
  }

  public void setReconciliationsInstanceReportType(String reconciliationsInstanceReportType) {
    this.reconciliationsInstanceReportType = reconciliationsInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return reconciliationsInstanceReportParameters
  **/

  public String getReconciliationsInstanceReportParameters() {
    return reconciliationsInstanceReportParameters;
  }

  public void setReconciliationsInstanceReportParameters(String reconciliationsInstanceReportParameters) {
    this.reconciliationsInstanceReportParameters = reconciliationsInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return reconciliationsInstanceReport
  **/

  public Object getReconciliationsInstanceReport() {
    return reconciliationsInstanceReport;
  }

  public void setReconciliationsInstanceReport(Object reconciliationsInstanceReport) {
    this.reconciliationsInstanceReport = reconciliationsInstanceReport;
  }


}

