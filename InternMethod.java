
public class InternMethod 
{
	public static void main(String[] args)
	{
		String s1 = new String("ABC");
		String s2 = "ABC";
		
		System.out.println(s1.intern()==s2);
		
		
		
	}

}
