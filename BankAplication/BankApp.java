package Banks;

import java.math.BigDecimal;

import Accounts.Account;
import Accounts.CreditAcc;

public class BankApp {

	static {
		initBanking();
	}

	public static void main(String[] args) {
		
		try {
			System.out.println(NationalBank.getByName("Lloyds"));
		} catch (BankNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void initBanking() {

		Bank lloyds = new Bank("Lloyds");
		Bank alior = new Bank("Alior");
		Account personal = new CreditAcc("12345");
		lloyds.registerAccount(personal);
		NationalBank.registerBank(lloyds);
		NationalBank.registerBank(alior);
		lloyds.topUp("12345", new BigDecimal("450"));
		lloyds.withdraw("12345", new BigDecimal("125"));

	}

}
