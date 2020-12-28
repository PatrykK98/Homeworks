package Banks;

import java.math.BigDecimal;

import javax.security.auth.login.AccountNotFoundException;

import ExceptionClasses.BankNotFoundException;
import ExceptionClasses.NonSufficientFundsException;
import ExceptionClasses.ReachedCreditLimitException;
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
		Account pers = new CreditAcc("543", new BigDecimal("-80"));
		Account corporate = new DebitAcc("54321");
		Account corp = new DebitAcc("654");
		lloyds.registerCreditAccount(personal);
		lloyds.registerCreditAccount(pers);
		alior.registerDebitAccount(corporate);
		alior.registerDebitAccount(corp);
		NationalBank.registerBank(lloyds);
		NationalBank.registerBank(alior);
		try {
			lloyds.topUp("12345", new BigDecimal("0"));
			alior.topUp("54321", new BigDecimal("100"));
			//System.out.println(lloyds.withdraw("12345", new BigDecimal("1")));
			//System.out.println(alior.withdraw("54321", new BigDecimal("46")));
			lloyds.transfer("12345", new BigDecimal("1"), "543");
		} catch (NonSufficientFundsException e) {
			System.out.println(e.getMessage());
		} catch (ReachedCreditLimitException a) {
			System.out.println(a.getMessage());
		}catch(AccountNotFoundException b) {
			System.out.println(b.getMessage());
		}
		try {
			System.out.println(NationalBank.getByName("Lloyds"));
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


	}
}
