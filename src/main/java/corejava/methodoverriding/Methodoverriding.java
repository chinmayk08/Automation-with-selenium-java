package corejava.methodoverriding;

class m1 {
    void m1Method() {
        System.out.println("In m1");
    }
}

class m2 extends m1 {
    @Override
    void m1Method() {
        System.out.println("In m2");
    }

    void m2Method() {
        System.out.println("class m2 method");
    }

}

public class Methodoverriding {

    public static void main(String[] args) {
        m1 obj1 = new m1();
        obj1.m1Method();

        m2 obj3 = new m2();
        obj3.m1Method();
        obj3.m2Method();

        m1 obj2 = new m2();//upcastig
        obj2.m1Method();

        //obj2.m2Method(); this line has error bcz m2 method belongs to m2 class but reference variable belongs to m1 class


    }
}


