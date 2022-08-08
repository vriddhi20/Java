class cons_over 
{
    double l,b,h;
    cons_over(double a,double d,double c)
    {
        l=a;
        b=d;
        h=c;
    }
    cons_over(double a)
    {
        l=b=h=a;
    }
    double volume()
    {
        return l*b*h;
    }
    void print()
    {
        System.out.println("demonstrating method overloading & constructir overloading");
    }
    void print(double v)
    {
        System.out.println("volume of box="+v+"\n");
    }
    }