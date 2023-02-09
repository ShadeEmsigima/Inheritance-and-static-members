
public interface IMyInterface extends IMom, IDad{

    static int sInterfaceInt = 2;

    static void interfaceStatic(){
        System.out.println("Interface - called a static method");
    }

}