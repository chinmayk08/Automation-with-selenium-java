package JavaPracticeHome;

public class HighestNumber {

    public static void main(String[] args) {

        int[] a={10,50,20,30};
        int highest=0;

        for (int i=0;i<a.length;i++){
            if(a[i]>highest){
                highest=a[i];
            }
        }
        System.out.println(highest);
    }
}
