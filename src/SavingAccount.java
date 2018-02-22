
public class SavingAccount {
	String UserName;
	int Pin;
	double Balance;
	
	
	public SavingAccount(String UserName1, int Pin1, double Balance1) {
		// TODO Auto-generated constructor stub
		UserName = UserName1;
		Pin = Pin1;
		Balance = Balance1;

	}
	
public double  Withdraw(double amount )
{
	
	return (Balance - amount);
}


public double Deposit(double amount)
{
	
	return (Balance + amount);
}

}
