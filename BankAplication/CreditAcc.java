package restricted;

import java.math.BigDecimal;

public class CreditAcc extends Account {
	BigDecimal limit;

	public CreditAcc(String number, BigDecimal limit) {
		super(number);
		this.limit=limit;
	}
	@Override
	BigDecimal withdraw(BigDecimal amount) {
		balance = balance.subtract(amount);
		if (balance.compareTo(limit) == -1) {
			System.out.println("You can't make the transaction beacause you do not have enough money");
			balance = balance.add(amount);
		}
		if (balance.compareTo(limit) == 1) {
			return balance;
		}
		if(balance.compareTo(limit) == 0) {
			System.out.println("You reached the limit which is: "+limit);
		}
		return balance;
	}
	
	@Override
	BigDecimal recalculatePercents(BigDecimal percent) {
		if(balance.compareTo(BigDecimal.ZERO) == 1) {
		return balance.subtract(balance.multiply(percent));
		}
		else if((balance.compareTo(BigDecimal.ZERO) == -1)){
			return balance.add(balance.multiply(percent));
		}
		return balance;
	}
	public BigDecimal getLimit() {
		return limit;
	}
	

}
