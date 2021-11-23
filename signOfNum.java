class p{
    public static void rint(String str){
        System.out.print(str);
    }
}

class signOfNum{
    public static void main(String args[]){
        int num = 0;
        if(num < 0) p.rint("The number is negative");
        else if(num > 0) p.rint("The number is positive");
        else p.rint("The number is zero");
    }
}
