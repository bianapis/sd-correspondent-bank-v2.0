package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQReconciliationsRetrieveInputModelReconciliationsInstanceAnalysis;
import org.bian.dto.BQReconciliationsRetrieveInputModelReconciliationsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQReconciliationsRetrieveInputModel
 */
public class BQReconciliationsRetrieveInputModel   {
  private Object reconciliationsRetrieveActionTaskRecord = null;

  private String reconciliationsRetrieveActionRequest = null;

  private BQReconciliationsRetrieveInputModelReconciliationsInstanceReport reconciliationsInstanceReport = null;

  private BQReconciliationsRetrieveInputModelReconciliationsInstanceAnalysis reconciliationsInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return reconciliationsRetrieveActionTaskRecord
  **/

  public Object getReconciliationsRetrieveActionTaskRecord() {
    return reconciliationsRetrieveActionTaskRecord;
  }

  public void setReconciliationsRetrieveActionTaskRecord(Object reconciliationsRetrieveActionTaskRecord) {
    this.reconciliationsRetrieveActionTaskRecord = reconciliationsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return reconciliationsRetrieveActionRequest
  **/

  public String getReconciliationsRetrieveActionRequest() {
    return reconciliationsRetrieveActionRequest;
  }

  public void setReconciliationsRetrieveActionRequest(String reconciliationsRetrieveActionRequest) {
    this.reconciliationsRetrieveActionRequest = reconciliationsRetrieveActionRequest;
  }


  /**
   * Get reconciliationsInstanceReport
   * @return reconciliationsInstanceReport
  **/

  public BQReconciliationsRetrieveInputModelReconciliationsInstanceReport getReconciliationsInstanceReport() {
    return reconciliationsInstanceReport;
  }

  public void setReconciliationsInstanceReport(BQReconciliationsRetrieveInputModelReconciliationsInstanceReport reconciliationsInstanceReport) {
    this.reconciliationsInstanceReport = reconciliationsInstanceReport;
  }


  /**
   * Get reconciliationsInstanceAnalysis
   * @return reconciliationsInstanceAnalysis
  **/

  public BQReconciliationsRetrieveInputModelReconciliationsInstanceAnalysis getReconciliationsInstanceAnalysis() {
    return reconciliationsInstanceAnalysis;
  }

  public void setReconciliationsInstanceAnalysis(BQReconciliationsRetrieveInputModelReconciliationsInstanceAnalysis reconciliationsInstanceAnalysis) {
    this.reconciliationsInstanceAnalysis = reconciliationsInstanceAnalysis;
  }


}

