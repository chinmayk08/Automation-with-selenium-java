package corejava.AccessModifiers.pkg2;

import corejava.AccessModifiers.pkg1.DefaultMembers;
import corejava.AccessModifiers.pkg1.ProtectedMember;

public class PkgclassMain extends ProtectedMember {

    public static void main(String[] args) {

        //default access modifier code
        /*DefaultMembers obj= new DefaultMembers();
        obj.defaultveriable=10;
        obj.defaultmethod();*/

        //protected access modifier code
        PkgclassMain obj1=new PkgclassMain();
        obj1.protectedvariable=10;
        obj1.protectedmethod();







    }


}
