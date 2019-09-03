package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInboundPaymentsRetrieveOutputModelCorrespondentBankFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQInboundPaymentsRetrieveOutputModelInboundPaymentsInstanceAnalysis;
import org.bian.dto.BQInboundPaymentsRetrieveOutputModelInboundPaymentsInstanceRecord;
import org.bian.dto.BQInboundPaymentsRetrieveOutputModelInboundPaymentsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQInboundPaymentsRetrieveOutputModel
 */
public class BQInboundPaymentsRetrieveOutputModel   {
  private BQInboundPaymentsRetrieveOutputModelCorrespondentBankFulfillmentArrangementInstanceRecord correspondentBankFulfillmentArrangementInstanceRecord = null;

  private BQInboundPaymentsRetrieveOutputModelInboundPaymentsInstanceRecord inboundPaymentsInstanceRecord = null;

  private String inboundPaymentsRetrieveActionTaskReference = null;

  private Object inboundPaymentsRetrieveActionTaskRecord = null;

  private String inboundPaymentsRetrieveActionResponse = null;

  private BQInboundPaymentsRetrieveOutputModelInboundPaymentsInstanceReport inboundPaymentsInstanceReport = null;

  private BQInboundPaymentsRetrieveOutputModelInboundPaymentsInstanceAnalysis inboundPaymentsInstanceAnalysis = null;


  /**
   * Get correspondentBankFulfillmentArrangementInstanceRecord
   * @return correspondentBankFulfillmentArrangementInstanceRecord
  **/

  public BQInboundPaymentsRetrieveOutputModelCorrespondentBankFulfillmentArrangementInstanceRecord getCorrespondentBankFulfillmentArrangementInstanceRecord() {
    return correspondentBankFulfillmentArrangementInstanceRecord;
  }

  public void setCorrespondentBankFulfillmentArrangementInstanceRecord(BQInboundPaymentsRetrieveOutputModelCorrespondentBankFulfillmentArrangementInstanceRecord correspondentBankFulfillmentArrangementInstanceRecord) {
    this.correspondentBankFulfillmentArrangementInstanceRecord = correspondentBankFulfillmentArrangementInstanceRecord;
  }


  /**
   * Get inboundPaymentsInstanceRecord
   * @return inboundPaymentsInstanceRecord
  **/

  public BQInboundPaymentsRetrieveOutputModelInboundPaymentsInstanceRecord getInboundPaymentsInstanceRecord() {
    return inboundPaymentsInstanceRecord;
  }

  public void setInboundPaymentsInstanceRecord(BQInboundPaymentsRetrieveOutputModelInboundPaymentsInstanceRecord inboundPaymentsInstanceRecord) {
    this.inboundPaymentsInstanceRecord = inboundPaymentsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Inbound Payments instance retrieve service call 
   * @return inboundPaymentsRetrieveActionTaskReference
  **/

  public String getInboundPaymentsRetrieveActionTaskReference() {
    return inboundPaymentsRetrieveActionTaskReference;
  }

  public void setInboundPaymentsRetrieveActionTaskReference(String inboundPaymentsRetrieveActionTaskReference) {
    this.inboundPaymentsRetrieveActionTaskReference = inboundPaymentsRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return inboundPaymentsRetrieveActionTaskRecord
  **/

  public Object getInboundPaymentsRetrieveActionTaskRecord() {
    return inboundPaymentsRetrieveActionTaskRecord;
  }

  public void setInboundPaymentsRetrieveActionTaskRecord(Object inboundPaymentsRetrieveActionTaskRecord) {
    this.inboundPaymentsRetrieveActionTaskRecord = inboundPaymentsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return inboundPaymentsRetrieveActionResponse
  **/

  public String getInboundPaymentsRetrieveActionResponse() {
    return inboundPaymentsRetrieveActionResponse;
  }

  public void setInboundPaymentsRetrieveActionResponse(String inboundPaymentsRetrieveActionResponse) {
    this.inboundPaymentsRetrieveActionResponse = inboundPaymentsRetrieveActionResponse;
  }


  /**
   * Get inboundPaymentsInstanceReport
   * @return inboundPaymentsInstanceReport
  **/

  public BQInboundPaymentsRetrieveOutputModelInboundPaymentsInstanceReport getInboundPaymentsInstanceReport() {
    return inboundPaymentsInstanceReport;
  }

  public void setInboundPaymentsInstanceReport(BQInboundPaymentsRetrieveOutputModelInboundPaymentsInstanceReport inboundPaymentsInstanceReport) {
    this.inboundPaymentsInstanceReport = inboundPaymentsInstanceReport;
  }


  /**
   * Get inboundPaymentsInstanceAnalysis
   * @return inboundPaymentsInstanceAnalysis
  **/

  public BQInboundPaymentsRetrieveOutputModelInboundPaymentsInstanceAnalysis getInboundPaymentsInstanceAnalysis() {
    return inboundPaymentsInstanceAnalysis;
  }

  public void setInboundPaymentsInstanceAnalysis(BQInboundPaymentsRetrieveOutputModelInboundPaymentsInstanceAnalysis inboundPaymentsInstanceAnalysis) {
    this.inboundPaymentsInstanceAnalysis = inboundPaymentsInstanceAnalysis;
  }


}

