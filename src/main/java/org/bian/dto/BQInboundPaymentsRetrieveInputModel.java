package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInboundPaymentsRetrieveInputModelInboundPaymentsInstanceAnalysis;
import org.bian.dto.BQInboundPaymentsRetrieveInputModelInboundPaymentsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQInboundPaymentsRetrieveInputModel
 */
public class BQInboundPaymentsRetrieveInputModel   {
  private Object inboundPaymentsRetrieveActionTaskRecord = null;

  private String inboundPaymentsRetrieveActionRequest = null;

  private BQInboundPaymentsRetrieveInputModelInboundPaymentsInstanceReport inboundPaymentsInstanceReport = null;

  private BQInboundPaymentsRetrieveInputModelInboundPaymentsInstanceAnalysis inboundPaymentsInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return inboundPaymentsRetrieveActionRequest
  **/

  public String getInboundPaymentsRetrieveActionRequest() {
    return inboundPaymentsRetrieveActionRequest;
  }

  public void setInboundPaymentsRetrieveActionRequest(String inboundPaymentsRetrieveActionRequest) {
    this.inboundPaymentsRetrieveActionRequest = inboundPaymentsRetrieveActionRequest;
  }


  /**
   * Get inboundPaymentsInstanceReport
   * @return inboundPaymentsInstanceReport
  **/

  public BQInboundPaymentsRetrieveInputModelInboundPaymentsInstanceReport getInboundPaymentsInstanceReport() {
    return inboundPaymentsInstanceReport;
  }

  public void setInboundPaymentsInstanceReport(BQInboundPaymentsRetrieveInputModelInboundPaymentsInstanceReport inboundPaymentsInstanceReport) {
    this.inboundPaymentsInstanceReport = inboundPaymentsInstanceReport;
  }


  /**
   * Get inboundPaymentsInstanceAnalysis
   * @return inboundPaymentsInstanceAnalysis
  **/

  public BQInboundPaymentsRetrieveInputModelInboundPaymentsInstanceAnalysis getInboundPaymentsInstanceAnalysis() {
    return inboundPaymentsInstanceAnalysis;
  }

  public void setInboundPaymentsInstanceAnalysis(BQInboundPaymentsRetrieveInputModelInboundPaymentsInstanceAnalysis inboundPaymentsInstanceAnalysis) {
    this.inboundPaymentsInstanceAnalysis = inboundPaymentsInstanceAnalysis;
  }


}

