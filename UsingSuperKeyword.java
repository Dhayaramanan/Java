class SuperClass {
    public void printMethod() {
        System.out.println("Printing From SuperClass");
    }
}

public class UsingSuperKeyword extends SuperClass {
    public void printMethod() {
        super.printMethod();
        System.out.println("Printing From Sub Class");
    }

    public static void main(String[] args) {
        UsingSuperKeyword s = new UsingSuperKeyword();
        s.printMethod();
    }
}
