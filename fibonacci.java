import java.util.Scanner;

class fibonacci{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        int a0 = 0;
        int a1 = 1;
        int a2 = a0 + a1;
        System.out.println("Enter the number of terms");
        int num = sc.nextInt();
        System.out.print(a1+" ");
        for(int i = 2; i <= num; i++){
              System.out.print(a2 + " ");
              a0 = a1 + a2;
              a1 = a2;
              a2 = a0;
        }
        
    }
}
