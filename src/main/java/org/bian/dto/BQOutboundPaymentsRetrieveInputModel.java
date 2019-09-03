package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOutboundPaymentsRetrieveInputModelOutboundPaymentsInstanceAnalysis;
import org.bian.dto.BQOutboundPaymentsRetrieveInputModelOutboundPaymentsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQOutboundPaymentsRetrieveInputModel
 */
public class BQOutboundPaymentsRetrieveInputModel   {
  private Object outboundPaymentsRetrieveActionTaskRecord = null;

  private String outboundPaymentsRetrieveActionRequest = null;

  private BQOutboundPaymentsRetrieveInputModelOutboundPaymentsInstanceReport outboundPaymentsInstanceReport = null;

  private BQOutboundPaymentsRetrieveInputModelOutboundPaymentsInstanceAnalysis outboundPaymentsInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return outboundPaymentsRetrieveActionRequest
  **/

  public String getOutboundPaymentsRetrieveActionRequest() {
    return outboundPaymentsRetrieveActionRequest;
  }

  public void setOutboundPaymentsRetrieveActionRequest(String outboundPaymentsRetrieveActionRequest) {
    this.outboundPaymentsRetrieveActionRequest = outboundPaymentsRetrieveActionRequest;
  }


  /**
   * Get outboundPaymentsInstanceReport
   * @return outboundPaymentsInstanceReport
  **/

  public BQOutboundPaymentsRetrieveInputModelOutboundPaymentsInstanceReport getOutboundPaymentsInstanceReport() {
    return outboundPaymentsInstanceReport;
  }

  public void setOutboundPaymentsInstanceReport(BQOutboundPaymentsRetrieveInputModelOutboundPaymentsInstanceReport outboundPaymentsInstanceReport) {
    this.outboundPaymentsInstanceReport = outboundPaymentsInstanceReport;
  }


  /**
   * Get outboundPaymentsInstanceAnalysis
   * @return outboundPaymentsInstanceAnalysis
  **/

  public BQOutboundPaymentsRetrieveInputModelOutboundPaymentsInstanceAnalysis getOutboundPaymentsInstanceAnalysis() {
    return outboundPaymentsInstanceAnalysis;
  }

  public void setOutboundPaymentsInstanceAnalysis(BQOutboundPaymentsRetrieveInputModelOutboundPaymentsInstanceAnalysis outboundPaymentsInstanceAnalysis) {
    this.outboundPaymentsInstanceAnalysis = outboundPaymentsInstanceAnalysis;
  }


}

