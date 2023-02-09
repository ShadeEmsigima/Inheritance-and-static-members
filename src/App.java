/* In this project, I want to show
* how VIP static components can be! 
*/

public class App {
    public static void main(String[] args) {
        //static methods are called in special ways:
        
        Derived d = new Derived();
        Derived.doStatic();
        Base.doStatic();
        d.doStatic();

        //  1) while possible, calling something static through reference is not-done
        //  2) notice how the child doesn't implement the static method directly, but one can still call through it
        
        

    

    
    }
}