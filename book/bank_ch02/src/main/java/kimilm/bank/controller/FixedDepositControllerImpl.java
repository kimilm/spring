package kimilm.bank.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import kimilm.bank.domain.FixedDepositDetails;
import kimilm.bank.service.FixedDepositService;

public class FixedDepositControllerImpl implements FixedDepositController {
	private static Logger logger = LogManager.getLogger(FixedDepositControllerImpl.class);
	
	private FixedDepositService fixedDepositService;
	
	public FixedDepositControllerImpl() {
		logger.info("initializing");
	}
	
	public FixedDepositService getFixedDepositService() {
		return fixedDepositService;
	}
	
	public void setFixedDepositService(FixedDepositService fixedDepositService) {
		logger.info("Setting fixedDepositService property");
		this.fixedDepositService = fixedDepositService;
	}
	
	public boolean submit() {
		return fixedDepositService.createFixedDeposit(new FixedDepositDetails(
				1, 10000, 365, "someemail@something.com"));
	}
	
	public FixedDepositDetails get() {
		return fixedDepositService.getFixedDepositDetails(1L);
	}
}
