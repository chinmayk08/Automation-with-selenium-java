package corejava.Collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    public void lists() {
        List<String> abc=new ArrayList<>();
        abc.add("apple");
        abc.add("mango");
        abc.add("banana");

        System.out.println(abc.get(0));



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
            Lists a=new Lists();
            a.lists();
            ArrayList<Integer> in= new ArrayList<>();
            in.add(1);
            in.add(2);
            in.add(3);
            in.add(1);



        System.out.println(in);
        }
}

