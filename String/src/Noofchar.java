import java.util.*;
public class Noofchar {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int count=0;
		System.out.println("enter your name");
		String s1=in.nextLine();
		char ch[]=s1.toCharArray();
		System.out.println("enter letter to find in name");
		char c=in.next().charAt(0);
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==c)
			{
				count++;
			}
		}
		System.out.println("no of times is:"+count);
	}

}
