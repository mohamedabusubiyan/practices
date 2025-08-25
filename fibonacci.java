class Fibonacci
{
	public static void main(String[] args)
	{
		int a= 10;
		int out;
		int b=1;
		int c=1;
		int sum;
		for(int i=0;i<=a;i++)
		{
			sum =b+c;
			System.out.println(b);
			b=c;
		    c=sum;
		}
	}
}
		
		