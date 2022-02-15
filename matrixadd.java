import java.util.Scanner;

class matrixadd{
    public static void main(String args[]){
        int[][] A = new int[10][10];
        int[][] B = new int[10][10];
        int[][] C = new int[10][10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions of matrix A:");
        int A_row = sc.nextInt();
        int A_col = sc.nextInt();
        System.out.println("Enter the dimensions of matrix B:");
        int B_row = sc.nextInt();
        int B_col = sc.nextInt();
        if(A_col != B_col || A_row != B_row)
        {
            System.out.println("The matrixes can not be added!");
            return;
        }
        System.out.println("Enter elements in matrix A:\n");
        for(int i = 0; i < A_row; i++)
        {
            for(int j = 0; j < A_col; j++)
            {
              A[i][j] = sc.nextInt();  
            }
        }

        System.out.println("Enter elements in matrix B:\n");
        for(int i = 0; i < B_row; i++)
        {
            for(int j = 0; j < B_col; j++)
            {
              B[i][j] = sc.nextInt();  
            }
        }

        for(int i = 0; i < A_row; i++)
        {
            for(int j = 0; j < B_row; j++)
            {
                C[i][j] = A[i][j] + B[i][j];
                
            }
        }
        System.out.println("C:\n");
        for(int i = 0; i < A_row; i++)
        {
            for(int j = 0; j < B_row; j++)
            {
                System.out.print(C[i][j] + " ");
            }
            System.out.print("\n");
        }
        return;
    }
}
