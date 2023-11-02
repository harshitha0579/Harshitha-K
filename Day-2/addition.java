public class addition{
    int a,b,c;
    double p,q;
    int sum;

    public void addInfo()
    {
        sum=a+b;
        System.out.println("Sum of two integers  without parameters : " + sum);
    }
    public void addInfo(int a , int b)
    {
        System.out.println("Sum of integers with parameters " + (a + b) );
    }
    public void addInfo(int a , int b , int c)
    {
        System.out.println("Sum of integers with parameters " + (a + b + c) );
    }
    public void addInfo(int a , double p)
    {
        System.out.println("Sum of integers with parameters " + (a + p) );
    }
    public void addInfo(int a , int b , double q)
    {
        System.out.println("Sum of integers with parameters " + (a + b + q) );
    }
    public static void main(String args[])
    {
        addition a1 = new addition();
        a1.a=10;
        a1.b=20;
        a1.addInfo();
        a1.addInfo(40,50);
        a1.addInfo(30,80,40);
        a1.addInfo(1,3.12);
        a1.addInfo(3,7,2.21);
    }
}