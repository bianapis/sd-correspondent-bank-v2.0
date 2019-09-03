package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorrespondentBankFulfillmentArrangementUpdateInputModelCorrespondentBankFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCorrespondentBankFulfillmentArrangementUpdateInputModel
 */
public class CRCorrespondentBankFulfillmentArrangementUpdateInputModel   {
  private String correspondentBankServicingSessionReference = null;

  private String correspondentBankFulfillmentArrangementInstanceReference = null;

  private CRCorrespondentBankFulfillmentArrangementUpdateInputModelCorrespondentBankFulfillmentArrangementInstanceRecord correspondentBankFulfillmentArrangementInstanceRecord = null;

  private Object correspondentBankFulfillmentArrangementUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return correspondentBankServicingSessionReference
  **/

  public String getCorrespondentBankServicingSessionReference() {
    return correspondentBankServicingSessionReference;
  }

  public void setCorrespondentBankServicingSessionReference(String correspondentBankServicingSessionReference) {
    this.correspondentBankServicingSessionReference = correspondentBankServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Correspondent Bank Fulfillment Arrangement instance 
   * @return correspondentBankFulfillmentArrangementInstanceReference
  **/

  public String getCorrespondentBankFulfillmentArrangementInstanceReference() {
    return correspondentBankFulfillmentArrangementInstanceReference;
  }

  public void setCorrespondentBankFulfillmentArrangementInstanceReference(String correspondentBankFulfillmentArrangementInstanceReference) {
    this.correspondentBankFulfillmentArrangementInstanceReference = correspondentBankFulfillmentArrangementInstanceReference;
  }


  /**
   * Get correspondentBankFulfillmentArrangementInstanceRecord
   * @return correspondentBankFulfillmentArrangementInstanceRecord
  **/

  public CRCorrespondentBankFulfillmentArrangementUpdateInputModelCorrespondentBankFulfillmentArrangementInstanceRecord getCorrespondentBankFulfillmentArrangementInstanceRecord() {
    return correspondentBankFulfillmentArrangementInstanceRecord;
  }

  public void setCorrespondentBankFulfillmentArrangementInstanceRecord(CRCorrespondentBankFulfillmentArrangementUpdateInputModelCorrespondentBankFulfillmentArrangementInstanceRecord correspondentBankFulfillmentArrangementInstanceRecord) {
    this.correspondentBankFulfillmentArrangementInstanceRecord = correspondentBankFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return correspondentBankFulfillmentArrangementUpdateActionTaskRecord
  **/

  public Object getCorrespondentBankFulfillmentArrangementUpdateActionTaskRecord() {
    return correspondentBankFulfillmentArrangementUpdateActionTaskRecord;
  }

  public void setCorrespondentBankFulfillmentArrangementUpdateActionTaskRecord(Object correspondentBankFulfillmentArrangementUpdateActionTaskRecord) {
    this.correspondentBankFulfillmentArrangementUpdateActionTaskRecord = correspondentBankFulfillmentArrangementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

