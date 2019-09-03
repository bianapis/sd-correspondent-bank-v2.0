package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOutboundPaymentsExecuteInputModelOutboundPaymentsInstanceRecordCorrespondentTransactionRecord;

import javax.validation.Valid;
  
/**
 * BQOutboundPaymentsExecuteInputModelOutboundPaymentsInstanceRecord
 */
public class BQOutboundPaymentsExecuteInputModelOutboundPaymentsInstanceRecord   {
  private BQOutboundPaymentsExecuteInputModelOutboundPaymentsInstanceRecordCorrespondentTransactionRecord correspondentTransactionRecord = null;


  /**
   * Get correspondentTransactionRecord
   * @return correspondentTransactionRecord
  **/

  public BQOutboundPaymentsExecuteInputModelOutboundPaymentsInstanceRecordCorrespondentTransactionRecord getCorrespondentTransactionRecord() {
    return correspondentTransactionRecord;
  }

  public void setCorrespondentTransactionRecord(BQOutboundPaymentsExecuteInputModelOutboundPaymentsInstanceRecordCorrespondentTransactionRecord correspondentTransactionRecord) {
    this.correspondentTransactionRecord = correspondentTransactionRecord;
  }


}

