package Bank;
/**
 * 
 * @author Darshankumar Patel
 * Date- MAR 31, 2022
 *
 */
import java.util.Random;
public class BankAccount {
		
		private String Name;  //account holder name
		private double Balance; //account balance
		
		//AccountNumber random generate starting from 5001 to 9999.
		Random randomNumber=new Random();
		int Account_No = randomNumber.nextInt(5001,9999);		
		
		BankAccount(String n,double b){ //2 argument Constructor
			Name=n;
			Balance=b;
		}
		
		BankAccount(BankAccount b1){ //copy constructor
			Name=b1.getName();
			Balance=b1.getBalance();
		}
		
		public boolean equals(BankAccount b2) //equals function
		{
			boolean status;
			if( Name==b2.getName() && Account_No==b2.getAccount_No())
				status=true;
			else
				status=false;
			return status;
		}
		
		public String toString() {  //tostring function
			return("\t\tAccount Number:"+Account_No+"\n\t\tAccount Holder Name:"+Name+"\n\t\tAccount Balance:"+Balance+"\n\n");
		}
		
		//getter and setter for name and balance and account_no
		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public double getBalance() {
			return Balance;
		}

		public void setBalance(double balance) {
			Balance = balance;
		}
		
		public int getAccount_No() {
			return Account_No;
		}

		public void setAccount_No(int account_No) {
			Account_No = account_No;
		}
		
		public void deposit(double amount) {
			if(amount>0) {
				Balance=Balance+amount;
				System.out.println("Your Current Balance Updated to:"+Balance);
			}
			else {
				System.out.println("Please Enter Appropriate Amount!!!!!");
			}
		}
		public void withdraw(double amount) {
			if(Balance<=amount || amount<0) {
				System.out.println("ERROR!!!Transcation Failed...");
			}
			else {
				Balance=Balance-amount;
				System.out.println(amount+" withdraw successful \n Current Balance Remaining:"+Balance);
			}
		}
}
