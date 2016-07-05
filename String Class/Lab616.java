public class Lab616
{
	public static void main(String...as)
	{
		String s1="JLC";
		String s2=new String("JLC");
		String s3=s2.intern();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);	
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		System.out.println("***********");
		String s4="ok".intern();
		String s5="ok";
		System.out.println(s4==s5);
	}
}