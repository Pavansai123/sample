import java.util.*;
public class vowels {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int count=0;
		System.out.println("enter string");
		String s1=in.nextLine();
		char ch[]=s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				count++;
			}
		}
		System.out.println("No of vowels in this string is:"+count);
	}

}
