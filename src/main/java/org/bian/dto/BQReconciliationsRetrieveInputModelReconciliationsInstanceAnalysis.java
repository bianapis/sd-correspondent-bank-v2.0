package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReconciliationsRetrieveInputModelReconciliationsInstanceAnalysis
 */
public class BQReconciliationsRetrieveInputModelReconciliationsInstanceAnalysis   {
  private String reconciliationsInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return reconciliationsInstanceAnalysisReference
  **/

  public String getReconciliationsInstanceAnalysisReference() {
    return reconciliationsInstanceAnalysisReference;
  }

  public void setReconciliationsInstanceAnalysisReference(String reconciliationsInstanceAnalysisReference) {
    this.reconciliationsInstanceAnalysisReference = reconciliationsInstanceAnalysisReference;
  }


}

