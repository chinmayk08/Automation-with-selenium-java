package JavaPracticeHome;

public class ReverseString {

        public static void main(String[] args) {
            String str = "Hello, World!";
            String abc=new StringBuilder(str).reverse().toString();
            System.out.println(abc);
        }
    }

