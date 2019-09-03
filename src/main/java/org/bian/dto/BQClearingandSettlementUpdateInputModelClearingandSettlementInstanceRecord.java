package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQClearingandSettlementUpdateInputModelClearingandSettlementInstanceRecord
 */
public class BQClearingandSettlementUpdateInputModelClearingandSettlementInstanceRecord   {
  private String correspondentBankClearingArrangementReference = null;

  private String correspondentBankClearingArrangementClearingInstructions = null;

  private String correspondentBankClearingArrangementSettlementInstructions = null;

  private String mirrorNostroAccountReference = null;

  private String clearingTransaction = null;

  private String settlementTransaction = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The clearing arrangement between the bank and clearing house - includes schedule, limits 
   * @return correspondentBankClearingArrangementReference
  **/

  public String getCorrespondentBankClearingArrangementReference() {
    return correspondentBankClearingArrangementReference;
  }

  public void setCorrespondentBankClearingArrangementReference(String correspondentBankClearingArrangementReference) {
    this.correspondentBankClearingArrangementReference = correspondentBankClearingArrangementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Customer specific default clearing instructions 
   * @return correspondentBankClearingArrangementClearingInstructions
  **/

  public String getCorrespondentBankClearingArrangementClearingInstructions() {
    return correspondentBankClearingArrangementClearingInstructions;
  }

  public void setCorrespondentBankClearingArrangementClearingInstructions(String correspondentBankClearingArrangementClearingInstructions) {
    this.correspondentBankClearingArrangementClearingInstructions = correspondentBankClearingArrangementClearingInstructions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Customer specific default settlement instructions (e.g. to handle netting arrangements) 
   * @return correspondentBankClearingArrangementSettlementInstructions
  **/

  public String getCorrespondentBankClearingArrangementSettlementInstructions() {
    return correspondentBankClearingArrangementSettlementInstructions;
  }

  public void setCorrespondentBankClearingArrangementSettlementInstructions(String correspondentBankClearingArrangementSettlementInstructions) {
    this.correspondentBankClearingArrangementSettlementInstructions = correspondentBankClearingArrangementSettlementInstructions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info:  Used for central bank clearing reconciliations 
   * @return mirrorNostroAccountReference
  **/

  public String getMirrorNostroAccountReference() {
    return mirrorNostroAccountReference;
  }

  public void setMirrorNostroAccountReference(String mirrorNostroAccountReference) {
    this.mirrorNostroAccountReference = mirrorNostroAccountReference;
  }


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

