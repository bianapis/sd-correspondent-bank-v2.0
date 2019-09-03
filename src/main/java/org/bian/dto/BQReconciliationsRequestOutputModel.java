package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQReconciliationsRequestOutputModelReconciliationsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQReconciliationsRequestOutputModel
 */
public class BQReconciliationsRequestOutputModel   {
  private BQReconciliationsRequestOutputModelReconciliationsInstanceRecord reconciliationsInstanceRecord = null;

  private String reconciliationsRequestActionTaskReference = null;

  private Object reconciliationsRequestActionTaskRecord = null;

  private String reconciliationsRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get reconciliationsInstanceRecord
   * @return reconciliationsInstanceRecord
  **/

  public BQReconciliationsRequestOutputModelReconciliationsInstanceRecord getReconciliationsInstanceRecord() {
    return reconciliationsInstanceRecord;
  }

  public void setReconciliationsInstanceRecord(BQReconciliationsRequestOutputModelReconciliationsInstanceRecord reconciliationsInstanceRecord) {
    this.reconciliationsInstanceRecord = reconciliationsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Reconciliations instance request service call 
   * @return reconciliationsRequestActionTaskReference
  **/

  public String getReconciliationsRequestActionTaskReference() {
    return reconciliationsRequestActionTaskReference;
  }

  public void setReconciliationsRequestActionTaskReference(String reconciliationsRequestActionTaskReference) {
    this.reconciliationsRequestActionTaskReference = reconciliationsRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return reconciliationsRequestActionTaskRecord
  **/

  public Object getReconciliationsRequestActionTaskRecord() {
    return reconciliationsRequestActionTaskRecord;
  }

  public void setReconciliationsRequestActionTaskRecord(Object reconciliationsRequestActionTaskRecord) {
    this.reconciliationsRequestActionTaskRecord = reconciliationsRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Reconciliations service request record 
   * @return reconciliationsRequestRecordReference
  **/

  public String getReconciliationsRequestRecordReference() {
    return reconciliationsRequestRecordReference;
  }

  public void setReconciliationsRequestRecordReference(String reconciliationsRequestRecordReference) {
    this.reconciliationsRequestRecordReference = reconciliationsRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

