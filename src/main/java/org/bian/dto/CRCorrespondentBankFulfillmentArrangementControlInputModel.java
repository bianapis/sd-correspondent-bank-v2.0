package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorrespondentBankFulfillmentArrangementControlInputModelCorrespondentBankFulfillmentArrangementControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRCorrespondentBankFulfillmentArrangementControlInputModel
 */
public class CRCorrespondentBankFulfillmentArrangementControlInputModel   {
  private String correspondentBankServicingSessionReference = null;

  private String correspondentBankFulfillmentArrangementInstanceReference = null;

  private Object correspondentBankFulfillmentArrangementControlActionTaskRecord = null;

  private CRCorrespondentBankFulfillmentArrangementControlInputModelCorrespondentBankFulfillmentArrangementControlActionRequest correspondentBankFulfillmentArrangementControlActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return correspondentBankFulfillmentArrangementControlActionTaskRecord
  **/

  public Object getCorrespondentBankFulfillmentArrangementControlActionTaskRecord() {
    return correspondentBankFulfillmentArrangementControlActionTaskRecord;
  }

  public void setCorrespondentBankFulfillmentArrangementControlActionTaskRecord(Object correspondentBankFulfillmentArrangementControlActionTaskRecord) {
    this.correspondentBankFulfillmentArrangementControlActionTaskRecord = correspondentBankFulfillmentArrangementControlActionTaskRecord;
  }


  /**
   * Get correspondentBankFulfillmentArrangementControlActionRequest
   * @return correspondentBankFulfillmentArrangementControlActionRequest
  **/

  public CRCorrespondentBankFulfillmentArrangementControlInputModelCorrespondentBankFulfillmentArrangementControlActionRequest getCorrespondentBankFulfillmentArrangementControlActionRequest() {
    return correspondentBankFulfillmentArrangementControlActionRequest;
  }

  public void setCorrespondentBankFulfillmentArrangementControlActionRequest(CRCorrespondentBankFulfillmentArrangementControlInputModelCorrespondentBankFulfillmentArrangementControlActionRequest correspondentBankFulfillmentArrangementControlActionRequest) {
    this.correspondentBankFulfillmentArrangementControlActionRequest = correspondentBankFulfillmentArrangementControlActionRequest;
  }


}

