package org.json.simple.parser;

import java.util.Scanner;
class Find{
	public double factorial(int n){
		int i;
		double fact=1;
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}

public class Numberoftrees {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Find f=new Find();
		System.out.println("enter the number of values you want to enter.");
		int n=scan.nextInt();
		int i;
		double value1,value2,value3;
		double answer;
		int array[]=new int[n];
		for(i=0;i<n;i++)
		{
			array[i]=scan.nextInt();
		}
		for(i=0;i<n;i++)
		{
			//(2n!)/(n+1)!n!
			value1=f.factorial(array[i]);
			value2=f.factorial(array[i]+1);
			value3=f.factorial(2*array[i]);
			//System.out.println(value1+" "+value2+" "+value3);
			value2=value1*value2;
			answer=value3/value2;
			System.out.println(answer+" ");
		}
	}
}
