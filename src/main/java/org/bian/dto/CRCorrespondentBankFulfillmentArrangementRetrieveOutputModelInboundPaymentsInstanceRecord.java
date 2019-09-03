package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorrespondentBankFulfillmentArrangementRetrieveOutputModelInboundPaymentsInstanceRecordCorrespondentTransactionRecord;

import javax.validation.Valid;
  
/**
 * CRCorrespondentBankFulfillmentArrangementRetrieveOutputModelInboundPaymentsInstanceRecord
 */
public class CRCorrespondentBankFulfillmentArrangementRetrieveOutputModelInboundPaymentsInstanceRecord   {
  private CRCorrespondentBankFulfillmentArrangementRetrieveOutputModelInboundPaymentsInstanceRecordCorrespondentTransactionRecord correspondentTransactionRecord = null;


  /**
   * Get correspondentTransactionRecord
   * @return correspondentTransactionRecord
  **/

  public CRCorrespondentBankFulfillmentArrangementRetrieveOutputModelInboundPaymentsInstanceRecordCorrespondentTransactionRecord getCorrespondentTransactionRecord() {
    return correspondentTransactionRecord;
  }

  public void setCorrespondentTransactionRecord(CRCorrespondentBankFulfillmentArrangementRetrieveOutputModelInboundPaymentsInstanceRecordCorrespondentTransactionRecord correspondentTransactionRecord) {
    this.correspondentTransactionRecord = correspondentTransactionRecord;
  }


}

