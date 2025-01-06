package corejava.Final;

class finalparent{
    final void add(){
    }
}
public class FinalClass extends finalparent { // final class cannot not be extended

    final int abc=10;

    void method(){
        //abc=20; can not change value of final keyword
    }
    //@Override
    //void add(){ //final method cannot be override
    //}
}


