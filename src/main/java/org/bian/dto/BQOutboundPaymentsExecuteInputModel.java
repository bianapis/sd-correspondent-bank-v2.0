package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInboundPaymentsExecuteInputModelExecuteRecordType;
import org.bian.dto.BQOutboundPaymentsExecuteInputModelOutboundPaymentsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOutboundPaymentsExecuteInputModel
 */
public class BQOutboundPaymentsExecuteInputModel   {
  private String correspondentBankFulfillmentArrangementInstanceReference = null;

  private String outboundPaymentsInstanceReference = null;

  private BQOutboundPaymentsExecuteInputModelOutboundPaymentsInstanceRecord outboundPaymentsInstanceRecord = null;

  private Object outboundPaymentsExecuteActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Outbound Payments instance 
   * @return outboundPaymentsInstanceReference
  **/

  public String getOutboundPaymentsInstanceReference() {
    return outboundPaymentsInstanceReference;
  }

  public void setOutboundPaymentsInstanceReference(String outboundPaymentsInstanceReference) {
    this.outboundPaymentsInstanceReference = outboundPaymentsInstanceReference;
  }


  /**
   * Get outboundPaymentsInstanceRecord
   * @return outboundPaymentsInstanceRecord
  **/

  public BQOutboundPaymentsExecuteInputModelOutboundPaymentsInstanceRecord getOutboundPaymentsInstanceRecord() {
    return outboundPaymentsInstanceRecord;
  }

  public void setOutboundPaymentsInstanceRecord(BQOutboundPaymentsExecuteInputModelOutboundPaymentsInstanceRecord outboundPaymentsInstanceRecord) {
    this.outboundPaymentsInstanceRecord = outboundPaymentsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return outboundPaymentsExecuteActionTaskRecord
  **/

  public Object getOutboundPaymentsExecuteActionTaskRecord() {
    return outboundPaymentsExecuteActionTaskRecord;
  }

  public void setOutboundPaymentsExecuteActionTaskRecord(Object outboundPaymentsExecuteActionTaskRecord) {
    this.outboundPaymentsExecuteActionTaskRecord = outboundPaymentsExecuteActionTaskRecord;
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

