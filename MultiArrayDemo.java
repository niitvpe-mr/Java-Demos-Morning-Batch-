import java.util.*;
public class MultiArrayDemo
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int[][]multArr=new int[2][2];
		System.out.println("Enter values of array(size:2*2)");

		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println("at index"+i+","+j);
				multArr[i][j]=scanner.nextInt();
			}
		}

		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(multArr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}