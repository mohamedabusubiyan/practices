class PrimeFactorials{
	public static void main(String[] args)
	{
		System.out.println("primeNum b/w 1<=100");
			for(int num=1;num<=100;num++)
			{
		   int count=0;
			for(int j=1;j<=num;j++)
			{
				if(num%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(num+" "+"is prime of factorial");
				
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
	}
}