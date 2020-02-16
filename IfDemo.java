public class IfDemo
{
	public static void main(String[] args)
	{
		int num;
		num=Integer.parseInt(args[0]);
		if(num>10)			
		{
			System.out.println(num+" is greater than 10");
		}
		else
		{
			System.out.println(num+" is lesser than 10");	
		}
	}
}