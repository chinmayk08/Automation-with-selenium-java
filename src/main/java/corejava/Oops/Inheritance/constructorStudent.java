package corejava.Oops.Inheritance;

public class constructorStudent {

    int ID;
    String Name;
    double mark;
    String subject;
    String lastname;

    constructorStudent(int studentID, String studentName){
        ID=studentID;
        Name=studentName;
    }

    constructorStudent(String subjects,float marks,String lastnames){
        mark=marks;
        subject=subjects;
        lastname=lastnames;
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

        constructorStudent student4= new constructorStudent(4,"opi");
        System.out.print(student4.ID);
        System.out.println(":"+student4.Name);

        constructorStudent details=new constructorStudent("java",44,"kanekar");
        System.out.print(details.subject);
        System.out.println(":"+details.mark);
        System.out.print(":"+details.lastname);
    }
}
