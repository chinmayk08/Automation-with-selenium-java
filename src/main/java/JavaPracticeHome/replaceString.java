package JavaPracticeHome;

public class replaceString {


    public static void main(String[] args) {
        String a="this is selenium class";
        String b="";

        String[] str=a.split(" ");

        for(String s: str){
            if (s.equals("selenium")){
                b=b+"java"+" ";
            }
           else{
               b=b+s+" ";
            }
        }
        System.out.println(b);
    }
}
