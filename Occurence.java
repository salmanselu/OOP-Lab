import java.util.Scanner;
class Occurence{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String check =  sc.nextLine();
        int count = 0;
        System.out.print("Enter the character to be checked:");
        char c = sc.next().charAt(0);
        for(int i = 0; i < check.length(); i++)
            if(check.charAt(i) == c)
                count++;
        System.out.println("Frequency:" + count);
    }
    
}
