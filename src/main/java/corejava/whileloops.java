package corejava;

public class whileloops {

    public static void main(String[] args) {
        /*int n=10;
        for (int i=0;i<=n;i++){
            System.out.print("*");*/
        int i;
        int j;
        int n = 5;
        for (i = 0; i < n; i++) {
            for (j = 0; j <=i; j++) {
                System.out.print("*");
                System.out.println();
            }
        }
    }
}
