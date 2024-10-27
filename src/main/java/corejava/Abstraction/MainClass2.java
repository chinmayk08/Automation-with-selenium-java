package corejava.Abstraction;

public class MainClass2 implements Interface1{
    @Override
    public void print1() {
        System.out.println("interface 1 method");
    }

    @Override
    public void print2() {
        System.out.println("interface 2 method");
    }
    @Override
    public void print3() {
        System.out.println("interface 3 method");
    }

    public static void main(String[] args) {
        MainClass2 obj1=new MainClass2();
        obj1.print1();
        obj1.print2();
        obj1.print3();
    }
}


