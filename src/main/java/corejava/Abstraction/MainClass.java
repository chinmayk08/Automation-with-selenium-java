package corejava.Abstraction;

public class MainClass extends Abstractclass {

    @Override
    void display() {
        System.out.println("display from mainclass ");
    }
    public static void main(String[] args) {
        MainClass obj=new MainClass();
        obj.display();
    }
}
