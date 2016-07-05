class Lab185
{
	public static void main(String...as)
	{
		char ch='A';
		if(ch>=65 && ch<=99)
		{
			switch(ch)
			{
				case'A':
				case'E':
				case'I':
				case'O':
				case'U':
				System.out.println("ch is vowel");
				break;
				default:
				System.out.println("ch is constant");
			}
		}else
			System.out.println("invalid alphabet");
		
	}
}