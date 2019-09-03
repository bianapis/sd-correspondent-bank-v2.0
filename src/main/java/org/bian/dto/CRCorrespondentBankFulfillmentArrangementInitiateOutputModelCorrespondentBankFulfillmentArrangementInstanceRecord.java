package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCorrespondentBankFulfillmentArrangementInitiateOutputModelCorrespondentBankFulfillmentArrangementInstanceRecord
 */
public class CRCorrespondentBankFulfillmentArrangementInitiateOutputModelCorrespondentBankFulfillmentArrangementInstanceRecord   {
  private String correspondentBankArrangementReference = null;

  private String correspondentBankArrangement = null;

  private String correspondentBankServicingSchedule = null;

  private String holidayTimezoneSchedule = null;

  private String vostroAccountReference = null;

  private String nostroMirrorAccountReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the bank arrangement (that will detail limits, fees, preferred payments mechanism) 
   * @return correspondentBankArrangementReference
  **/

  public String getCorrespondentBankArrangementReference() {
    return correspondentBankArrangementReference;
  }

  public void setCorrespondentBankArrangementReference(String correspondentBankArrangementReference) {
    this.correspondentBankArrangementReference = correspondentBankArrangementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The correspondent bank arrangement (details agreed limits, fees, preferred payments mechanism, etc.) 
   * @return correspondentBankArrangement
  **/

  public String getCorrespondentBankArrangement() {
    return correspondentBankArrangement;
  }

  public void setCorrespondentBankArrangement(String correspondentBankArrangement) {
    this.correspondentBankArrangement = correspondentBankArrangement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the schedule for processing payments, clearing and settlement and reconciliations 
   * @return correspondentBankServicingSchedule
  **/

  public String getCorrespondentBankServicingSchedule() {
    return correspondentBankServicingSchedule;
  }

  public void setCorrespondentBankServicingSchedule(String correspondentBankServicingSchedule) {
    this.correspondentBankServicingSchedule = correspondentBankServicingSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A reference to the bank calendar details for payment processing 
   * @return holidayTimezoneSchedule
  **/

  public String getHolidayTimezoneSchedule() {
    return holidayTimezoneSchedule;
  }

  public void setHolidayTimezoneSchedule(String holidayTimezoneSchedule) {
    this.holidayTimezoneSchedule = holidayTimezoneSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to associated vostro account (your money at our bank) 
   * @return vostroAccountReference
  **/

  public String getVostroAccountReference() {
    return vostroAccountReference;
  }

  public void setVostroAccountReference(String vostroAccountReference) {
    this.vostroAccountReference = vostroAccountReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to associated nostro account (our money at your bank) 
   * @return nostroMirrorAccountReference
  **/

  public String getNostroMirrorAccountReference() {
    return nostroMirrorAccountReference;
  }

  public void setNostroMirrorAccountReference(String nostroMirrorAccountReference) {
    this.nostroMirrorAccountReference = nostroMirrorAccountReference;
  }


}

