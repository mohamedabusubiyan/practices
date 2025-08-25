class XylemNum
{
	public static void main(String args[])
	{
		int a=1234;
		int original=a;
		int lastdigit=a%10;
		a=a/10;
		int mid=0;
		while(a>9)
		{
			int digit=a%10;
			mid=mid+(a%10);
			a=a/10;
		}
		int firstdigit=a;
		int b=firstdigit+lastdigit;
		if(b==mid)  
		{
			System.out.println("it is xylem number");
		}
	else
	{
		System.out.println("it is not a xylem number");
	}
	}
}
			