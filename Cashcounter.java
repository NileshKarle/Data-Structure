package org.json.simple.parser;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Bank {
	public String Name;
	private int Accno;
	private int balance;
	static public int Bankbalance=1000000;
	Scanner scan=new Scanner(System.in);
	Bank()
	{
	}
	Bank(String Name,int Accno,int balance){
		this.Name=Name;
		this.Accno=Accno;
		this.balance=balance;
		System.out.println("updated");
	}
	void process(){
		int number=1,val;
		while(number!=0){
			System.out.println("enter 1 to check balance");
			System.out.println("enter 2 to withdraw amount");
			System.out.println("enter 3 to deposit amount");
			System.out.println("enter 0 to quit");
			number=scan.nextInt();
			if(number==1){
				val=checkBalance();
				System.out.println("your balance is "+val);
			}
			if(number==2){
				System.out.println("enter the amount you want to remove ");
				val=scan.nextInt();
				withdraw(val);
			}
			if(number==3){
				System.out.println("enter the amount you want to add ");
				val=scan.nextInt();
				deposite(val);
			}
			if(number==0)
			{
				System.out.println("thankyou for banking");
				System.out.println("bank balance is "+Bankbalance+" .");
			}
			else
			{
				System.out.println("enter a valid input ");
			}
		}
	}
	public int checkBalance(){
		return balance;
	}
	public void withdraw(int amount){
		if(balance>amount)
		{
		balance-=amount;
		this.Bankbalance-=amount;
		if(Bankbalance<=0)
		{
			System.out.println("bank has closed.");
			System.exit(0);
		}
		System.out.println("Amount "+amount+" removed from account number "+Accno+" balance left "+balance);
		}
		else
		{
			System.out.println("amount is high");
		}
	}
	public void deposite(int amount){
		balance+=amount;
		this.Bankbalance+=amount;
		System.out.println("Amount "+amount+" added to Account number "+Accno+" new balance "+balance);
	}
}


public class Cashcounter {
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of ppl in queue ");
		int size=scan.nextInt();
		int i,Accno,balance;
		String name;
		Queue<String> q=new LinkedList<String>();
		for(i=0;i<size;i++)
		{
			System.out.println("Enter name");
			name=scan.next();
			q.add(name);
			System.out.println("Enter accno");
			Accno=scan.nextInt();
			q.add(Integer.toString(Accno));
			System.out.println("Enter balance");
			balance=scan.nextInt();
			q.add(Integer.toString(balance));
		}
		int value;
		while(q.size()>0)
		{
			System.out.println(" "+q.peek()+" your turn");
			//d.get(q.poll());	
			Bank b=new Bank(q.poll(),Integer.parseInt(q.poll()),Integer.parseInt(q.poll()));
			b.process();
		}
	}
}
