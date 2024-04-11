// The following class cannot be inherited
final class FinalClass {
    public void PrintSomething() {
        System.out.println("FinalClass cant be Inherited");
    }
}

// generates error
class SuperClass extends FinalClass {
    // the following method can't be overridden
    final public void SuperFinalMethod() {
        System.out.println("Can't be overridden");
    }
}

public class FinalMethodsAndClasses extends SuperClass {
    // generates error
    public void SuperFinalMethod() {
        System.out.println("Try to Override");
    }

    public static void main(String[] args) {
        FinalClass fc = new FinalClass();
        SuperClass sc = new SuperClass();
        FinalMethodsAndClasses fmac = new FinalMethodsAndClasses();

        fmac.SuperFinalMethod();
    }
}