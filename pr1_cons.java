public class pr1_cons {
    public static void main(String[] args)
    {
        cons_over cube=new cons_over(3);
        double v1=cube.volume();
        cube.print();
        cube.print(v1);
        cons_over cuboid=new cons_over(3,4,5);
        double v2=cuboid.volume();
        cuboid.print();
        cuboid.print(v2);
    }
}
