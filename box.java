class Box
{
    int length, width, depth;
    Box()
    {
        System.out.println("constructor");
        length = depth = width = 10;
    }
    
    int volume()
    {
        return length * width * depth;
    }
}

class BoxDemo
{
    public static void main(String args[])
    {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        
        int vol1 = mybox1.volume();
        int vol2 = mybox2.volume();
        System.out.println("Volume is " + vol1);
        System.out.println("Volume is " + vol2);
    }
}
