import java.util.Scanner;
class BankAccount extends BankingSystem{
	
	BankAccount(String custName,String custId){ //declaring a Constructer to take input in the Main class
		CustomerName = custName;
		CustomerId = custId;
	}
	
	//deposit method to deposit money in the account
	 void deposit(int amount) {
		if(amount!=0) //If amount=0 then there is no meaning to keep adding the same balance
		{
			balance += amount;    //add the balance in the amount
			PreviousTransaction = amount;  //store it in and increase the previous transaction
		}
	}
	
	
	void withdraw(int amount) {
		if(amount!=0) {
			balance -= amount; //subtract the balance from the amount
			PreviousTransaction -=  amount; //subtract the balance from previous Transaction
		}
	}
	
	void getPreviousTransaction() {
		if(PreviousTransaction > 0) {
			System.out.println("Deposited:" +PreviousTransaction);
		}
		
		else if(PreviousTransaction<0) {
			System.out.println("Withdraw: " +PreviousTransaction);
		}else {
			System.out.println("No Trasnsaction Done");
		}
	}
	
	void ShowMenu() {
		char option = '\0';
		
		//Calling Scanner class to take input from the user.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome "+CustomerName+ "Your Id is "+CustomerId+ "\n Choose your Choice: \n A.Check Balance \n B.Deposit \n C.WithDraw \n D.Previous Transaction");
		System.out.println();
		
		do {
			System.out.print("Enter an Option: ");
			option = sc.next().charAt(0);
			
			
			switch(option) {
			case 'A':
				System.out.println("Your recent balance is: "+balance);
				break;
				
			case 'B':
				System.out.println("Enter an amount to deposit: ");
				int amount = sc.nextInt();
				deposit(amount);
				break;
			
			case 'C':
				System.out.println("Enter an amount to be withdrawn: ");
				int amount_withdrawn = sc.nextInt();
				withdraw(amount_withdrawn);
				break;
				
			case 'D':
				getPreviousTransaction();
			
			case 'E':
				break;
				
			default:
				System.out.println("Invalid option! Please try again");
				break;
			}
		}while(option!='E');
		
		
			System.out.println("Thank you for using our services");
	}
}






public class BankingSystem {
	
	//All variables declared in protected as they need to be accessed within same package but different classes.
	protected int balance;
	protected int PreviousTransaction;
	protected String CustomerName;
	protected String CustomerId;
	
	//getters
	public int getbalance() {
		return balance;
	}
	
	public int PreviousTransactions() {
		return PreviousTransaction;
	}
	
	
	public String CustomerName() {
		return CustomerName;
	}
	
	public String CustomerId() {
		return CustomerId;
	}
	
	//setters
	public void SetValue(int balance) {
		this.balance = balance;
	}
	
	public void SetPreviousTransaction(int PreviousTransacion) {
		this.PreviousTransaction = PreviousTransaction;
	}
	
	public void SetCustomerName(String CustomerName) {
		this.CustomerName=CustomerName;
	}
	
	public void SetCustomerId(String CustomerId) {
		this.CustomerId = CustomerId;
	}
	
}
