package org.json.simple.parser;

import java.util.Deque;
import java.util.Scanner;
import java.awt.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;
class Week{
		public int mDayOfWeek(int m,int d,int y){
			int y1=y-(14-m)/12;
			int x=y1+(y1/4)-(y1/100)+(y1/400);
			int m1=m+12*((14-m)/12)-2;
			int d1=(d+x+(31*m1)/12)%7;
			return d1;
		}
		public void weekday()
		{
			Queue<Character> cal=new LinkedList<Character>();
			cal.add('s');
			cal.add('m');
			cal.add('t');
			cal.add('w');
			cal.add('t');
			cal.add('f');
			cal.add('s');
			while(cal.size()>0){
		        System.out.print(" "+cal.poll()+"  ");
				}
		}
		void display(int arr[][],int c)
		{
			int i=0,j=0,count=0,b=c-9;
			System.out.println(" ");
			for(i=0;i<=4;i++)
			{
				for(j=0;j<=6;j++)
				{
					if(count<c)
					{
						if(count<=b)
						{
							System.out.print("    ");
							b--;
							count++;
						}
						else
						{
						System.out.print(" 0"+arr[i][j]+" ");
						count++;
						}
					}
				else
				{
					if(arr[i][j]==0)
					{
						System.out.print("    ");
					}
				else
				{
					System.out.print(" "+arr[i][j]+" ");
				}
			}
		}
		System.out.println(" ");	
	}
		}
		
}
public class Qcalander 
	{
		public static void main(String[] args) 
		{
			Scanner scan = new Scanner(System.in);
			int month=Integer.parseInt(args[0]);
			int year=Integer.parseInt(args[1]);
			Week fdm=new Week();
			int date=1,i,j;
			int count=1,end=0;
			int start=fdm.mDayOfWeek(month,date,year);
			int b=start;
			int arr[][]=new int[5][7];
			String mnt[]={"jan","feb","mar","april","may","june","july","aug","sep","oct","nov","dec"};
			System.out.println(" ");
			System.out.println(mnt[month-1]+"  "+year);
			fdm.weekday();
			System.out.println(" ");	
			if(month==1 ||month==3||month==5||month==7||month==8||month==10||month==12)
			{
				end=31;
			}
			if(month==4||month==6||month==9||month==11)
			{
				 end=30;
			}		
			if(month==2)
			{
				if(year%4==0)
				{
					end=29;
				}
				else
				{
					end=28;
				}
			}
				
		for(i=0;i<5;i++)
		{
			for(j=0;j<7;j++)
			{
				if(start>0)
				{
					arr[i][j]=0;
					start-=1;
				}
				else
				{
					if(count<=end)
					{
						arr[i][j]=count;
						count++;
					}
					else
					{
						arr[i][j]=0;
					}
				}
			}
		}
		int c=b+9;
		fdm.display(arr,c);			
	}

}
