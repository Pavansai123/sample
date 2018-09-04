import java.util.*;
public class palindrome {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter your name");
		String s1= in.nextLine();
		String s2=new StringBuffer(s1).reverse().toString();
		
			if(s1.equals(s2))
			{
				System.out.println("palindrome");
			}
			else
			{
				System.out.println("not a palindrome");
			}
				
		}
		
	}


