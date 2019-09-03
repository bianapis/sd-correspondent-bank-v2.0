package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInboundPaymentsUpdateInputModelInboundPaymentsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInboundPaymentsUpdateInputModel
 */
public class BQInboundPaymentsUpdateInputModel   {
  private String correspondentBankFulfillmentArrangementInstanceReference = null;

  private String inboundPaymentsInstanceReference = null;

  private BQInboundPaymentsUpdateInputModelInboundPaymentsInstanceRecord inboundPaymentsInstanceRecord = null;

  private Object inboundPaymentsUpdateActionTaskRecord = null;

  private String inboundPaymentsUpdateActionRequest = null;


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

  public BQInboundPaymentsUpdateInputModelInboundPaymentsInstanceRecord getInboundPaymentsInstanceRecord() {
    return inboundPaymentsInstanceRecord;
  }

  public void setInboundPaymentsInstanceRecord(BQInboundPaymentsUpdateInputModelInboundPaymentsInstanceRecord inboundPaymentsInstanceRecord) {
    this.inboundPaymentsInstanceRecord = inboundPaymentsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return inboundPaymentsUpdateActionTaskRecord
  **/

  public Object getInboundPaymentsUpdateActionTaskRecord() {
    return inboundPaymentsUpdateActionTaskRecord;
  }

  public void setInboundPaymentsUpdateActionTaskRecord(Object inboundPaymentsUpdateActionTaskRecord) {
    this.inboundPaymentsUpdateActionTaskRecord = inboundPaymentsUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return inboundPaymentsUpdateActionRequest
  **/

  public String getInboundPaymentsUpdateActionRequest() {
    return inboundPaymentsUpdateActionRequest;
  }

  public void setInboundPaymentsUpdateActionRequest(String inboundPaymentsUpdateActionRequest) {
    this.inboundPaymentsUpdateActionRequest = inboundPaymentsUpdateActionRequest;
  }


}

