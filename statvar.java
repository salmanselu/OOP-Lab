
class box{
    double width, length, depth;
    static double height;
    box(){

    }
    box(double w, double l, double d){
        width = w;
        length = l;
        depth = d;
    }
    void volume(){
        System.out.print("Volume is:");
        System.out.println(width * length * depth);
    }
    static double getHeight() {return height;}

}

public class statvar {
    public static void main(String args[]){
        box myBox1 = new box();
        myBox1.width = 10;
        myBox1.length = 30;
        myBox1.depth = 30;
        myBox1.height = 5;
        myBox1.volume();
        box myBox2 = new box(5, 6, 7);
        myBox2.height = 10;
        myBox2.volume();
        System.out.println("box1 - width ="+myBox1.width);
        System.out.println("box2 - width ="+myBox2.width);
        System.out.println("box1 - height ="+myBox1.height);
        System.out.println("box2 - height ="+myBox2.height);
        System.out.println("boxHeight = "+box.height);
        box.getHeight();
        System.out.println("box1 - height ="+myBox1.getHeight());
        System.out.println("box2 - height ="+myBox2.getHeight());
        
    }
    
}
