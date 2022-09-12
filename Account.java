package BaitapLTHDT;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Account {
	private long accountNumber;
	private String name;
	private double balance;
	private final double RATE = 0.0035;
	
	public Account() {
		accountNumber = 999999;
		name = "Chua xac dinh";
		balance = 50000;
	}
	
	public Account(long accountNumber, String name) {
		if(accountNumber <= 0)
			this.accountNumber = 999999;
		else 
			this.accountNumber = accountNumber;
		if(name.equals(""))
			this.name =" Chua xac dinh";
		else
			this.name = name;
		balance = 50000;
	}

	public Account(long accountNumber, String name, double balance) {
		if(accountNumber <= 0)
			this.accountNumber = 999999;
		else 
			this.accountNumber = accountNumber;
		if(name.equals(""))
			this.name = " Cha xac dinh";
		else 
			this.name = name;
		if(balance < 50000)
			this.balance = balance;
		else
			this.balance = balance;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getRATE() {
		return RATE;
	}
	
	public boolean deposit(double amount) {
		System.out.print("Nhap so tien can nap: ");
		
		if(amount > 0) {
			this.balance += amount;
			return true;
		}
		return false;
	}
//	
//	public boolean withdraw(double amount, double fee) {
//		if( amount > 0 && amount <= balance)
//			
//	}
	
	public void addInterest() {
		
	}
	
	public boolean transfer(Account acc2, double amount){
		if(amount > 0 && balance >= amount) {
			this.balance -= amount;
			acc2.balance += amount;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		Locale local = new Locale("vi","VN");
		NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
		
		// TODO Auto-generated method stub
		return "Account [accountNumber =" + accountNumber +", name=" +name+", balance=" +formatter.format(balance)+", RATE=" +RATE+"]";
	}

	
	
	
}
