public class ContinueDemo
{
	public static void main(String[] args)
	{
		int num=0;
		for(int i=1;i<10;i++)	
		{
			if(i%3==0)
			{
				//break;
				continue;
			}
			num++;

		}
		System.out.println(num);		
	}
}