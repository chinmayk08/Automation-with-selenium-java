package corejava.Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {

        Set<String> set=new TreeSet<>(); //LinkedHashSet,HashSet
        set.add("banana");
        set.add("orange");
        set.add("grapes");
        set.add("mango");

        //set.add(null);
        //set.add(null);

        //System.out.println(set);

        for (String a:set){
            System.out.println(a);


        }
    }
}
