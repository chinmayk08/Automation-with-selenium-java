package JavaPracticeHome;

public class secondsmallest {

    public static void main(String[] args) {

        int [] a={10,22,1,2};

        int firstsmallest=Integer.MAX_VALUE;
        int secondsmallest=Integer.MAX_VALUE;

        for(int num:a){
            if(num<firstsmallest){
                secondsmallest=firstsmallest;
                firstsmallest=num;
            }
            else if (num<secondsmallest && num!=firstsmallest){
                secondsmallest=num;
            }
        }
        System.out.println("first smallest="+firstsmallest);
        System.out.println("second smallest="+secondsmallest);
    }
}
