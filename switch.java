import java.util.Scanner;
 
class SwitchDemo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        
        switch(num)
        {
           case 1: 
            System.out.println("one"); 
            break;
        
           case 2:
            System.out.println("two"); 
            break;
           
           default: 
            System.out.println("Invalid!");
        
        }
    }
}
