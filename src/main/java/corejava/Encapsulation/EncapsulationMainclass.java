package corejava.Encapsulation;

public class EncapsulationMainclass {
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setName("sagar");
        obj.setAge(25);

        System.out.println("name: " + obj.getName());
        System.out.println("age: " + obj.getAge());
    }
}
