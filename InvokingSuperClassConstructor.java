class SuperClass {
    protected int n1 = 0;
    protected int n2 = 0;
    public SuperClass(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int[] getter() {
        return new int[]{n1, n2};
    }
}

public class InvokingSuperClassConstructor extends SuperClass {
    private int n3;
    public InvokingSuperClassConstructor(int n1, int n2, int n3) {
        super(n1, n2);
        this.n3 = n3;
    }

    public int[] getter() {
        return new int[]{n1, n2, n3};
    }

    public static void main(String[] args) {
        InvokingSuperClassConstructor i = new InvokingSuperClassConstructor(1, 2, 3);
        int[] returns = new int[3];
        returns = i.getter();

        for (int j = 0; j < 3; ++j) {
            System.out.println(returns[j]);
        }
    }
}
