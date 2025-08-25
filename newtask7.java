class Palindrome
{
public static void main(String[] args)
{
int i=123;
int original=i;
int reversed=0;
	for(int temp=i;temp!=0;temp=temp/10)
	{
	int digit=temp%10;
	reversed=reversed*10+digit;
}
if(original==reversed)
{
	System.out.println("it is a palindrome number");
}
else{
System.out.println("it is not a palindrome number");
}
}
}