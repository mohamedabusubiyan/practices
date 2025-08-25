class Factorial
{
	public static void main (String[] args)
	{
		int num=5;
		int fact=1;
		System.out.print(num+"!=");
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
			System.out.print(i);
			if(i>1)
			{
				System.out.print("*");
			}
		}
		System.out.println("\nFactorial of "+num+"is:"+fact);
	}
}