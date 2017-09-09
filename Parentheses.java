package org.json.simple.parser;
import java.util.Scanner;
import java.util.Stack;
class Stacke
{
	public int read(String str)
	{
		Stack<Character> st=new Stack<Character>();
		int n=str.length(),i=0;
		for(i=0;i<n;i++)
		{
			if(str.charAt(i)=='(')
			{
				st.push('(');
			}
			if(str.charAt(i)==')')
			{
				st.pop();
			}
		}
		if(st.size()==0)
		{
		return 1;
		}
		else
		{
			return 0;
		}
	}
}
public class Parentheses 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the expression");
		String exp=scan.next();
		Stacke s=new Stacke();
		int result=s.read(exp);
		if(result==1)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
}
