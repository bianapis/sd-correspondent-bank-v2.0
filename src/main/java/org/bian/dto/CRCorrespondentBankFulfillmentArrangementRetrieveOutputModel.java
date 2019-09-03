package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorrespondentBankFulfillmentArrangementRetrieveOutputModelCorrespondentBankFulfillmentArrangementInstanceAnalysis;
import org.bian.dto.CRCorrespondentBankFulfillmentArrangementRetrieveOutputModelCorrespondentBankFulfillmentArrangementInstanceRecord;
import org.bian.dto.CRCorrespondentBankFulfillmentArrangementRetrieveOutputModelCorrespondentBankFulfillmentArrangementInstanceReportRecord;
import org.bian.dto.CRCorrespondentBankFulfillmentArrangementRetrieveOutputModelInboundPaymentsInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCorrespondentBankFulfillmentArrangementRetrieveOutputModel
 */
public class CRCorrespondentBankFulfillmentArrangementRetrieveOutputModel   {
  private CRCorrespondentBankFulfillmentArrangementRetrieveOutputModelCorrespondentBankFulfillmentArrangementInstanceRecord correspondentBankFulfillmentArrangementInstanceRecord = null;

  private String correspondentBankFulfillmentArrangementRetrieveActionTaskReference = null;

  private Object correspondentBankFulfillmentArrangementRetrieveActionTaskRecord = null;

  private String correspondentBankFulfillmentArrangementRetrieveActionResponse = null;

  private CRCorrespondentBankFulfillmentArrangementRetrieveOutputModelCorrespondentBankFulfillmentArrangementInstanceReportRecord correspondentBankFulfillmentArrangementInstanceReportRecord = null;

  private CRCorrespondentBankFulfillmentArrangementRetrieveOutputModelCorrespondentBankFulfillmentArrangementInstanceAnalysis correspondentBankFulfillmentArrangementInstanceAnalysis = null;

  private CRCorrespondentBankFulfillmentArrangementRetrieveOutputModelInboundPaymentsInstanceRecord inboundPaymentsInstanceRecord = null;


  /**
   * Get correspondentBankFulfillmentArrangementInstanceRecord
   * @return correspondentBankFulfillmentArrangementInstanceRecord
  **/

  public CRCorrespondentBankFulfillmentArrangementRetrieveOutputModelCorrespondentBankFulfillmentArrangementInstanceRecord getCorrespondentBankFulfillmentArrangementInstanceRecord() {
    return correspondentBankFulfillmentArrangementInstanceRecord;
  }

  public void setCorrespondentBankFulfillmentArrangementInstanceRecord(CRCorrespondentBankFulfillmentArrangementRetrieveOutputModelCorrespondentBankFulfillmentArrangementInstanceRecord correspondentBankFulfillmentArrangementInstanceRecord) {
    this.correspondentBankFulfillmentArrangementInstanceRecord = correspondentBankFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Correspondent Bank Fulfillment Arrangement instance retrieve service call 
   * @return correspondentBankFulfillmentArrangementRetrieveActionTaskReference
  **/

  public String getCorrespondentBankFulfillmentArrangementRetrieveActionTaskReference() {
    return correspondentBankFulfillmentArrangementRetrieveActionTaskReference;
  }

  public void setCorrespondentBankFulfillmentArrangementRetrieveActionTaskReference(String correspondentBankFulfillmentArrangementRetrieveActionTaskReference) {
    this.correspondentBankFulfillmentArrangementRetrieveActionTaskReference = correspondentBankFulfillmentArrangementRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return correspondentBankFulfillmentArrangementRetrieveActionTaskRecord
  **/

  public Object getCorrespondentBankFulfillmentArrangementRetrieveActionTaskRecord() {
    return correspondentBankFulfillmentArrangementRetrieveActionTaskRecord;
  }

  public void setCorrespondentBankFulfillmentArrangementRetrieveActionTaskRecord(Object correspondentBankFulfillmentArrangementRetrieveActionTaskRecord) {
    this.correspondentBankFulfillmentArrangementRetrieveActionTaskRecord = correspondentBankFulfillmentArrangementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return correspondentBankFulfillmentArrangementRetrieveActionResponse
  **/

  public String getCorrespondentBankFulfillmentArrangementRetrieveActionResponse() {
    return correspondentBankFulfillmentArrangementRetrieveActionResponse;
  }

  public void setCorrespondentBankFulfillmentArrangementRetrieveActionResponse(String correspondentBankFulfillmentArrangementRetrieveActionResponse) {
    this.correspondentBankFulfillmentArrangementRetrieveActionResponse = correspondentBankFulfillmentArrangementRetrieveActionResponse;
  }


  /**
   * Get correspondentBankFulfillmentArrangementInstanceReportRecord
   * @return correspondentBankFulfillmentArrangementInstanceReportRecord
  **/

  public CRCorrespondentBankFulfillmentArrangementRetrieveOutputModelCorrespondentBankFulfillmentArrangementInstanceReportRecord getCorrespondentBankFulfillmentArrangementInstanceReportRecord() {
    return correspondentBankFulfillmentArrangementInstanceReportRecord;
  }

  public void setCorrespondentBankFulfillmentArrangementInstanceReportRecord(CRCorrespondentBankFulfillmentArrangementRetrieveOutputModelCorrespondentBankFulfillmentArrangementInstanceReportRecord correspondentBankFulfillmentArrangementInstanceReportRecord) {
    this.correspondentBankFulfillmentArrangementInstanceReportRecord = correspondentBankFulfillmentArrangementInstanceReportRecord;
  }


  /**
   * Get correspondentBankFulfillmentArrangementInstanceAnalysis
   * @return correspondentBankFulfillmentArrangementInstanceAnalysis
  **/

  public CRCorrespondentBankFulfillmentArrangementRetrieveOutputModelCorrespondentBankFulfillmentArrangementInstanceAnalysis getCorrespondentBankFulfillmentArrangementInstanceAnalysis() {
    return correspondentBankFulfillmentArrangementInstanceAnalysis;
  }

  public void setCorrespondentBankFulfillmentArrangementInstanceAnalysis(CRCorrespondentBankFulfillmentArrangementRetrieveOutputModelCorrespondentBankFulfillmentArrangementInstanceAnalysis correspondentBankFulfillmentArrangementInstanceAnalysis) {
    this.correspondentBankFulfillmentArrangementInstanceAnalysis = correspondentBankFulfillmentArrangementInstanceAnalysis;
  }


  /**
   * Get inboundPaymentsInstanceRecord
   * @return inboundPaymentsInstanceRecord
  **/

  public CRCorrespondentBankFulfillmentArrangementRetrieveOutputModelInboundPaymentsInstanceRecord getInboundPaymentsInstanceRecord() {
    return inboundPaymentsInstanceRecord;
  }

  public void setInboundPaymentsInstanceRecord(CRCorrespondentBankFulfillmentArrangementRetrieveOutputModelInboundPaymentsInstanceRecord inboundPaymentsInstanceRecord) {
    this.inboundPaymentsInstanceRecord = inboundPaymentsInstanceRecord;
  }


}

