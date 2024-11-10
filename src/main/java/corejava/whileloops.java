package corejava;

public class whileloops {

    public static void main(String[] args) {
        /*int n=10;
        for (int i=0;i<=n;i++){
            System.out.print("*");*/
        int i;
        int j;
        int n = 5;
        for (i = 1; i <= n; i++) {
            System.out.print("*");
            System.out.print(" ");

               // System.out.println();
            }
        for (j =1; j <=n; j++) {
            System.out.println("*");
        }
        for (i = 1; i <= 6; i++) {
            System.out.print("*");
            System.out.print(" ");

            // System.out.println();
            for (j = 1; j >= n; j--) {
                System.out.print("*");
                System.out.print(" ");

                // System.out.println();
            }
        }
        

    }
}
