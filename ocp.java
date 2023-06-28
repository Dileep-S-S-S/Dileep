interface G{
    public double cal1();
}
class circ implements G{
    double a=1;
    public double cal1(){
        return 3.14*a*a;
    }
}
class rect implements G{
    double l=8;
    double b=58;
    public double cal1(){
        return l*b;
    }
}
public class ocp{
    public static void main(String[] args) {
        G j=new circ();
        G k=new rect();
        System.out.println(j.cal1());
        System.out.println(k.cal1());
    }
}