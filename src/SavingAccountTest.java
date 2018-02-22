import java.util.Scanner;

public class SavingAccountTest {

	public static void main(String[] args) {
	
	Scanner scan = new Scanner (System.in);
	
	SavingAccount account1 = new SavingAccount ("Jay", 100134, 100.00);
	
	SavingAccount account2 = new SavingAccount ("Aileen", 100190, 1000.00);
	
	SavingAccount account3 = new SavingAccount ("John", 100153, 3213.00);
	System.out.println("Enter Your Name A Pin And A Balance");
	String username = scan.nextLine();
	int save = scan.nextInt();
	double savingaccount = scan.nextDouble();
	
	SavingAccount current5 = new SavingAccount (username, save, savingaccount);
	System.out.println(account1.Withdraw(50.00));
	System.out.println(account2.Deposit(700.00));
	SavingAccount current6 = new SavingAccount ("Aileen", 100190, 1000.00);
	



}
	
	}


