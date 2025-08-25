import java.utill.*;
public class armstrong{
	public static void main(String[] args)
	{
		Scanner ob=new Scanner(System.in);
		int a=ob.nextInt();
		int temp=a;
		int org=a;
		int sum=0;
		int count=0;
		Armstrong obj=new Armstrong();
		int c=obj.count(temp);
		int d=obj.sum(a,c,sum);
		obj.output(d,org);
	}
	int count(int temp)
	{
		while(a>0)
		{
			count++;
			a=a/10;
}
return count;
	}
int sum(int a,int count,int sum)
{
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
return sum;
}
void output(int sum,int org);
if(sum==org) 
{
	System.out.println("it is armstrong number");
}
else{
	System.out.println("it is not a armstrong number");
}
}
	

