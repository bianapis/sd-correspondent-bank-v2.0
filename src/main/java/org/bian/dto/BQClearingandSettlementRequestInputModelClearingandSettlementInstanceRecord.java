package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQClearingandSettlementRequestInputModelClearingandSettlementInstanceRecord
 */
public class BQClearingandSettlementRequestInputModelClearingandSettlementInstanceRecord   {
  private String clearingTransaction = null;

  private String settlementTransaction = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A record of a clearing transaction 
   * @return clearingTransaction
  **/

  public String getClearingTransaction() {
    return clearingTransaction;
  }

  public void setClearingTransaction(String clearingTransaction) {
    this.clearingTransaction = clearingTransaction;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A record of a settlement transaction 
   * @return settlementTransaction
  **/

  public String getSettlementTransaction() {
    return settlementTransaction;
  }

  public void setSettlementTransaction(String settlementTransaction) {
    this.settlementTransaction = settlementTransaction;
  }


}

