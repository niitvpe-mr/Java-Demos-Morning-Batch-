/*Array is collection of elements of same data type stored in adjecant memory location*/

public class  ArrayDemo
{
	public static void main(String[] args)
	{
		int []arr=new int [3];	
		int []arr2=new int[]{5,6,8};
		int []arr3={7,8,9};
		int arr4[]=new int[3];
		arr4[0]=1;
		arr4[1]=5;
		arr4[2]=8;
		for(int i=0;i<3;i++)
		{
			arr[i]=Integer.parseInt(args[i]);			
		}

		for(int i=0;i<arr2.length;i++)
		{
			System.out.println("Value at index "+i+" : "+arr[i]);	
		}
		

	}
}
 