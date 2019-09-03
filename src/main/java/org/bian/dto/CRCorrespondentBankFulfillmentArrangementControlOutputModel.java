package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorrespondentBankFulfillmentArrangementControlOutputModel
 */
public class CRCorrespondentBankFulfillmentArrangementControlOutputModel   {
  private String correspondentBankFulfillmentArrangementControlActionTaskReference = null;

  private Object correspondentBankFulfillmentArrangementControlActionTaskRecord = null;

  private String correspondentBankFulfillmentArrangementControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Correspondent Bank Fulfillment Arrangement instance control processing service call 
   * @return correspondentBankFulfillmentArrangementControlActionTaskReference
  **/

  public String getCorrespondentBankFulfillmentArrangementControlActionTaskReference() {
    return correspondentBankFulfillmentArrangementControlActionTaskReference;
  }

  public void setCorrespondentBankFulfillmentArrangementControlActionTaskReference(String correspondentBankFulfillmentArrangementControlActionTaskReference) {
    this.correspondentBankFulfillmentArrangementControlActionTaskReference = correspondentBankFulfillmentArrangementControlActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return correspondentBankFulfillmentArrangementControlActionResponse
  **/

  public String getCorrespondentBankFulfillmentArrangementControlActionResponse() {
    return correspondentBankFulfillmentArrangementControlActionResponse;
  }

  public void setCorrespondentBankFulfillmentArrangementControlActionResponse(String correspondentBankFulfillmentArrangementControlActionResponse) {
    this.correspondentBankFulfillmentArrangementControlActionResponse = correspondentBankFulfillmentArrangementControlActionResponse;
  }


}

