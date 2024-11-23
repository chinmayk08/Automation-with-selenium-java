package JavaPractice;

public class Program1 {

    public static void main(String[] args) {

        String a="This is selenium";
        char ch='s';
        int count=0;

        for (int i=0; i<a.length();i++){
            if(a.charAt(i)==ch){
                count++;
            }
        }
        System.out.print("total number of 's' letters are: "+count);
    }
}
