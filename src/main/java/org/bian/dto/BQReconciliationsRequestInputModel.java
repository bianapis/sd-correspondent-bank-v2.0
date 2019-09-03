package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQClearingandSettlementRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQReconciliationsRequestInputModel
 */
public class BQReconciliationsRequestInputModel   {
  private String correspondentBankFulfillmentArrangementInstanceReference = null;

  private String reconciliationsInstanceReference = null;

  private Object reconciliationsRequestActionTaskRecord = null;

  private BQClearingandSettlementRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Correspondent Bank Fulfillment Arrangement instance 
   * @return correspondentBankFulfillmentArrangementInstanceReference
  **/

  public String getCorrespondentBankFulfillmentArrangementInstanceReference() {
    return correspondentBankFulfillmentArrangementInstanceReference;
  }

  public void setCorrespondentBankFulfillmentArrangementInstanceReference(String correspondentBankFulfillmentArrangementInstanceReference) {
    this.correspondentBankFulfillmentArrangementInstanceReference = correspondentBankFulfillmentArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Reconciliations instance 
   * @return reconciliationsInstanceReference
  **/

  public String getReconciliationsInstanceReference() {
    return reconciliationsInstanceReference;
  }

  public void setReconciliationsInstanceReference(String reconciliationsInstanceReference) {
    this.reconciliationsInstanceReference = reconciliationsInstanceReference;
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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public BQClearingandSettlementRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(BQClearingandSettlementRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

