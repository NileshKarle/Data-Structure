import java.util.*;
import java.util.Stack;
class check{
public	int fAnagram(int a, int b) {
		int i = 0, num1 = 0, num2 = 0, j = 0;
		// convert to character array.
		char first[] = (Integer.toString(a)).toCharArray();
		char second[] = (Integer.toString(b)).toCharArray();
		// sort the array.
		Arrays.sort(first);
		Arrays.sort(second);
		int ln1 = (Integer.toString(a).length()), ln2 = (Integer.toString(b).length());
		while (i < (Integer.toString(a).length()) && j < (Integer.toString(b).length())) {
			// ignore space.
			if (first[i] == ' ') {
				ln1 -= 1;
				i++;
			}
			if (second[j] == ' ') {
				ln2 -= 1;
				j++;
			}
			// compare each character.
			if (first[i] != second[j]) {
				return 0;
			}
			i++;
			j++;
		}
		if (ln1 == ln2) // if length is equal.
		{
			return b;
		} else // if length is not equal.
		{
			return 0;
		}
	}

}
public class StakePrimeAnagram {
	
	public static void main(String[] args)
		{
			int start=2,end=1000;
			int i,j,count=0,index=0;
			int arr[]=new int[168];
			check c=new check();
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
			Stack<Integer> s=new Stack<Integer>();
			int x=0;
			for(i=0;i<167;i++)
			{
				for(j=i+1;j<168;j++)
				{
					z=c.fAnagram(arr[i],arr[j]);
					if(z!=0)
					{
						if(s.contains(arr[i])!=true||s.contains(arr[j])!=true)
						{
						s.push(arr[i]);
						s.push(arr[j]);
						}
					}
				}
			}
			System.out.println(" ");
			while(s.size()>0)
			{
				System.out.print(s.pop()+" ");
			}

		}
}
