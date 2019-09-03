package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOutboundPaymentsRetrieveOutputModelCorrespondentBankFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQOutboundPaymentsRetrieveOutputModelOutboundPaymentsInstanceAnalysis;
import org.bian.dto.BQOutboundPaymentsRetrieveOutputModelOutboundPaymentsInstanceRecord;
import org.bian.dto.BQOutboundPaymentsRetrieveOutputModelOutboundPaymentsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQOutboundPaymentsRetrieveOutputModel
 */
public class BQOutboundPaymentsRetrieveOutputModel   {
  private BQOutboundPaymentsRetrieveOutputModelCorrespondentBankFulfillmentArrangementInstanceRecord correspondentBankFulfillmentArrangementInstanceRecord = null;

  private BQOutboundPaymentsRetrieveOutputModelOutboundPaymentsInstanceRecord outboundPaymentsInstanceRecord = null;

  private String outboundPaymentsRetrieveActionTaskReference = null;

  private Object outboundPaymentsRetrieveActionTaskRecord = null;

  private String outboundPaymentsRetrieveActionResponse = null;

  private BQOutboundPaymentsRetrieveOutputModelOutboundPaymentsInstanceReport outboundPaymentsInstanceReport = null;

  private BQOutboundPaymentsRetrieveOutputModelOutboundPaymentsInstanceAnalysis outboundPaymentsInstanceAnalysis = null;


  /**
   * Get correspondentBankFulfillmentArrangementInstanceRecord
   * @return correspondentBankFulfillmentArrangementInstanceRecord
  **/

  public BQOutboundPaymentsRetrieveOutputModelCorrespondentBankFulfillmentArrangementInstanceRecord getCorrespondentBankFulfillmentArrangementInstanceRecord() {
    return correspondentBankFulfillmentArrangementInstanceRecord;
  }

  public void setCorrespondentBankFulfillmentArrangementInstanceRecord(BQOutboundPaymentsRetrieveOutputModelCorrespondentBankFulfillmentArrangementInstanceRecord correspondentBankFulfillmentArrangementInstanceRecord) {
    this.correspondentBankFulfillmentArrangementInstanceRecord = correspondentBankFulfillmentArrangementInstanceRecord;
  }


  /**
   * Get outboundPaymentsInstanceRecord
   * @return outboundPaymentsInstanceRecord
  **/

  public BQOutboundPaymentsRetrieveOutputModelOutboundPaymentsInstanceRecord getOutboundPaymentsInstanceRecord() {
    return outboundPaymentsInstanceRecord;
  }

  public void setOutboundPaymentsInstanceRecord(BQOutboundPaymentsRetrieveOutputModelOutboundPaymentsInstanceRecord outboundPaymentsInstanceRecord) {
    this.outboundPaymentsInstanceRecord = outboundPaymentsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Outbound Payments instance retrieve service call 
   * @return outboundPaymentsRetrieveActionTaskReference
  **/

  public String getOutboundPaymentsRetrieveActionTaskReference() {
    return outboundPaymentsRetrieveActionTaskReference;
  }

  public void setOutboundPaymentsRetrieveActionTaskReference(String outboundPaymentsRetrieveActionTaskReference) {
    this.outboundPaymentsRetrieveActionTaskReference = outboundPaymentsRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return outboundPaymentsRetrieveActionTaskRecord
  **/

  public Object getOutboundPaymentsRetrieveActionTaskRecord() {
    return outboundPaymentsRetrieveActionTaskRecord;
  }

  public void setOutboundPaymentsRetrieveActionTaskRecord(Object outboundPaymentsRetrieveActionTaskRecord) {
    this.outboundPaymentsRetrieveActionTaskRecord = outboundPaymentsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return outboundPaymentsRetrieveActionResponse
  **/

  public String getOutboundPaymentsRetrieveActionResponse() {
    return outboundPaymentsRetrieveActionResponse;
  }

  public void setOutboundPaymentsRetrieveActionResponse(String outboundPaymentsRetrieveActionResponse) {
    this.outboundPaymentsRetrieveActionResponse = outboundPaymentsRetrieveActionResponse;
  }


  /**
   * Get outboundPaymentsInstanceReport
   * @return outboundPaymentsInstanceReport
  **/

  public BQOutboundPaymentsRetrieveOutputModelOutboundPaymentsInstanceReport getOutboundPaymentsInstanceReport() {
    return outboundPaymentsInstanceReport;
  }

  public void setOutboundPaymentsInstanceReport(BQOutboundPaymentsRetrieveOutputModelOutboundPaymentsInstanceReport outboundPaymentsInstanceReport) {
    this.outboundPaymentsInstanceReport = outboundPaymentsInstanceReport;
  }


  /**
   * Get outboundPaymentsInstanceAnalysis
   * @return outboundPaymentsInstanceAnalysis
  **/

  public BQOutboundPaymentsRetrieveOutputModelOutboundPaymentsInstanceAnalysis getOutboundPaymentsInstanceAnalysis() {
    return outboundPaymentsInstanceAnalysis;
  }

  public void setOutboundPaymentsInstanceAnalysis(BQOutboundPaymentsRetrieveOutputModelOutboundPaymentsInstanceAnalysis outboundPaymentsInstanceAnalysis) {
    this.outboundPaymentsInstanceAnalysis = outboundPaymentsInstanceAnalysis;
  }


}

