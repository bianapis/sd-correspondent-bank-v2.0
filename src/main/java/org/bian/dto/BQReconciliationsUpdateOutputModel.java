package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQReconciliationsUpdateInputModelReconciliationsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQReconciliationsUpdateOutputModel
 */
public class BQReconciliationsUpdateOutputModel   {
  private BQReconciliationsUpdateInputModelReconciliationsInstanceRecord reconciliationsInstanceRecord = null;

  private String reconciliationsUpdateActionTaskReference = null;

  private Object reconciliationsUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get reconciliationsInstanceRecord
   * @return reconciliationsInstanceRecord
  **/

  public BQReconciliationsUpdateInputModelReconciliationsInstanceRecord getReconciliationsInstanceRecord() {
    return reconciliationsInstanceRecord;
  }

  public void setReconciliationsInstanceRecord(BQReconciliationsUpdateInputModelReconciliationsInstanceRecord reconciliationsInstanceRecord) {
    this.reconciliationsInstanceRecord = reconciliationsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return reconciliationsUpdateActionTaskReference
  **/

  public String getReconciliationsUpdateActionTaskReference() {
    return reconciliationsUpdateActionTaskReference;
  }

  public void setReconciliationsUpdateActionTaskReference(String reconciliationsUpdateActionTaskReference) {
    this.reconciliationsUpdateActionTaskReference = reconciliationsUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return reconciliationsUpdateActionTaskRecord
  **/

  public Object getReconciliationsUpdateActionTaskRecord() {
    return reconciliationsUpdateActionTaskRecord;
  }

  public void setReconciliationsUpdateActionTaskRecord(Object reconciliationsUpdateActionTaskRecord) {
    this.reconciliationsUpdateActionTaskRecord = reconciliationsUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

