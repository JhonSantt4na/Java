package _09_Interfaces.ExeEmpresa.Model.Services;

import _09_Interfaces.ExeEmpresa.Model.Entities.Contract;
import _09_Interfaces.ExeEmpresa.Model.Entities.Instaliment;

import java.time.LocalDate;

public class ContractService {
	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	public void ProcessCrontract(Contract contract, int months) {
		// Instanciando manualmente:
		// contract.getInstalments().add(new Instaliment(LocalDate.of(2018,7,25), 206.04));
		
		double basicQuota = contract.getTotalValue() / months;
		
		for (int i = 1 ; i <= months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			
			double interest = onlinePaymentService.interest(basicQuota, i); ;
			double fee = onlinePaymentService.paymentFee(basicQuota + interest);
			double quota = basicQuota + interest + fee;
			
			contract.getInstalments().add(new Instaliment(dueDate, quota));
		}
	}
}
