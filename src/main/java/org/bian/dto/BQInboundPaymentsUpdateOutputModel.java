package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInboundPaymentsUpdateInputModelInboundPaymentsInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInboundPaymentsUpdateOutputModel
 */
public class BQInboundPaymentsUpdateOutputModel   {
  private BQInboundPaymentsUpdateInputModelInboundPaymentsInstanceRecord inboundPaymentsInstanceRecord = null;

  private String inboundPaymentsUpdateActionTaskReference = null;

  private Object inboundPaymentsUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get inboundPaymentsInstanceRecord
   * @return inboundPaymentsInstanceRecord
  **/

  public BQInboundPaymentsUpdateInputModelInboundPaymentsInstanceRecord getInboundPaymentsInstanceRecord() {
    return inboundPaymentsInstanceRecord;
  }

  public void setInboundPaymentsInstanceRecord(BQInboundPaymentsUpdateInputModelInboundPaymentsInstanceRecord inboundPaymentsInstanceRecord) {
    this.inboundPaymentsInstanceRecord = inboundPaymentsInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return inboundPaymentsUpdateActionTaskReference
  **/

  public String getInboundPaymentsUpdateActionTaskReference() {
    return inboundPaymentsUpdateActionTaskReference;
  }

  public void setInboundPaymentsUpdateActionTaskReference(String inboundPaymentsUpdateActionTaskReference) {
    this.inboundPaymentsUpdateActionTaskReference = inboundPaymentsUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return inboundPaymentsUpdateActionTaskRecord
  **/

  public Object getInboundPaymentsUpdateActionTaskRecord() {
    return inboundPaymentsUpdateActionTaskRecord;
  }

  public void setInboundPaymentsUpdateActionTaskRecord(Object inboundPaymentsUpdateActionTaskRecord) {
    this.inboundPaymentsUpdateActionTaskRecord = inboundPaymentsUpdateActionTaskRecord;
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

