package corejava;

import java.util.Scanner;

public class ifelse {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("plese enter your age");
        int age= sc.nextInt();
        //int age =65;
        if(age>18&&age<=60){

            System.out.println("you are eligible for vote:"+age);
        }
        else if(age>60){

            System.out.println("you are not eligible for vote:"+age);
        }
        else if(age<=18&&age>=1){

            System.out.println("you are not eligible for vote:"+age);
        }
        else if (age==0){
            System.out.println("enter valid age:"+age);
        }
    }
}
