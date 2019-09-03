package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorrespondentBankFulfillmentArrangementInitiateOutputModelCorrespondentBankFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCorrespondentBankFulfillmentArrangementInitiateOutputModel
 */
public class CRCorrespondentBankFulfillmentArrangementInitiateOutputModel   {
  private String correspondentBankFulfillmentArrangementInstanceReference = null;

  private String correspondentBankFulfillmentArrangementInitiateActionReference = null;

  private Object correspondentBankFulfillmentArrangementInitiateActionRecord = null;

  private String correspondentBankFulfillmentArrangementInstanceStatus = null;

  private CRCorrespondentBankFulfillmentArrangementInitiateOutputModelCorrespondentBankFulfillmentArrangementInstanceRecord correspondentBankFulfillmentArrangementInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return correspondentBankFulfillmentArrangementInitiateActionReference
  **/

  public String getCorrespondentBankFulfillmentArrangementInitiateActionReference() {
    return correspondentBankFulfillmentArrangementInitiateActionReference;
  }

  public void setCorrespondentBankFulfillmentArrangementInitiateActionReference(String correspondentBankFulfillmentArrangementInitiateActionReference) {
    this.correspondentBankFulfillmentArrangementInitiateActionReference = correspondentBankFulfillmentArrangementInitiateActionReference;
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

  public CRCorrespondentBankFulfillmentArrangementInitiateOutputModelCorrespondentBankFulfillmentArrangementInstanceRecord getCorrespondentBankFulfillmentArrangementInstanceRecord() {
    return correspondentBankFulfillmentArrangementInstanceRecord;
  }

  public void setCorrespondentBankFulfillmentArrangementInstanceRecord(CRCorrespondentBankFulfillmentArrangementInitiateOutputModelCorrespondentBankFulfillmentArrangementInstanceRecord correspondentBankFulfillmentArrangementInstanceRecord) {
    this.correspondentBankFulfillmentArrangementInstanceRecord = correspondentBankFulfillmentArrangementInstanceRecord;
  }


}

