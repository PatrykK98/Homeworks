package Banks;

import java.math.BigDecimal;

import restricted.Account;
import restricted.Bank;
import restricted.CreditAcc;
import restricted.DebitAcc;

public class BankApp {

	static {
		initBanking();
	}

	public static void main(String[] args) {
		Bank lloyds = new Bank("Lloyds");
		Bank alior = new Bank("Alior");
		Account personal = new CreditAcc("12345", new BigDecimal("-50"));
		Account corporate = new DebitAcc("54321");

		try {
			System.out.println(NationalBank.getByName("Lloyds"));
		} catch (BankNotFoundException e) {
			System.out.println(e.getMessage());
		}
		try {
			System.out.println(NationalBank.getByName("Alior"));
		} catch (BankNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

	private static void initBanking() {

		Bank lloyds = new Bank("Lloyds");
		Bank alior = new Bank("Alior");
		Account personal = new CreditAcc("12345", new BigDecimal("-50"));
		Account corporate = new DebitAcc("54321");
		lloyds.registerCreditAccount(personal);
		alior.registerDebitAccount(corporate);
		NationalBank.registerBank(lloyds);
		NationalBank.registerBank(alior);
		alior.topUp("54321", new BigDecimal("100"));
		alior.withdraw("54321", new BigDecimal("100"));
		System.out.println(alior.recalculatePercents("54321",new BigDecimal("0.2")));

	}

}
