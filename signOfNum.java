import java.util.Scanner;

class signOfNum{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num < 0) System.out.print("The number is negative");
        else if(num > 0) System.out.print("The number is positive");
        else System.out.println("The number is zero");
    }
}
