/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Fulfill;

@BianRestController
public class CorrespondentBankApiController {

	@Autowired
	CorrespondentBankApiService service;
	
	@Fulfill.Activate
	public BianResponse<SDCorrespondentBankActivateOutputModel> activate(@RequestBody BianRequest<SDCorrespondentBankActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Fulfill.Configure
	public BianResponse<SDCorrespondentBankConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCorrespondentBankConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Control
	public BianResponse<CRCorrespondentBankFulfillmentArrangementControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCorrespondentBankFulfillmentArrangementControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("clearingandsettlement")
	@Fulfill.Exchange
	public BianResponse<BQClearingandSettlementExchangeOutputModel> exchangeClearingandsettlement(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQClearingandSettlementExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeClearingandsettlement(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("reconciliations")
	@Fulfill.Exchange
	public BianResponse<BQReconciliationsExchangeOutputModel> exchangeReconciliations(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQReconciliationsExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeReconciliations(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("inboundpayments")
	@Fulfill.Execute
	public BianResponse<BQInboundPaymentsExecuteOutputModel> executeInboundpayments(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQInboundPaymentsExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeInboundpayments(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("outboundpayments")
	@Fulfill.Execute
	public BianResponse<BQOutboundPaymentsExecuteOutputModel> executeOutboundpayments(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQOutboundPaymentsExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeOutboundpayments(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Feedback
	public BianResponse<SDCorrespondentBankFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCorrespondentBankFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Initiate
	public BianResponse<CRCorrespondentBankFulfillmentArrangementInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRCorrespondentBankFulfillmentArrangementInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("clearingandsettlement")
	@Fulfill.Request
	public BianResponse<BQClearingandSettlementRequestOutputModel> requestClearingandsettlement(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQClearingandSettlementRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestClearingandsettlement(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("reconciliations")
	@Fulfill.Request
	public BianResponse<BQReconciliationsRequestOutputModel> requestReconciliations(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQReconciliationsRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestReconciliations(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Retrieve
	public BianResponse<CRCorrespondentBankFulfillmentArrangementRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Fulfill.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Fulfill.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("clearingandsettlement")
	@Fulfill.Retrieve
	public BianResponse<BQClearingandSettlementRetrieveOutputModel> retrieveClearingandsettlement(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveClearingandsettlement(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("inboundpayments")
	@Fulfill.Retrieve
	public BianResponse<BQInboundPaymentsRetrieveOutputModel> retrieveInboundpayments(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveInboundpayments(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("outboundpayments")
	@Fulfill.Retrieve
	public BianResponse<BQOutboundPaymentsRetrieveOutputModel> retrieveOutboundpayments(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveOutboundpayments(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("reconciliations")
	@Fulfill.Retrieve
	public BianResponse<BQReconciliationsRetrieveOutputModel> retrieveReconciliations(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReconciliations(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Fulfill.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Fulfill.RetrieveSD
	public BianResponse<SDCorrespondentBankRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Fulfill.Update
	public BianResponse<CRCorrespondentBankFulfillmentArrangementUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCorrespondentBankFulfillmentArrangementUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("clearingandsettlement")
	@Fulfill.Update
	public BianResponse<BQClearingandSettlementUpdateOutputModel> updateClearingandsettlement(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQClearingandSettlementUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateClearingandsettlement(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("inboundpayments")
	@Fulfill.Update
	public BianResponse<BQInboundPaymentsUpdateOutputModel> updateInboundpayments(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQInboundPaymentsUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateInboundpayments(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("outboundpayments")
	@Fulfill.Update
	public BianResponse<BQOutboundPaymentsUpdateOutputModel> updateOutboundpayments(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQOutboundPaymentsUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateOutboundpayments(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("reconciliations")
	@Fulfill.Update
	public BianResponse<BQReconciliationsUpdateOutputModel> updateReconciliations(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQReconciliationsUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateReconciliations(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
