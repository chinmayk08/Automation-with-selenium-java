package JavaPracticeHome;

import javax.sound.midi.Soundbank;

public class ReverseWords {

    public static void main(String[] args) {
        String a = "This is seleium";
        String b = "";
        String[] words = a.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            b = b + words[i] + " ";
        }
        System.out.println(b);
    }
}
