import java.util.*;
public class TwoDPrime
{
	//static String arr[][]=new String[10][];
	static int Prime(int start,int end)
	{
		int i,count=0,num=0;
		System.out.println(" ");
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
				num++;
				//System.out.print(start+"  ");
			}
			start++;
		}
		return num;
		
	}
	static int value(int start,int end)
	{
		int i,count=0;
		System.out.println(" ");
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
				return start;
			}
			start++;
		}
		return 0;
		
	}
public static void main(String[] args)
{
	System.out.println("the prime numbers are as follows.");
	int arr[][]=new int[10][];
	int i,j,r,index2,check,n=100,index1=0;
	for(i=0;i<=1000;i++)
	{
		if(i==0)
		{
			index2=Prime(i+2,i+100);
			arr[index1]=new int[index2];
			r=i+2;
			for(j=0;j<index2;j++)
			{
				check=value(r,i+100);
				if(check==0){
					break;
				}
				arr[index1][j]=check;
				r=arr[index1][j]+1;
			}
			//System.out.println(arr[index1].length+" ");
			i+=100;
			index1++;
		}
		else
		{
			index2=Prime(i,i+100);
			arr[index1]=new int[index2];
			r=i;
			for(j=0;j<index2;j++)
			{
				check=value(r,i+100);
				if(check>1000){
					break;
				}
				arr[index1][j]=check;
				r=arr[index1][j]+1;
			}
			//System.out.println(arr[index1].length+" ");
			i+=100;
			index1++;
		}
	}
	for(i=0;i<10;i++)
	{
		for(j=0;j<arr[i].length;j++)
		{
			if(arr[i][j]!=0)
			{
			System.out.print(arr[i][j]+" ");
			}
		}
		System.out.println(" ");
	}
}	
}
