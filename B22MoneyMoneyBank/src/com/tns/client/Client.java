package com.tns.client;

import com.cg.application.MMBankFactory;
import com.cg.application.MMCurrentAcc;
import com.cg.application.MMSavingAcc;
import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		BankFactory bf = new MMBankFactory();
	    
		SavingAcc sa = new MMSavingAcc(1,"Abdullah",2000,true);
		sa.withdraw(sa.getAccBal());
		sa.toString();
		
		CurrentAcc ca = new MMCurrentAcc(2,"MD",500,400);
		ca.withdraw(ca.getCreditLimit());
		ca.toString();
	}

}
