package corejava;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String choice=sc.next();
        switch (choice){
            case "Monday":
                System.out.println("this is monday");
                break;
            case "tuesday":
                System.out.println("this is tuesday");
                break;
            default:
                System.out.println("invalid day");

        }
    }
}
