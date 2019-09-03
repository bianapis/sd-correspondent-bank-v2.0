package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorrespondentBankFulfillmentArrangementInitiateInputModelCorrespondentBankFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCorrespondentBankFulfillmentArrangementInitiateInputModel
 */
public class CRCorrespondentBankFulfillmentArrangementInitiateInputModel   {
  private String correspondentBankServicingSessionReference = null;

  private Object correspondentBankFulfillmentArrangementInitiateActionRecord = null;

  private String correspondentBankFulfillmentArrangementInstanceStatus = null;

  private CRCorrespondentBankFulfillmentArrangementInitiateInputModelCorrespondentBankFulfillmentArrangementInstanceRecord correspondentBankFulfillmentArrangementInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return correspondentBankFulfillmentArrangementInitiateActionRecord
  **/

  public Object getCorrespondentBankFulfillmentArrangementInitiateActionRecord() {
    return correspondentBankFulfillmentArrangementInitiateActionRecord;
  }

  public void setCorrespondentBankFulfillmentArrangementInitiateActionRecord(Object correspondentBankFulfillmentArrangementInitiateActionRecord) {
    this.correspondentBankFulfillmentArrangementInitiateActionRecord = correspondentBankFulfillmentArrangementInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Correspondent Bank Fulfillment Arrangement instance (e.g. initialised, pending, active) 
   * @return correspondentBankFulfillmentArrangementInstanceStatus
  **/

  public String getCorrespondentBankFulfillmentArrangementInstanceStatus() {
    return correspondentBankFulfillmentArrangementInstanceStatus;
  }

  public void setCorrespondentBankFulfillmentArrangementInstanceStatus(String correspondentBankFulfillmentArrangementInstanceStatus) {
    this.correspondentBankFulfillmentArrangementInstanceStatus = correspondentBankFulfillmentArrangementInstanceStatus;
  }


  /**
   * Get correspondentBankFulfillmentArrangementInstanceRecord
   * @return correspondentBankFulfillmentArrangementInstanceRecord
  **/

  public CRCorrespondentBankFulfillmentArrangementInitiateInputModelCorrespondentBankFulfillmentArrangementInstanceRecord getCorrespondentBankFulfillmentArrangementInstanceRecord() {
    return correspondentBankFulfillmentArrangementInstanceRecord;
  }

  public void setCorrespondentBankFulfillmentArrangementInstanceRecord(CRCorrespondentBankFulfillmentArrangementInitiateInputModelCorrespondentBankFulfillmentArrangementInstanceRecord correspondentBankFulfillmentArrangementInstanceRecord) {
    this.correspondentBankFulfillmentArrangementInstanceRecord = correspondentBankFulfillmentArrangementInstanceRecord;
  }


}

