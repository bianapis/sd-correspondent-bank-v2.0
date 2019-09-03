package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReconciliationsExchangeOutputModel
 */
public class BQReconciliationsExchangeOutputModel   {
  private String reconciliationsExchangeActionTaskReference = null;

  private Object reconciliationsExchangeActionTaskRecord = null;

  private String reconciliationsExchangeActionResponse = null;

  private String reconciliationsInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Reconciliations instance exchange service call 
   * @return reconciliationsExchangeActionTaskReference
  **/

  public String getReconciliationsExchangeActionTaskReference() {
    return reconciliationsExchangeActionTaskReference;
  }

  public void setReconciliationsExchangeActionTaskReference(String reconciliationsExchangeActionTaskReference) {
    this.reconciliationsExchangeActionTaskReference = reconciliationsExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return reconciliationsExchangeActionTaskRecord
  **/

  public Object getReconciliationsExchangeActionTaskRecord() {
    return reconciliationsExchangeActionTaskRecord;
  }

  public void setReconciliationsExchangeActionTaskRecord(Object reconciliationsExchangeActionTaskRecord) {
    this.reconciliationsExchangeActionTaskRecord = reconciliationsExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return reconciliationsExchangeActionResponse
  **/

  public String getReconciliationsExchangeActionResponse() {
    return reconciliationsExchangeActionResponse;
  }

  public void setReconciliationsExchangeActionResponse(String reconciliationsExchangeActionResponse) {
    this.reconciliationsExchangeActionResponse = reconciliationsExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Reconciliations instance (e.g. accepted, rejected, verified) 
   * @return reconciliationsInstanceStatus
  **/

  public String getReconciliationsInstanceStatus() {
    return reconciliationsInstanceStatus;
  }

  public void setReconciliationsInstanceStatus(String reconciliationsInstanceStatus) {
    this.reconciliationsInstanceStatus = reconciliationsInstanceStatus;
  }


}

