package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOutboundPaymentsUpdateInputModelOutboundPaymentsInstanceRecordCorrespondentTransactionRecord;

import javax.validation.Valid;
  
/**
 * BQOutboundPaymentsUpdateInputModelOutboundPaymentsInstanceRecord
 */
public class BQOutboundPaymentsUpdateInputModelOutboundPaymentsInstanceRecord   {
  private BQOutboundPaymentsUpdateInputModelOutboundPaymentsInstanceRecordCorrespondentTransactionRecord correspondentTransactionRecord = null;


  /**
   * Get correspondentTransactionRecord
   * @return correspondentTransactionRecord
  **/

  public BQOutboundPaymentsUpdateInputModelOutboundPaymentsInstanceRecordCorrespondentTransactionRecord getCorrespondentTransactionRecord() {
    return correspondentTransactionRecord;
  }

  public void setCorrespondentTransactionRecord(BQOutboundPaymentsUpdateInputModelOutboundPaymentsInstanceRecordCorrespondentTransactionRecord correspondentTransactionRecord) {
    this.correspondentTransactionRecord = correspondentTransactionRecord;
  }


}

