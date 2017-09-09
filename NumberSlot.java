package org.json.simple.parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class NumberSlot {

	public static void main(String[] args)  throws Exception{
		
		HashMap<Integer,LinkedList<Integer>> hm=new HashMap<Integer,LinkedList<Integer>>();
		Scanner scan=new Scanner(System.in);
		String path="/home/bridgeit/Desktop/nilesh/num.txt";
		String temp="";
		LinkedList<Integer> ls=new LinkedList<Integer>();
		try
		{
			FileReader fr=new FileReader(path);
			BufferedReader buffer=new BufferedReader(fr);
			int fileinput[]=new int[20];
			int i=0,j=-1,z=0;
			while((temp=buffer.readLine())!=null)
			{
				StringTokenizer str=new StringTokenizer(temp," ");
				while(str.hasMoreTokens())
				{
					String token=str.nextToken();
					fileinput[i]=Integer.parseInt(token);
					i++;
				}
			}
			for(j=0;j<i;j++)
			{
				System.out.print(" "+fileinput[j]);
			}
			for(j=0;j<=10;j++)
			{
				LinkedList<Integer> list= new LinkedList<Integer>();
				hm.put(j, list);
			}
			for(j=0;j<i;j++)
			{
				z=fileinput[j]%11;	
				ls = hm.get(z);
				ls.add(fileinput[j]);			
			}
				
			System.out.println(" ");
			System.out.println(hm);
			System.out.println("enter the value to search");
			int key=scan.nextInt();
				z=key%11;		
			ls=hm.get(z);
			if(ls.contains(key)==true)
			{
			System.out.println("key found and removed");
			int index=ls.indexOf(key);
			ls.remove(index);
			System.out.println(ls);
			}
			else
			{
				System.out.println("key not found");
				ls.add(key);
				System.out.println(hm.get(z));
			}
		}
		finally
		{
			System.out.println("");
			System.out.println(hm);
		}
	}

}
