package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInboundPaymentsExecuteInputModelInboundPaymentsInstanceRecordCorrespondentTransactionRecord;

import javax.validation.Valid;
  
/**
 * BQInboundPaymentsExecuteInputModelInboundPaymentsInstanceRecord
 */
public class BQInboundPaymentsExecuteInputModelInboundPaymentsInstanceRecord   {
  private BQInboundPaymentsExecuteInputModelInboundPaymentsInstanceRecordCorrespondentTransactionRecord correspondentTransactionRecord = null;


  /**
   * Get correspondentTransactionRecord
   * @return correspondentTransactionRecord
  **/

  public BQInboundPaymentsExecuteInputModelInboundPaymentsInstanceRecordCorrespondentTransactionRecord getCorrespondentTransactionRecord() {
    return correspondentTransactionRecord;
  }

  public void setCorrespondentTransactionRecord(BQInboundPaymentsExecuteInputModelInboundPaymentsInstanceRecordCorrespondentTransactionRecord correspondentTransactionRecord) {
    this.correspondentTransactionRecord = correspondentTransactionRecord;
  }


}

