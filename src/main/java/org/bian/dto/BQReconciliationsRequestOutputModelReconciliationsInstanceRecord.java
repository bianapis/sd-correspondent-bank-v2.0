package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReconciliationsRequestOutputModelReconciliationsInstanceRecord
 */
public class BQReconciliationsRequestOutputModelReconciliationsInstanceRecord   {
  private String correspondentBankReconciliationTaskReference = null;

  private String correspondentBankReconciliationTaskWorkProducts = null;

  private String correspondentBankReconciliationTaskResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the correspondent reconciliation task 
   * @return correspondentBankReconciliationTaskReference
  **/

  public String getCorrespondentBankReconciliationTaskReference() {
    return correspondentBankReconciliationTaskReference;
  }

  public void setCorrespondentBankReconciliationTaskReference(String correspondentBankReconciliationTaskReference) {
    this.correspondentBankReconciliationTaskReference = correspondentBankReconciliationTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, accounts and transaction details produced and referenced during the reconciliation 
   * @return correspondentBankReconciliationTaskWorkProducts
  **/

  public String getCorrespondentBankReconciliationTaskWorkProducts() {
    return correspondentBankReconciliationTaskWorkProducts;
  }

  public void setCorrespondentBankReconciliationTaskWorkProducts(String correspondentBankReconciliationTaskWorkProducts) {
    this.correspondentBankReconciliationTaskWorkProducts = correspondentBankReconciliationTaskWorkProducts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the resolution tasks agreed to reconcile 
   * @return correspondentBankReconciliationTaskResult
  **/

  public String getCorrespondentBankReconciliationTaskResult() {
    return correspondentBankReconciliationTaskResult;
  }

  public void setCorrespondentBankReconciliationTaskResult(String correspondentBankReconciliationTaskResult) {
    this.correspondentBankReconciliationTaskResult = correspondentBankReconciliationTaskResult;
  }


}

