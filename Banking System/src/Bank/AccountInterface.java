package Bank;
/**
 * 
 * @author Darshankumar Patel
 * Date- MAR 31, 2022
 *
 */
import java.util.Scanner;
public class AccountInterface {
	
	BankAccount b1=new BankAccount(null,0.0); //create null value constructor
	void displaymenu()     //menu display till exit is press(0)
	{
		Scanner sc=new Scanner(System.in); 
		int ch;  //variable for storing option entered by user. 
		do {
			//menu
			System.out.println("\t\t\t\t\tWelcome to Banking Program");
			System.out.println("\t\t\t\t\t1.)Open New Account");
			System.out.println("\t\t\t\t\t2.)Deposit An Amount");
			System.out.println("\t\t\t\t\t3.)Withdraw An Amount");
			System.out.println("\t\t\t\t\t4.)Check Balance of Account");
			System.out.println("\t\t\t\t\t0.)Exit the System");
			System.out.print("Please Select An Option:");
			ch=sc.nextInt();  
			switch(ch) {
				//open account
				case 1:
					sc.nextLine();
					System.out.print("Enter Your Name and Account Balance:");
					String n=sc.nextLine();   //store name
					Double b=sc.nextDouble(); // store initial balance entered by User.
					if(b>0) {   
						b1=new BankAccount(n,b);  //passing value to constructor using object.
						//System.out.println(b1.toString());
					}
					else {
						System.out.println("Enter Appropriate Amount"+"\nBalance cannot be Negative");
					}
					break;
				//deposit amount
				case 2:
					if(b1.getName()==null)  //check for account exist or not
					{
						System.out.println("You don't have an account yet!!!!!");
					}
					else {
						System.out.print("Enter Amount you want to Deposit:");
						double amount=sc.nextDouble();
						b1.deposit(amount);  //calling deposit method.
					}
					break;
				//withdraw amount
				case 3:
					if(b1.getName()==null)  //check for account exist or not
					{
						System.out.println("You don't have an account yet!!!!!");
					}
					else {
						System.out.print("Enter Amount you want to Withdraw:");
						double amount=sc.nextDouble();
						b1.withdraw(amount); //calling withdraw method.
					}
					break;
				//check balance
				case 4:
					if(b1.getName()==null)  //check for account exist or not
					{
						System.out.println("You don't have an account yet!!!!!");
					}
					else {
						System.out.println(b1.toString());  //display account information.
					}
					break;
				//exit system 
				case 0: 
					System.out.println("\t\t\t\t\tThank You For Using The System!!!!!");
					break;
				//invalid option
				default:
					System.out.println("Please Enter Valid Option");
					break;
			}
		}while(ch!=0);
	}
}