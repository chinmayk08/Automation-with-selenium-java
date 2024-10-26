package corejava;

public class Classes {


    int abc;

    /*public void print(){
        int abc=10;
        System.out.println(abc);
    }*/
    public int print() {
        return 10;
    }
//////////constructor- same name as class name and it doesn't have explicit return type
// constructor called automatically after you create object in main method//////////////
    Classes(int a, int b) {
        System.out.println("constructor: "+(a+b));
    }

    Classes(int a, int b, int c) {
        System.out.println("constructor: "+(a+b+c));
    }
//////////constructor ////////////////
    public int print1(int a, int b) {
        return (a + b);
    }
    public int print1(int a, int b, int c) {
        return (a+b+c);
    }
    public String  print1(String a) {
        return (a);
    }
    public void  print1(char a) {
    }

    public static void main(String[] args) {
        Classes obj = new Classes(10,20);
        Classes obj1 = new Classes(10,20,30);/////////constructor overloading
//      int value =obj.print();
//      System.out.println(value);

//////////////Below is called method overloading- multiple functions with same name but different parameters is called method overloading/////////////

        System.out.println(obj.print1(1, 2));
        System.out.println(obj.print1(1, 2,2));
        System.out.println(obj.print1("Selenium"));
        String value=obj.print1("Selenium1");
        System.out.println(value);





    }
}
