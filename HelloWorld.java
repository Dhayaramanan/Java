public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        main("Hello, Another main");
    }
    public static void main(String args) {
        System.out.println(args);
    }
}

