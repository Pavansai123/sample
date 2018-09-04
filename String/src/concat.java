import java.util.*;
public class concat {
	public static void main(String args[])
	{
		Scanner in= new Scanner(System.in);
		System.out.println("enter first name");
		String s1=in.nextLine();
		
		System.out.println("enter second name");
		String s2=in.nextLine();
		
		System.out.println(s1.concat(s2));
		System.out.println(s1.length());
	}

}
