import java.util.*;
public class Sentence {
public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	System.out.println("enter sentence");
	String s1= in.nextLine();
	char ch1[]=s1.toCharArray();
	System.out.println("enter letter");
	String s2=in.next();
	char ch2[]=s2.toCharArray();
	for(int i=0;i<ch1.length-1;i++)
	{
		if(ch1[i]==ch2[i])
		{
			String s3=s1.replaceAll(s2, "");
			System.out.println("corrected sentence is:"+s3);
		}
	}
	
	
	
	
}
}
