import java.util.Scanner;

public class Question2 
{
	static Scanner sc = new Scanner(System.in);
	public static void sub(int a[])
	{
		System.out.println("Enter the value to be subtracted : ");
		int b = sc.nextInt();
		int c[]=new int[a.length];
	for(int i=0;i<a.length;i++)
		{
			c[i]=a[i]-b;			
		}
		for(int j=0;j<c.length;j++)
		{
			System.out.print(c[j]+", ");
		}
	}
	public static void mul(int a[])
	{
		int mul=1;
		for(int i=0;i<a.length;i++)
		{
			mul=mul*a[i];
		}
		System.out.println(mul);
	}
	public static void asc(int a[])
	{
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
	}
	public static void des(int a[])
	{
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
	}
	public static void random(int a[])
	{
		System.out.println(a[3]);
	}
	public static void main(String[] args) 
	{
			int a[]=new int[6];
			System.out.println("enter 6 elements");
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			System.out.println("Available options are:");
			System.out.println("1. To subtract particular number from the array.");
			System.out.println("2. To multiply all the six numbers.");
			System.out.println("3. To arrange numbers in ascending order.");
			System.out.println("4. To arrange numbers in descending order.");
			System.out.println("5. To display random number.");
			System.out.println("6. Exit");
		int opt=sc.nextInt();
		switch(opt)
		{
		case 1:sub(a);
		break;
		case 2:mul(a);
		break;
		case 3:asc(a);
		break;
		case 4:des(a);
		break;
		case 5:random(a);
		break;
		case 6:System.exit(0);
		break;
		default:System.out.println("invalid option");
		break;
		}
	}
}