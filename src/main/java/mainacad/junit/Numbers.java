package mainacad.junit;

public class Numbers {

    private int rez;

    public int sum(int N) {
        rez = 0;
        for (int i = 1; i <= N; i++)
            rez += i;
        return rez;
    }

    public int add(int a, int b) {
        rez = a + b;
        return rez;
    }

    public int div(int a, int b) {
        rez = a / b;
        return rez;
    }

    public int mult(int a, int b) {
        rez = a * b;
        return rez;
    }

    public int sub(int a, int b) {
        rez = a - b;
        return rez;
    }

    public double powTwo(int a) {
        return Math.pow(a, 2);
    }

    public int power(int a, int b) {
        rez = 1;
        for(int i=1; i<=b; i++) {
            rez = rez * a;
        }
        return rez;
    }

    public double sqrt(double a) {
        return Math.sqrt(a);
    }

}
