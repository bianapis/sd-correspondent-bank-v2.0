package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCorrespondentBankFulfillmentArrangementRetrieveOutputModelInboundPaymentsInstanceRecordCorrespondentTransactionRecordDateType;

import javax.validation.Valid;
  
/**
 * BQInboundPaymentsExecuteInputModelInboundPaymentsInstanceRecordCorrespondentTransactionRecord
 */
public class BQInboundPaymentsExecuteInputModelInboundPaymentsInstanceRecordCorrespondentTransactionRecord   {
  private String sWIFTTransactionReference = null;

  private String payerBankReference = null;

  private String payerReference = null;

  private String correspondedBankReference = null;

  private String payerProductInstanceReference = null;

  private String payeeReference = null;

  private String payeeProductInstanceReference = null;

  private String payeeBankReference = null;

  private String specialInstructions = null;

  private String amount = null;

  private String currency = null;

  private CRCorrespondentBankFulfillmentArrangementRetrieveOutputModelInboundPaymentsInstanceRecordCorrespondentTransactionRecordDateType dateType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info:  
   * @return sWIFTTransactionReference
  **/

  public String getSWIFTTransactionReference() {
    return sWIFTTransactionReference;
  }

  public void setSWIFTTransactionReference(String sWIFTTransactionReference) {
    this.sWIFTTransactionReference = sWIFTTransactionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The primary correspondent bank 
   * @return payerBankReference
  **/

  public String getPayerBankReference() {
    return payerBankReference;
  }

  public void setPayerBankReference(String payerBankReference) {
    this.payerBankReference = payerBankReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the payer  
   * @return payerReference
  **/

  public String getPayerReference() {
    return payerReference;
  }

  public void setPayerReference(String payerReference) {
    this.payerReference = payerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Intermediary correspondents if needed 
   * @return correspondedBankReference
  **/

  public String getCorrespondedBankReference() {
    return correspondedBankReference;
  }

  public void setCorrespondedBankReference(String correspondedBankReference) {
    this.correspondedBankReference = correspondedBankReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Payer account reference or number 
   * @return payerProductInstanceReference
  **/

  public String getPayerProductInstanceReference() {
    return payerProductInstanceReference;
  }

  public void setPayerProductInstanceReference(String payerProductInstanceReference) {
    this.payerProductInstanceReference = payerProductInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the payee 
   * @return payeeReference
  **/

  public String getPayeeReference() {
    return payeeReference;
  }

  public void setPayeeReference(String payeeReference) {
    this.payeeReference = payeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the payee account as source of funds 
   * @return payeeProductInstanceReference
  **/

  public String getPayeeProductInstanceReference() {
    return payeeProductInstanceReference;
  }

  public void setPayeeProductInstanceReference(String payeeProductInstanceReference) {
    this.payeeProductInstanceReference = payeeProductInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the payee's bank as the receiver of funds 
   * @return payeeBankReference
  **/

  public String getPayeeBankReference() {
    return payeeBankReference;
  }

  public void setPayeeBankReference(String payeeBankReference) {
    this.payeeBankReference = payeeBankReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Transaction specific clearing and settlement instructions 
   * @return specialInstructions
  **/

  public String getSpecialInstructions() {
    return specialInstructions;
  }

  public void setSpecialInstructions(String specialInstructions) {
    this.specialInstructions = specialInstructions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Amount  general-info: Key amounts of the transaction 
   * @return amount
  **/

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency  general-info: Currencies of the amounts 
   * @return currency
  **/

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  /**
   * Get dateType
   * @return dateType
  **/

  public CRCorrespondentBankFulfillmentArrangementRetrieveOutputModelInboundPaymentsInstanceRecordCorrespondentTransactionRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRCorrespondentBankFulfillmentArrangementRetrieveOutputModelInboundPaymentsInstanceRecordCorrespondentTransactionRecordDateType dateType) {
    this.dateType = dateType;
  }


}

