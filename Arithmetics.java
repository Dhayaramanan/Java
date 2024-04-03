class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add() {
        return this.a + this.b;
    }
}

public class Arithmetics {
    public static void main(String[] args) {
        Calculator calc = new Calculator(1, 2);
        System.out.println(calc.add());
    }
}