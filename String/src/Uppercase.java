import java.util.*;
public class Uppercase {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter your name in lowercase letters");
		String s1=in.nextLine();
		String s2=new StringBuffer(s1).toString();
		String s3=s2.toUpperCase();
		System.out.println("your name in uppercase letters is:"+s3);
	}
	
	

}
