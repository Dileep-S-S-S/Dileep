public class trycatch {
    public static void main(String[] args) {
        try{
        int x=5;
        int y=0;
        int d=x/y;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        finally{
            System.out.println("hi");
        }
    }
    
}
