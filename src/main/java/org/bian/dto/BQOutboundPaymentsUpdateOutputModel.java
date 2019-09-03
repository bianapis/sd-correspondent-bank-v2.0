package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOutboundPaymentsUpdateInputModelOutboundPaymentsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOutboundPaymentsUpdateOutputModel
 */
public class BQOutboundPaymentsUpdateOutputModel   {
  private BQOutboundPaymentsUpdateInputModelOutboundPaymentsInstanceRecord outboundPaymentsInstanceRecord = null;

  private String outboundPaymentsUpdateActionTaskReference = null;

  private Object outboundPaymentsUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get outboundPaymentsInstanceRecord
   * @return outboundPaymentsInstanceRecord
  **/

  public BQOutboundPaymentsUpdateInputModelOutboundPaymentsInstanceRecord getOutboundPaymentsInstanceRecord() {
    return outboundPaymentsInstanceRecord;
  }

  public void setOutboundPaymentsInstanceRecord(BQOutboundPaymentsUpdateInputModelOutboundPaymentsInstanceRecord outboundPaymentsInstanceRecord) {
    this.outboundPaymentsInstanceRecord = outboundPaymentsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return outboundPaymentsUpdateActionTaskReference
  **/

  public String getOutboundPaymentsUpdateActionTaskReference() {
    return outboundPaymentsUpdateActionTaskReference;
  }

  public void setOutboundPaymentsUpdateActionTaskReference(String outboundPaymentsUpdateActionTaskReference) {
    this.outboundPaymentsUpdateActionTaskReference = outboundPaymentsUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return outboundPaymentsUpdateActionTaskRecord
  **/

  public Object getOutboundPaymentsUpdateActionTaskRecord() {
    return outboundPaymentsUpdateActionTaskRecord;
  }

  public void setOutboundPaymentsUpdateActionTaskRecord(Object outboundPaymentsUpdateActionTaskRecord) {
    this.outboundPaymentsUpdateActionTaskRecord = outboundPaymentsUpdateActionTaskRecord;
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

