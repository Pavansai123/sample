import java.util.*;
public class Noofspaces {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int count=0;
		System.out.println("enter a sentence");
		String s1=in.nextLine();
		char ch[]=s1.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
			{
				count++;
			}
		}
		System.out.println("No of spaces are:"+count);
		
	}

}
