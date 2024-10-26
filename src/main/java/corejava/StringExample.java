package corejava;

import javax.sound.midi.Soundbank;

public class StringExample {

    public String print() {
        String st="java";
        System.out.println(st.charAt(0));
        return st;
    }

    public static void main(String[] args) {
        StringExample ob=new StringExample();
        String value= ob.print();


        String str = "Selenium";
        /*System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.charAt(1));
        System.out.println(str.replace('e','t'));*/
        //array.length is a property of array objects.
        //string.length() is a method of the String class.
        for (int i = str.length()-1; i >=0 ; i--){  //length considers spaces too
            System.out.print(str.charAt(i)+" ");
        }

//////////////////equalsIgnoreCase////////////////////////

        /*if (str.equalsIgnoreCase("selenium")) {
            System.out.println(true);
        } else {
            System.out.println(false);*/


/////////////////////////contains//////////////////////////

        /*String str1="This is selenium class";
        System.out.println(str1.contains("This selenium"));*/

        }
    }

