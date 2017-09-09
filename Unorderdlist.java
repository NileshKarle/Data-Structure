import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;
/*class Node{
    protected int data;
    protected Node link;
    public Node(){
        link = null;
        data = 0;
    }    
    public Node(int d,Node n) {
        data = d;
        link = n;
    }    
    public void setLink(Node n) {
        link = n;
    }    
    public void setData(int d){
        data = d;
    }    
    public Node getLink(){
        return link;
    }  
    public int getData(){
        return data;
    }
    
    
class linkedList {
        protected Node start;
        protected Node end ;
        public int size ;
        public linkedList(){
            start = null;
            end = null;
            size = 0;
        }
        public boolean isEmpty() {
            return start == null;
        }
        public int getSize(){
            return size;
        }    
        public void insertAtStart(int val){
            Node nptr = new Node(val, null);    
            size++ ;    
            if(start == null) {
                start = nptr;
                end = start;
            }
            else{
                nptr.setLink(start);
                start = nptr;
            }
        }
        public void insertAtEnd(int val){
            Node nptr = new Node(val,null);    
            size++ ;    
            if(start == null) {
                start = nptr;
                end = start;
            }
            else {
                end.setLink(nptr);
                end = nptr;
            }
        }
        public void insertAtPos(int val , int pos){
            Node nptr = new Node(val, null);                
            Node ptr = start;
            pos = pos - 1 ;
            for (int i = 1; i < size; i++){
                if (i == pos){
                    Node tmp = ptr.getLink() ;
                    ptr.setLink(nptr);
                    nptr.setLink(tmp);
                    break;
                }
                ptr = ptr.getLink();
            }
            size++ ;
        }
        public void deleteAtPos(int pos)
        {        
            if (pos == 1) {
                start = start.getLink();
                size--; 
                return ;
            }
            if (pos == size){
                Node s = start;
                Node t = start;
                while (s != end){
                    t = s;
                    s = s.getLink();
                }
                end = t;
                end.setLink(null);
                size --;
                return;
            }         
            Node ptr = start;
           pos = pos - 1 ;
            for (int i = 1; i < size - 1; i++) {
                if (i == pos)  {
                    Node tmp = ptr.getLink();
                    tmp = tmp.getLink();
                    ptr.setLink(tmp);
                    break;
                }
                ptr = ptr.getLink();
            }
            size-- ;
        }    
        	public void display(){
            System.out.print("\nSingly Linked List = ");
            if (size == 0)
            {
                System.out.print("empty\n");
                return;
            }    
            if (start.getLink() == null) 
            {
                System.out.println(start.getData() );
                return;
            }
            Node ptr = start;
            System.out.print(start.getData()+ "->");
            ptr = start.getLink();
            while (ptr.getLink() != null)
            {
                System.out.print(ptr.getData()+ "->");
                ptr = ptr.getLink();
            }
            System.out.print(ptr.getData()+ "\n");
        }
    }     
}*/
public class Unorderdlist
{
	public static void main(String[] args) throws Exception
	{
		Scanner scan=new Scanner(System.in);
		String path="/home/bridgeit/Desktop/nilesh/lst.txt";
		String temp="";
		String key;
		int comp=0;
		try
		{

			FileReader read=new FileReader(path);
			BufferedReader bufferread=new BufferedReader(read);
			LinkedList<String> arr=new LinkedList<String>();
			int i=0,j=-1;
			while((temp=bufferread.readLine())!=null){

				StringTokenizer str=new StringTokenizer(temp," ");
				while(str.hasMoreTokens())
				{
					String token=str.nextToken();
					arr.add(token);
				}
			}
			for(i=0;i<arr.size();i++)
			{
				System.out.print(arr.get(i)+"  ");
			}
			System.out.println(" ");
			System.out.println("Enter the element to search");
			key=scan.next();
			int p;
			for(i=0;i<arr.size();i++)
			{
				p=key.compareTo((String)arr.get(i));
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
				arr.addLast(key);
			}
			else
			{
				System.out.println("key removed ");
				arr.remove(j);
			}
				System.out.println("new list");
				for(i=0;i<arr.size();i++)
				{
					System.out.print(arr.get(i)+"  ");
				}
				try
				{
					String tmp;
				
				 FileWriter writer = new FileWriter(path);
		            BufferedWriter bufferedWriter = new BufferedWriter(writer);
		            for(i=0;i<arr.size();i++)
		            {
		            	temp=arr.get(i);
		            bufferedWriter.write(temp);
		            bufferedWriter.write(" ");
		            bufferedWriter.flush();
		            }
		            bufferedWriter.close();
				}
				finally
				{
					System.out.println(" ");
				}
		}
		finally
		{
			System.out.println(" ");
		}
	}
}
