// Outerclass, Inner Class, Nested Class

public class OuterClass {
    public class InnerClass {
        public InnerClass() {
            System.out.println("InnerClass");
        }

    }
    public static class NestedClass {
        public NestedClass() {
            System.out.println("NestedClass");
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // creating object of innerclass
        OuterClass o = new OuterClass();
        OuterClass.InnerClass i = o.new InnerClass();

        // creating object of NestedClass
        NestedClass n = new NestedClass();
    }
}