package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorrespondentBankFulfillmentArrangementUpdateOutputModelCorrespondentBankFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCorrespondentBankFulfillmentArrangementUpdateOutputModel
 */
public class CRCorrespondentBankFulfillmentArrangementUpdateOutputModel   {
  private CRCorrespondentBankFulfillmentArrangementUpdateOutputModelCorrespondentBankFulfillmentArrangementInstanceRecord correspondentBankFulfillmentArrangementInstanceRecord = null;

  private String correspondentBankFulfillmentArrangementUpdateActionTaskReference = null;

  private Object correspondentBankFulfillmentArrangementUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get correspondentBankFulfillmentArrangementInstanceRecord
   * @return correspondentBankFulfillmentArrangementInstanceRecord
  **/

  public CRCorrespondentBankFulfillmentArrangementUpdateOutputModelCorrespondentBankFulfillmentArrangementInstanceRecord getCorrespondentBankFulfillmentArrangementInstanceRecord() {
    return correspondentBankFulfillmentArrangementInstanceRecord;
  }

  public void setCorrespondentBankFulfillmentArrangementInstanceRecord(CRCorrespondentBankFulfillmentArrangementUpdateOutputModelCorrespondentBankFulfillmentArrangementInstanceRecord correspondentBankFulfillmentArrangementInstanceRecord) {
    this.correspondentBankFulfillmentArrangementInstanceRecord = correspondentBankFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return correspondentBankFulfillmentArrangementUpdateActionTaskReference
  **/

  public String getCorrespondentBankFulfillmentArrangementUpdateActionTaskReference() {
    return correspondentBankFulfillmentArrangementUpdateActionTaskReference;
  }

  public void setCorrespondentBankFulfillmentArrangementUpdateActionTaskReference(String correspondentBankFulfillmentArrangementUpdateActionTaskReference) {
    this.correspondentBankFulfillmentArrangementUpdateActionTaskReference = correspondentBankFulfillmentArrangementUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

