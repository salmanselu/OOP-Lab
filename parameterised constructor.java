class Box
{
    double length, width, depth;
    Box(double l, double w, double d)
    {
        System.out.println("constructor");
        length = l;
        depth = d;
        width = w;
    }   
    double volume()
    {
        return length * width * depth;
    }
}

class BoxDemo
{
    public static void main(String args[])
    {
        Box mybox1 = new Box(20.0, 12.4, 10.8);
        Box mybox2 = new Box(23, 4.5, 8.9);
        
        double vol1 = mybox1.volume();
        double vol2 = mybox2.volume();
        System.out.println("Volume is " + vol1);
        System.out.println("Volume is " + vol2);
    }
}
