package corejava;

public class Arrays {

    public void print() {
        int[] marks = {45, 12, 48};
        /*System.out.println(marks[2]);
        for (int i=0; i<3;i++){
            System.out.println("my index is "+i+" my marks are "+marks[i]);*/
        System.out.println("my marks are:");
        for (int a : marks) {
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        Arrays ar = new Arrays();
        ar.print();
    }
}
