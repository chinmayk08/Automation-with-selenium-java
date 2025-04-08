package corejava.Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class List {

    public void list() {
        ArrayList<String> abc = new ArrayList<>();
        abc.add("banana");
        abc.add("Apple");
        abc.add("grapes");
        abc.add(null);
        System.out.println(abc);

        int length = abc.size();
        System.out.println("length of the list is:" + length);

        String Get = abc.get(2);
        System.out.println(Get);

        abc.set(1, "mango");
        System.out.println(abc);

        for (String fruit : abc) {
            System.out.print(fruit + " ");
        }
    }

    public static void main(String[] args) {

            ArrayList<Integer> in= new ArrayList<>();
            in.add(1);
            in.add(2);
            in.add(3);
            in.add(1);



        System.out.println(in);
        }
}

