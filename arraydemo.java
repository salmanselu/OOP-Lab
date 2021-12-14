import java.util.Scanner;

class arraydemo{
    public static void main(String args[]){
        int[] arr = new int[10];
        float average;
        int sum = 0;
        System.out.println("Enter the no. of elements:");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        for(int i = 0; i < length; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }
        average = sum / arr.length;
        System.out.println("Sum of elements of array:"+sum);
        System.out.println("Average of elements of array:"+average);
    }
}
