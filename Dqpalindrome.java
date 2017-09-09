package org.json.simple.parser;

import java.util.Deque;
import java.util.Scanner;
import java.util.LinkedList;
public class Dqpalindrome 
{
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string.");
		String temp=scan.next();
		temp=temp.toLowerCase();
		Deque deq= new LinkedList<String>();
		int n=temp.length(),i;
		for(i=0;i<n;i++)
		{
			deq.addFirst(temp.charAt(i));
		}
		int d=deq.size();
		Object fst;
		Object lst;
		while(deq.size()>0)
		{
			fst=deq.getFirst();
			lst=deq.getLast();
			if(fst==lst)
			{
				deq.pollFirst();
				deq.pollLast();	
			}
			else
			{
				System.out.println(" False ");
				System.exit(0);
			}
		}
		System.out.println(" True ");		
	}
}
