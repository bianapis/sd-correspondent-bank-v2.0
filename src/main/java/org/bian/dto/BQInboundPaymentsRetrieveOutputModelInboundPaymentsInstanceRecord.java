package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInboundPaymentsRetrieveOutputModelInboundPaymentsInstanceRecordCorrespondentTransactionRecord;

import javax.validation.Valid;
  
/**
 * BQInboundPaymentsRetrieveOutputModelInboundPaymentsInstanceRecord
 */
public class BQInboundPaymentsRetrieveOutputModelInboundPaymentsInstanceRecord   {
  private BQInboundPaymentsRetrieveOutputModelInboundPaymentsInstanceRecordCorrespondentTransactionRecord correspondentTransactionRecord = null;


  /**
   * Get correspondentTransactionRecord
   * @return correspondentTransactionRecord
  **/

  public BQInboundPaymentsRetrieveOutputModelInboundPaymentsInstanceRecordCorrespondentTransactionRecord getCorrespondentTransactionRecord() {
    return correspondentTransactionRecord;
  }

  public void setCorrespondentTransactionRecord(BQInboundPaymentsRetrieveOutputModelInboundPaymentsInstanceRecordCorrespondentTransactionRecord correspondentTransactionRecord) {
    this.correspondentTransactionRecord = correspondentTransactionRecord;
  }


}

