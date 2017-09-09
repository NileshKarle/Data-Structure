package org.json.simple.parser;

import java.util.*;

public class PrimeAnagram 
{	
	static int fAnagram(int a,int b)
	{
		int i=0,num1=0,num2=0,j=0;
			//convert to character array.
		char fst[]=(Integer.toString(a)).toCharArray();
		char sec[]=(Integer.toString(b)).toCharArray();
			//sort the array.
		Arrays.sort(fst);
		Arrays.sort(sec);
		int ln1=(Integer.toString(a).length()),ln2=(Integer.toString(b).length());
		while(i<(Integer.toString(a).length()) && j<(Integer.toString(b).length()))
		{
				//ignore space.
			if(fst[i]==' ')
			{
				ln1-=1;
				i++;
			}
			if(sec[j]==' ')
			{
				ln2-=1;
				j++;
			}
				//compare each character.
			if(fst[i]!=sec[j])
			{
				return 0;
			}
			i++;
			j++;
		}
		if(ln1==ln2) //if length is equal.
		{
			return b;
		}
		else //if length is not equal.
		{
			return 0;
		}
	}
	public static void main(String[] args)
		{
			int start=2,end=1000;
			int i,j,count=0,index=0;
			int arr[]=new int[168];
			//System.out.println(" ");
			while(start<=end)
			{
				count=0;
				for(i=2;i<start;i++)
				{
					if(start%i==0)
					{
						count++;
					}
				}
				if(count==0)
				{
					arr[index]=start;
					index++;
				}
				start++;
			}
			int z,r=0,q=0;
			//int nonanagram[]=new int[168];
			int anagram[][]=new int[2][168];
			//System.out.println(" ");
			int p=0,x=0;
			for(i=0;i<167;i++)
			{
				r=0;
				for(j=i+1;j<168;j++)
				{
					z=fAnagram(arr[i],arr[j]);
					if(z!=0)
					{
						x=0;
						for(int b:anagram[0])
						{
							if(arr[i]==b||arr[j]==b)
							{
								x=1;
							}
						}
						if(x==0)
						{
						anagram[0][q]=arr[i];
						q++;
						anagram[0][q]=arr[j];
						q++;
						}
						r=1;
					}
				}
					if(r==0)
					{
						anagram[1][p]=arr[i];
						p++;
					}
			}
			System.out.println(" ");
			
			System.out.println("anagram numbers are");
			for(j=0;j<2;j++)
			{
				if(j==1)
				{
					System.out.println("non anagram numbers are");
				}
			for(i=0;i<q;i++)
			{
				System.out.print(anagram[j][i]+" ");
			}
			System.out.println(" ");
			q=p;
			}
		}
}

