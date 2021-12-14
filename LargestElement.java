import java.util.Scanner;

class largestelement{
    public static void main(String args[]){
        int[] arr = new int[10];
        
        System.out.println("Enter the no. of elements:");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        for(int i = 0; i < length; i++)
        {
            arr[i] = sc.nextInt();
        }
        int large = arr[0];
        for(int i = 0; i < length; i++)
        {
            if(arr[i] >= large)
                large = arr[i];
        }
        System.out.println("Largest element:"+large);
        
    }
}
