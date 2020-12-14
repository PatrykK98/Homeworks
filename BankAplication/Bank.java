package Banks;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import javax.security.auth.login.AccountNotFoundException;

import Accounts.Account;

public class Bank {
	private String name;
	private Account account;

	public Bank(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	final Map<String, Account> accountList = new HashMap<>();

	public void registerAccount(Account a) {
		accountList.put(a.getNumber(), a);
	}

	public void topUp(String accountNumber, BigDecimal amount) {
		accountList.get(accountNumber).topUp(amount);
	}

	BigDecimal withdraw(String accountNumber, BigDecimal amount) {
		return accountList.get(accountNumber).withdraw(amount);
	}

	@Override
	public String toString() {
		return "Bank [name=" + name + accountList + "]";
	}

}