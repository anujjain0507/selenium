package obj_n_class;

public class Account {
	int acct_no;
	float amount;
	String name;
	
	void insert(int a,String n,float amt)
	{
		acct_no =a;
		amount = amt;
		name = n;
	}
	
	void deposit(float amt )
	{
		amount = amount+amt;
		System.out.println(amt + "Deposit");
	}
	
	void withdraw(float amt)
	{
		if(amount<amt)
		{
			System.out.print("Insufficent Balance");
		}else{
			amount = amount-amt;
		}
		System.out.println(amt + "withdraw");
	}
	
	void BalnceCheck()
	{
		System.out.println("Balance is:" +amount);
	}
	void display()
	{
		System.out.println(acct_no+" "+name+" "+amount);
	}
}
	
	class TestAccount {
		

	public static void main(String[] args) {
		Account a1= new Account();
		a1.insert(100201212, "Anuj", 90000);
		a1.display();
		a1.BalnceCheck();
		a1.deposit(40000);
		a1.BalnceCheck();
		a1.withdraw(20000);
		a1.BalnceCheck();
	}
}
