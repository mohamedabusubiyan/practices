class Armstrong{
	public static void main(String[] args)
	{
		int a=153;
		int b=a;
		int org=a;
		int sum=0;
		int count=0;
		while(a>0)
		{
			count++;
			a=a/10;
			
}
while(b>0){
	
	 int c=b%10;//3
	 b=b/10;//15
	 int multiply=1;
	 for(int i=0;i<=count;i++)
	 {
		 multiply=multiply*c;
	 }
	sum+=multiply;
	 
}
if(sum==org)
{
	System.out.println("it is armstrong number");
}
else
{
	System.out.println("it is not a armstrong number");
}
	}
	

}

