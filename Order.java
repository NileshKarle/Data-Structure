package org.json.simple.parser;
import java.awt.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Order
{
	public static void main(String[] args) throws Exception
	{
		Scanner scan=new Scanner(System.in);
		String path="/home/bridgeit/Desktop/nilesh/num.txt";
		String temp="";
		int key;
		try
		{
			FileReader fr=new FileReader(path);
			BufferedReader buffer=new BufferedReader(fr);
			int array[]=new int[20];
			int i=0,j=-1,z=0,o=0;
			while((temp=buffer.readLine())!=null)
			{
				StringTokenizer str=new StringTokenizer(temp," ");
				while(str.hasMoreTokens())
				{
					String token=str.nextToken();
					array[o]=Integer.parseInt(token);
					o++;
				}
			}
			for(i=o;i<20;i++)
			{
				array[i]=9999;
			}
			Arrays.sort(array);
			
			for(i=0;i<o;i++)
			{
				System.out.print(array[i]+"  ");
			}
		
			System.out.println(" ");
			System.out.println("Enter the element to search");
			key=scan.nextInt();
			int p=11;
			for(i=0;i<o;i++)
			{
				if(key==array[i])
				{
					p=0;
				}
				if(p==0)
				{
					System.out.println("key found at "+i);
					j=i;
					break;
				}
			}
			if(j==-1)
			{
				System.out.println("element added");
				array[o+1]=key;
				Arrays.sort(array);
				System.out.println("new list");
				for(i=0;i<o+1;i++)
				{
					System.out.print(array[i]+"  ");
				}
			}
			else
			{
				System.out.println("key removed");
				array[j]=9999;
				Arrays.sort(array);
				System.out.println("new list");
				for(i=0;i<o-1;i++)
				{
					System.out.print(array[i]+"  ");
				}
			}
		}
		finally
		{
			System.out.println(" ");
		}
	}
}

