import java.util.*;
class matrixtrans{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the order m1");
	int m1=sc.nextInt();
	System.out.println("Enter the order n1");
	int n1=sc.nextInt();
	
	int A[][]=new int[m1][n1];
	int B[][]=new int[n1][m1];

	System.out.println("Read matrix A");
	for(int i=0;i<m1;i++)
	{
		for(int j=0;j<n1;j++)
		{
			System.out.println("A["+i+"]["+j+"]=");
			A[i][j]=sc.nextInt();
		}
	}
	
	for(int i=0;i<m1;i++)
	{
		for(int j=0;j<n1;j++)
		{
			B[i][j] = A[j][i];
		}
	}
	
	
	System.out.println("Matrix A");
	for(int i=0;i<m1;i++)
	{
	    System.out.println();
		for(int j=0;j<n1;j++)
		{
			System.out.println(A[i][j]+"\t");
		}
	}
	System.out.println("Matrix B");
	for(int i=0;i<n1;i++)
	{
	    System.out.println();
		for(int j=0;j<m1;j++)
		{
			System.out.print(B[i][j]+"\t");
		}
	}
	
}
}
