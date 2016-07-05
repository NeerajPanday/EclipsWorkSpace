public class Lab615
{
	public static void main(String...as)
	{
		String s1="JLC";
		String s2=new String("JLC");
		String s3=new String("JLC");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);	
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s3);
	}
}