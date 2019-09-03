package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOutboundPaymentsUpdateInputModelOutboundPaymentsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOutboundPaymentsUpdateInputModel
 */
public class BQOutboundPaymentsUpdateInputModel   {
  private String correspondentBankFulfillmentArrangementInstanceReference = null;

  private String outboundPaymentsInstanceReference = null;

  private BQOutboundPaymentsUpdateInputModelOutboundPaymentsInstanceRecord outboundPaymentsInstanceRecord = null;

  private Object outboundPaymentsUpdateActionTaskRecord = null;

  private String outboundPaymentsUpdateActionRequest = null;


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

  public BQOutboundPaymentsUpdateInputModelOutboundPaymentsInstanceRecord getOutboundPaymentsInstanceRecord() {
    return outboundPaymentsInstanceRecord;
  }

  public void setOutboundPaymentsInstanceRecord(BQOutboundPaymentsUpdateInputModelOutboundPaymentsInstanceRecord outboundPaymentsInstanceRecord) {
    this.outboundPaymentsInstanceRecord = outboundPaymentsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return outboundPaymentsUpdateActionTaskRecord
  **/

  public Object getOutboundPaymentsUpdateActionTaskRecord() {
    return outboundPaymentsUpdateActionTaskRecord;
  }

  public void setOutboundPaymentsUpdateActionTaskRecord(Object outboundPaymentsUpdateActionTaskRecord) {
    this.outboundPaymentsUpdateActionTaskRecord = outboundPaymentsUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return outboundPaymentsUpdateActionRequest
  **/

  public String getOutboundPaymentsUpdateActionRequest() {
    return outboundPaymentsUpdateActionRequest;
  }

  public void setOutboundPaymentsUpdateActionRequest(String outboundPaymentsUpdateActionRequest) {
    this.outboundPaymentsUpdateActionRequest = outboundPaymentsUpdateActionRequest;
  }


}

