public class App {
    public static void main(String[] args) {
        System.out.println();

        System.out.println("Before:");
        int seperateInt = 2;
        StringBuilder seperateSB = new StringBuilder("Hello im seperate SB!");
        Derived d = new Derived();
        System.out.println("Seperate int: " + seperateInt + "\n" + "Seperate SB: " + seperateSB);
        
        System.out.println();
        System.out.println("After calling methods:");
        changePrimitive(seperateInt);
        changeSB(seperateSB);
        System.out.println("Seperate int: " + seperateInt + "\n" + "Seperate SB: " + seperateSB);
        
        System.out.println();
        System.out.println("Before:");
        System.out.println("Primitive in obj: " + d.insideInt);
        
        System.out.println();
        System.out.println("After calling methods:");
        changePrimitiveInObj(d);
        System.out.println("Primitive in obj: " + d.insideInt);
        
        Derived.staticMethod();
        Base.staticMethod();
        d.staticMethod();
        //Derived.printInt();


    }
    static void changePrimitive(int i){
        ++i;
    }

    static void changeSB(StringBuilder sb){
        sb = new StringBuilder("Anyone else but me~"); // sb is basically a ref to the same dog the original is pointing at
    }

    static void changePrimitiveInObj(Derived d){
        d.insideInt +=100;
    }

    
}