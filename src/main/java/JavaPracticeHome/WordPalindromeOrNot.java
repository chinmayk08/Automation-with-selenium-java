package JavaPracticeHome;

public class WordPalindromeOrNot {

    public static void main(String[] args) {
        String abc = "i ama i";

        String a = new StringBuilder(abc).reverse().toString();

        if(a.equals(abc)) {
            System.out.println("given string is palindrome");
        }
        else {
                System.out.println("given string is not palindrome");
            }
    }
}