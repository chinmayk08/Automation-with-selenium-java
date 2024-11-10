package corejava.Static;

public class StaticMainProgram {

    public  void method(){
        Static.abc=10;
        Static.add();
    }

    public static void main(String[] args) {
        StaticMainProgram obj=new StaticMainProgram();
        obj.method();
    }
}
