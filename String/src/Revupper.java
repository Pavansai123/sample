import java.util.*;
public class Revupper {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter name:");
		String s1=in.nextLine();
		StringBuffer s2=new StringBuffer(s1);
		String s3=s2.reverse().toString();
		String s4=s3.toUpperCase();
		System.out.println("Reversed uppercase is:"+s4);
		
		
	}

}
