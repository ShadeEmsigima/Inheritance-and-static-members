/* In this project, I want to show
* how static components can be
* accessed by classess and interfaces 
*/

public class App {
    public static void main(String[] args) {
      //=================================CALLING STATIC METHODS=========================================================================
      System.out.println();
        
        Derived d = new Derived();
        Derived.inheritedStatic();
        Base.inheritedStatic();
        d.inheritedStatic();

        /*  1) while possible, calling something static through reference is not-done
        *   2) notice how the child doesn't implement the static method directly,
        *      but one can still call through it
        */

        // interfaces don't let their static methods be inherited.
        // LoneClass implements an interface
        LoneClass lc = new LoneClass();
        IMyInterface.interfaceStatic();
        //lc.interfaceStatic();     does not compile, for the class doesn't inherit static methods from interfaces

        //=================================CALLING STATIC VARIABLES=========================================================================
        System.out.println();

        System.out.println(IMyInterface.sInterfaceInt);
        System.out.println(LoneClass.sInterfaceInt);
        System.out.println(lc.sInterfaceInt);
        System.out.println(Base.sClassInt);
        System.out.println(Derived.sClassInt);
        System.out.println(d.sClassInt);
        // static variables can be called in a any way
        // again, calling by reference is not ok
    

        System.out.println();
    }
}