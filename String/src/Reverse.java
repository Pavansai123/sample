import java.util.*;
public class Reverse {
	public static void main(String args[])
	{
		//using predefined reverse function
		Scanner in= new Scanner(System.in);
		System.out.println("enter your name");
		String s1=in.nextLine();
		StringBuffer s2=new StringBuffer(s1);
		System.out.println("Reversed name is:"+s2.reverse());
		
		//without using predefined reverse function
		char ch[]=s1.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print( ch[i]);
		}
	}

}
