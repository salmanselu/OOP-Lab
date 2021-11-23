import java.util.Scanner;

class input{
    public static void main(String args[]){
           Scanner sc = new Scanner(System.in); 
           System.out.print("Enter the name");
           String str = sc.nextLine();  
           System.out.println("hi " + str); 
           System.out.print("Enter the age");
           int age = sc.nextInt(); 
           System.out.println(str + " is " + age + " years old");     
    }
}
