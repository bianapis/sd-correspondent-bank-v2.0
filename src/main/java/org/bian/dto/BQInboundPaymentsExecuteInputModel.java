package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInboundPaymentsExecuteInputModelExecuteRecordType;
import org.bian.dto.BQInboundPaymentsExecuteInputModelInboundPaymentsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInboundPaymentsExecuteInputModel
 */
public class BQInboundPaymentsExecuteInputModel   {
  private String correspondentBankFulfillmentArrangementInstanceReference = null;

  private String inboundPaymentsInstanceReference = null;

  private BQInboundPaymentsExecuteInputModelInboundPaymentsInstanceRecord inboundPaymentsInstanceRecord = null;

  private Object inboundPaymentsExecuteActionTaskRecord = null;

  private BQInboundPaymentsExecuteInputModelExecuteRecordType executeRecordType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Inbound Payments instance 
   * @return inboundPaymentsInstanceReference
  **/

  public String getInboundPaymentsInstanceReference() {
    return inboundPaymentsInstanceReference;
  }

  public void setInboundPaymentsInstanceReference(String inboundPaymentsInstanceReference) {
    this.inboundPaymentsInstanceReference = inboundPaymentsInstanceReference;
  }


  /**
   * Get inboundPaymentsInstanceRecord
   * @return inboundPaymentsInstanceRecord
  **/

  public BQInboundPaymentsExecuteInputModelInboundPaymentsInstanceRecord getInboundPaymentsInstanceRecord() {
    return inboundPaymentsInstanceRecord;
  }

  public void setInboundPaymentsInstanceRecord(BQInboundPaymentsExecuteInputModelInboundPaymentsInstanceRecord inboundPaymentsInstanceRecord) {
    this.inboundPaymentsInstanceRecord = inboundPaymentsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return inboundPaymentsExecuteActionTaskRecord
  **/

  public Object getInboundPaymentsExecuteActionTaskRecord() {
    return inboundPaymentsExecuteActionTaskRecord;
  }

  public void setInboundPaymentsExecuteActionTaskRecord(Object inboundPaymentsExecuteActionTaskRecord) {
    this.inboundPaymentsExecuteActionTaskRecord = inboundPaymentsExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public BQInboundPaymentsExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(BQInboundPaymentsExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

