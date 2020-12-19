package restricted;

import java.math.BigDecimal;

public class DebitAcc extends Account {
	private BigDecimal limit = BigDecimal.ZERO;
	public DebitAcc(String number) {
		super(number);
	}

		@Override
	BigDecimal withdraw(BigDecimal amount) {
		balance = balance.subtract(amount);
		
		if (balance.compareTo(limit) == -1) {
			System.out.println("You can't make the transaction beacause you do not have enough money");
			balance = balance.add(amount);
		}
		if (balance.compareTo(limit) == 1) {
			System.out.println("Your balance is: ");
		}if(balance.compareTo(limit) == 0) {
			System.out.println("You reached the limit, your balance equals ");
		}
		return balance;
	}
	
	@Override
	BigDecimal recalculatePercents(BigDecimal percent) {
		BigDecimal value = balance.subtract(balance.multiply(percent));
		if(value.compareTo(BigDecimal.ZERO) == -1) {
			System.out.println("not enough money");
		}if(balance.compareTo(BigDecimal.ZERO) == 1) {
			return balance.subtract(balance.multiply(percent));
	}return balance;
	
}
}
