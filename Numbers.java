import java.util.Scanner;
public class Numbers
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		for(int i=0;i<=(n-1);i++)
		{
			//0
			for(int j=0;j<=n-1;j++)
			{
			if( i==0 && j!=0  && j!=n-1|| i==n-1 && j!=n-1 && j!=0 || j==0 && i!=0 && i!=n-1 || j==n-1 && i!=0 && i!=n-1)
				System.out.print("* ");
			else
				System.out.print("  ");
			}
			System.out.print(" ");
			//1
			for(int j=0;j<=n-1;j++)
			{
			if( j==n/2 || i==n-1 || i+j==n/2)
				System.out.print("* ");
			else
				System.out.print("  ");
			}
			//2
			System.out.print(" ");
			for(int j=0;j<=n-1;j++)
			{
			if( i==n-1 || i+j==n-1 || i==0 && j!=0 || i==1 && j==0)
				System.out.print("* ");
			else
				System.out.print("  ");
			}
			//3
			System.out.print(" ");
			for(int j=0;j<=n-1;j++)
			{
			if( i==n-1 || i+j==n-1 && j>=n/2 || i==0 && j!=0 || i==j && j>n/2 || i==1&&j==0)
				System.out.print("* ");
			else
				System.out.print("  ");
			}
			//4
			System.out.print(" ");
			for(int j=0;j<=n-1;j++)
			{
			if( j==n/2 || i+j == n/2 || i==n/2)
				System.out.print("* ");
			else
				System.out.print("  ");
			}
			//5
			System.out.print(" ");
			for(int j=0;j<=n-1;j++)
			{
			if( i==0 || j==0 && i<=n/2 || i==n/2 || j==n-1 && i>=n/2 || i==n-1 && j!=0 || i==n-1-1 && j==0)
				System.out.print("* ");
			else
				System.out.print("  ");
			}
			//6
			System.out.print(" ");
			for(int j=0;j<=n-1;j++)
			{
			if(j==0 && i!=0|| i==n/2 || j==n-1 && i>=n/2 || i==n-1 || i==0 && j!=0)
				System.out.print("* ");
			else
				System.out.print("  ");
			}
			//7
			System.out.print(" ");
			for(int j=0;j<=n-1;j++)
			{
			if(i==0 || i+j==n-1)
				System.out.print("* ");
			else
				System.out.print("  ");
			}
			//8
			System.out.print(" ");
			for(int j=0;j<=n-1;j++)
			{
			if(i==0 && j!=0 && j!=n-1 || j==0 && i!=0 && i!=n-1 || i==n/2 && j!=0 && j!=n-1 || i==n-1 && j!=0 && j!=n-1 || j==n-1 && i!=0 && i!=n-1)
				System.out.print("* ");
			else
				System.out.print("  ");
			}
			//9
			System.out.print(" ");
			for(int j=0;j<=n-1;j++)
			{
			if(i==0 && j!=0 || j==n-1 || j==0 && i!=0 && i<n/2 || i==n/2 && j!=0)
				System.out.print("* ");
			else
				System.out.print("  ");
			}
			System.out.println();
		}
		sc.close();
	}
}