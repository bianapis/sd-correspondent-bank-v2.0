/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CorrespondentBankApiService {

	SDCorrespondentBankActivateOutputModel activate(SDCorrespondentBankActivateInputModel request);
	
	SDCorrespondentBankConfigureOutputModel configure(String sdReferenceId, SDCorrespondentBankConfigureInputModel request);
	
	CRCorrespondentBankFulfillmentArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRCorrespondentBankFulfillmentArrangementControlInputModel request);
	
	BQClearingandSettlementExchangeOutputModel exchangeClearingandsettlement(String sdReferenceId, String crReferenceId, String bqReferenceId, BQClearingandSettlementExchangeInputModel request);
	
	BQReconciliationsExchangeOutputModel exchangeReconciliations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReconciliationsExchangeInputModel request);
	
	BQInboundPaymentsExecuteOutputModel executeInboundpayments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInboundPaymentsExecuteInputModel request);
	
	BQOutboundPaymentsExecuteOutputModel executeOutboundpayments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOutboundPaymentsExecuteInputModel request);
	
	SDCorrespondentBankFeedbackOutputModel feedback(String sdReferenceId, SDCorrespondentBankFeedbackInputModel request);
	
	CRCorrespondentBankFulfillmentArrangementInitiateOutputModel initiate(String sdReferenceId, CRCorrespondentBankFulfillmentArrangementInitiateInputModel request);
	
	BQClearingandSettlementRequestOutputModel requestClearingandsettlement(String sdReferenceId, String crReferenceId, String bqReferenceId, BQClearingandSettlementRequestInputModel request);
	
	BQReconciliationsRequestOutputModel requestReconciliations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReconciliationsRequestInputModel request);
	
	CRCorrespondentBankFulfillmentArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQClearingandSettlementRetrieveOutputModel retrieveClearingandsettlement(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQInboundPaymentsRetrieveOutputModel retrieveInboundpayments(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQOutboundPaymentsRetrieveOutputModel retrieveOutboundpayments(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQReconciliationsRetrieveOutputModel retrieveReconciliations(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDCorrespondentBankRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCorrespondentBankFulfillmentArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCorrespondentBankFulfillmentArrangementUpdateInputModel request);
	
	BQClearingandSettlementUpdateOutputModel updateClearingandsettlement(String sdReferenceId, String crReferenceId, String bqReferenceId, BQClearingandSettlementUpdateInputModel request);
	
	BQInboundPaymentsUpdateOutputModel updateInboundpayments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInboundPaymentsUpdateInputModel request);
	
	BQOutboundPaymentsUpdateOutputModel updateOutboundpayments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOutboundPaymentsUpdateInputModel request);
	
	BQReconciliationsUpdateOutputModel updateReconciliations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReconciliationsUpdateInputModel request);
	
}
