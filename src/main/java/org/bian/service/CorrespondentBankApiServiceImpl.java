/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CorrespondentBankApiServiceImpl implements CorrespondentBankApiService {

	public SDCorrespondentBankActivateOutputModel activate(SDCorrespondentBankActivateInputModel request){
		return JsonReader.read("activate-SDCorrespondentBankActivateOutputModel.json",new TypeReference<SDCorrespondentBankActivateOutputModel>(){});
	}
	
	public SDCorrespondentBankConfigureOutputModel configure(String sdReferenceId, SDCorrespondentBankConfigureInputModel request){
		return JsonReader.read("configure-SDCorrespondentBankConfigureOutputModel.json",new TypeReference<SDCorrespondentBankConfigureOutputModel>(){});
	}
	
	public CRCorrespondentBankFulfillmentArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRCorrespondentBankFulfillmentArrangementControlInputModel request){
		return JsonReader.read("control-CRCorrespondentBankFulfillmentArrangementControlOutputModel.json",new TypeReference<CRCorrespondentBankFulfillmentArrangementControlOutputModel>(){});
	}
	
	public BQClearingandSettlementExchangeOutputModel exchangeClearingandsettlement(String sdReferenceId, String crReferenceId, String bqReferenceId, BQClearingandSettlementExchangeInputModel request){
		return JsonReader.read("exchange-BQClearingandSettlementExchangeOutputModel.json",new TypeReference<BQClearingandSettlementExchangeOutputModel>(){});
	}
	
	public BQReconciliationsExchangeOutputModel exchangeReconciliations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReconciliationsExchangeInputModel request){
		return JsonReader.read("exchange-BQReconciliationsExchangeOutputModel.json",new TypeReference<BQReconciliationsExchangeOutputModel>(){});
	}
	
	public BQInboundPaymentsExecuteOutputModel executeInboundpayments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInboundPaymentsExecuteInputModel request){
		return JsonReader.read("execute-BQInboundPaymentsExecuteOutputModel.json",new TypeReference<BQInboundPaymentsExecuteOutputModel>(){});
	}
	
	public BQOutboundPaymentsExecuteOutputModel executeOutboundpayments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOutboundPaymentsExecuteInputModel request){
		return JsonReader.read("execute-BQOutboundPaymentsExecuteOutputModel.json",new TypeReference<BQOutboundPaymentsExecuteOutputModel>(){});
	}
	
	public SDCorrespondentBankFeedbackOutputModel feedback(String sdReferenceId, SDCorrespondentBankFeedbackInputModel request){
		return JsonReader.read("feedback-SDCorrespondentBankFeedbackOutputModel.json",new TypeReference<SDCorrespondentBankFeedbackOutputModel>(){});
	}
	
	public CRCorrespondentBankFulfillmentArrangementInitiateOutputModel initiate(String sdReferenceId, CRCorrespondentBankFulfillmentArrangementInitiateInputModel request){
		return JsonReader.read("initiate-CRCorrespondentBankFulfillmentArrangementInitiateOutputModel.json",new TypeReference<CRCorrespondentBankFulfillmentArrangementInitiateOutputModel>(){});
	}
	
	public BQClearingandSettlementRequestOutputModel requestClearingandsettlement(String sdReferenceId, String crReferenceId, String bqReferenceId, BQClearingandSettlementRequestInputModel request){
		return JsonReader.read("request-BQClearingandSettlementRequestOutputModel.json",new TypeReference<BQClearingandSettlementRequestOutputModel>(){});
	}
	
	public BQReconciliationsRequestOutputModel requestReconciliations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReconciliationsRequestInputModel request){
		return JsonReader.read("request-BQReconciliationsRequestOutputModel.json",new TypeReference<BQReconciliationsRequestOutputModel>(){});
	}
	
	public CRCorrespondentBankFulfillmentArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCorrespondentBankFulfillmentArrangementRetrieveOutputModel.json",new TypeReference<CRCorrespondentBankFulfillmentArrangementRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQClearingandSettlementRetrieveOutputModel retrieveClearingandsettlement(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQClearingandSettlementRetrieveOutputModel.json",new TypeReference<BQClearingandSettlementRetrieveOutputModel>(){});
	}
	
	public BQInboundPaymentsRetrieveOutputModel retrieveInboundpayments(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQInboundPaymentsRetrieveOutputModel.json",new TypeReference<BQInboundPaymentsRetrieveOutputModel>(){});
	}
	
	public BQOutboundPaymentsRetrieveOutputModel retrieveOutboundpayments(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQOutboundPaymentsRetrieveOutputModel.json",new TypeReference<BQOutboundPaymentsRetrieveOutputModel>(){});
	}
	
	public BQReconciliationsRetrieveOutputModel retrieveReconciliations(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQReconciliationsRetrieveOutputModel.json",new TypeReference<BQReconciliationsRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDCorrespondentBankRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCorrespondentBankRetrieveOutputModel.json",new TypeReference<SDCorrespondentBankRetrieveOutputModel>(){});
	}
	
	public CRCorrespondentBankFulfillmentArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCorrespondentBankFulfillmentArrangementUpdateInputModel request){
		return JsonReader.read("update-CRCorrespondentBankFulfillmentArrangementUpdateOutputModel.json",new TypeReference<CRCorrespondentBankFulfillmentArrangementUpdateOutputModel>(){});
	}
	
	public BQClearingandSettlementUpdateOutputModel updateClearingandsettlement(String sdReferenceId, String crReferenceId, String bqReferenceId, BQClearingandSettlementUpdateInputModel request){
		return JsonReader.read("update-BQClearingandSettlementUpdateOutputModel.json",new TypeReference<BQClearingandSettlementUpdateOutputModel>(){});
	}
	
	public BQInboundPaymentsUpdateOutputModel updateInboundpayments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInboundPaymentsUpdateInputModel request){
		return JsonReader.read("update-BQInboundPaymentsUpdateOutputModel.json",new TypeReference<BQInboundPaymentsUpdateOutputModel>(){});
	}
	
	public BQOutboundPaymentsUpdateOutputModel updateOutboundpayments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQOutboundPaymentsUpdateInputModel request){
		return JsonReader.read("update-BQOutboundPaymentsUpdateOutputModel.json",new TypeReference<BQOutboundPaymentsUpdateOutputModel>(){});
	}
	
	public BQReconciliationsUpdateOutputModel updateReconciliations(String sdReferenceId, String crReferenceId, String bqReferenceId, BQReconciliationsUpdateInputModel request){
		return JsonReader.read("update-BQReconciliationsUpdateOutputModel.json",new TypeReference<BQReconciliationsUpdateOutputModel>(){});
	}
	
}
