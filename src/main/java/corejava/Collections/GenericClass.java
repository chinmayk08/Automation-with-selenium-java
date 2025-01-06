package corejava.Collections;

public class GenericClass <T>{

    private T Abc;

    public T getAbc() {
        return Abc;

    }
    public void setAbc( T Abc){
        this.Abc=Abc;
    }
    public static void main(String[] args) {
        GenericClass<String> abc=new GenericClass<>();
        abc.setAbc("svf");
        System.out.println(abc.getAbc());
    }
}
