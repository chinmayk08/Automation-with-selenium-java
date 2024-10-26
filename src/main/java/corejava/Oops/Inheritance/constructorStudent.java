package corejava.Oops.Inheritance;

public class constructorStudent {

    int ID;
    String Name;

    constructorStudent(int studentID, String studentName){
        ID=studentID;
        Name=studentName;
    }

    public static void main(String[] args) {
        constructorStudent student1=new constructorStudent(1,"abc");
        System.out.print(student1.ID);
        System.out.println(":"+student1.Name);

        constructorStudent student2=new constructorStudent(2,"xyz");
        System.out.print(student2.ID);
        System.out.println(":"+student2.Name);


        constructorStudent student3=new constructorStudent(3,"wer");
        System.out.print(student3.ID);
        System.out.println(":"+student3.Name);



    }

}
