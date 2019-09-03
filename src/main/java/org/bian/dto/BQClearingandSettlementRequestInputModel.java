package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQClearingandSettlementRequestInputModelClearingandSettlementInstanceRecord;
import org.bian.dto.BQClearingandSettlementRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQClearingandSettlementRequestInputModel
 */
public class BQClearingandSettlementRequestInputModel   {
  private String correspondentBankFulfillmentArrangementInstanceReference = null;

  private String clearingandSettlementInstanceReference = null;

  private BQClearingandSettlementRequestInputModelClearingandSettlementInstanceRecord clearingandSettlementInstanceRecord = null;

  private Object clearingandSettlementRequestActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Clearing and Settlement instance 
   * @return clearingandSettlementInstanceReference
  **/

  public String getClearingandSettlementInstanceReference() {
    return clearingandSettlementInstanceReference;
  }

  public void setClearingandSettlementInstanceReference(String clearingandSettlementInstanceReference) {
    this.clearingandSettlementInstanceReference = clearingandSettlementInstanceReference;
  }


  /**
   * Get clearingandSettlementInstanceRecord
   * @return clearingandSettlementInstanceRecord
  **/

  public BQClearingandSettlementRequestInputModelClearingandSettlementInstanceRecord getClearingandSettlementInstanceRecord() {
    return clearingandSettlementInstanceRecord;
  }

  public void setClearingandSettlementInstanceRecord(BQClearingandSettlementRequestInputModelClearingandSettlementInstanceRecord clearingandSettlementInstanceRecord) {
    this.clearingandSettlementInstanceRecord = clearingandSettlementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return clearingandSettlementRequestActionTaskRecord
  **/

  public Object getClearingandSettlementRequestActionTaskRecord() {
    return clearingandSettlementRequestActionTaskRecord;
  }

  public void setClearingandSettlementRequestActionTaskRecord(Object clearingandSettlementRequestActionTaskRecord) {
    this.clearingandSettlementRequestActionTaskRecord = clearingandSettlementRequestActionTaskRecord;
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

