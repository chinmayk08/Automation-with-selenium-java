package JavaPractice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Program2 {

    public static void main(String[] args) {

        int[] marks = {1, 2, 1, 4, 5, 6};
        int count = 0;
        int letter = 1;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == letter) {
                count++;
            }
        }
        System.out.println("total number of 1 letters are : " + count);
    }
}


