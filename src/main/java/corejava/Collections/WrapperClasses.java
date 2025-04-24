package corejava.Collections;

public class WrapperClasses {


    public static void main(String[] args) {

        //Autoboxing: Primitive to wrapper object
        Integer intobject=10;
        Double doubleobject=3.14;
        Character charobject='A';


        //Unboxing : wrapper object to primitive
        int intprimitive=intobject;
        double doubleprimitive= doubleobject;
        char charprimitive= charobject;




        System.out.println("Autoboxed interger:"+intobject);
        System.out.println("unboxed int:"+intprimitive);
        System.out.println("Autoboxed double:"+doubleobject);
        System.out.println("unboxed double:"+doubleprimitive);
        System.out.println("Autoboxed character:"+charobject);
        System.out.println("unboxed character:"+charprimitive);

    }
}
