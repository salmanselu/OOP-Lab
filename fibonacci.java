

class fibonacci{
    public static void main(String args[]){
        int a0 = 0;
        int a1 = 1;
        int a2 = a0 + a1;
        int num = 5;
        System.out.print(a1+" ");
        for(int i = 0; i <= num; i++){
              System.out.print(a2 + " ");
              a0 = a1 + a2;
              a1 = a2;
              a2 = a0;
        }
        
    }
}
