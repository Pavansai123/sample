import java.util.*;
public class Contains {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter a sentence");
		String s1=in.nextLine();
		System.out.println("enter a word");
		String s2=in.nextLine();
		if(s1.contains(s2))
		{
		   System.out.println("present");
		}
		else
		{
			System.out.println("not present");
		}
	}

}
