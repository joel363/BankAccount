
public class BankAccount {
	private String Account_holder_name;
	private String BankName;
	private float available_balance;
	private int Account_No;
	
	BankAccount(String Account_holder_name,String BankName,float available_balance,int Account_No)
	{
		this.Account_holder_name=Account_holder_name;
		this.BankName=BankName;
		if (available_balance<1000)
		{
			System.out.println("Minimum balance cannot be less than Rs.1000");
		}
		else 
		{
			this.available_balance=available_balance;
		}
		this.Account_No=Account_No;
	}
	
	void Deposit(float x)
	{
		available_balance+=x;
		System.out.println("Amount deposited successfully");
	}
	
	void displayDetails()
	{
		System.out.println("Account holder name: "+Account_holder_name);
		System.out.println("Bank Name: "+BankName);
		System.out.println("Available balance: "+available_balance);
		System.out.println("Account No: "+Account_No);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount obj=new BankAccount("John Fernandes","State Bank Of India",30000,112345678);
		obj.displayDetails();
	}

}
