import java.util.Scanner;

class Even extends SortArray
{
	void evenMethod(int n, int array[])
	{
		int evenNum=0;
		for(int i=0;i<n;i++)
		{
			if(array[i]%2==0)
				evenNum++;
		}
		int[] even=new int[evenNum];
		int j=0;
		for(int i=0;i<n;i++)
		{
			if(array[i]%2==0)
				even[j++]=array[i];
		}
		System.out.print("Even array is: \n");
		for(int i=0;i<even.length;i++)
			System.out.print(even[i]+" ");
		System.out.println();
	
	}
}		
class Odd extends SortArray
{
	void oddMethod(int n, int array[])
	{
		int oddNum=0;
		for(int i=0;i<n;i++)
		{
			if(array[i]%2 !=0)
				oddNum++;
		}
		int[] odd=new int[oddNum];
		int j=0;
		for(int i=0;i<n;i++)
		{
			if(array[i]%2!=0)
				odd[j++]=array[i];
		}
		System.out.print("Odd array is: \n");
		for(int i=0;i<odd.length;i++)
			System.out.print(odd[i]+" ");
		System.out.println();
	}
}		
class SortArray{
	public static void main(String[] args)
	{
		int n;
		System.out.print("Enter number of element which you want to add:\n");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] array=new int[20];
		System.out.println("Enter element of array:");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		Even obj = new Even();
		obj.evenMethod(n,array);
		Odd obj1=new Odd(); 
		obj1.oddMethod(n,array);
	}
} 