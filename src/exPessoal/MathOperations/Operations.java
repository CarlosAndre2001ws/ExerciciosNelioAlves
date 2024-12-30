package exPessoal.MathOperations;

public class Operations {
    private int a,b;

    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }

    public int Soma(int a, int b) {
        this.a = a;
        this.b = b;
        return a + b;
    }
    public int Subtracao(int a, int b) {
        this.a = a;
        this.b = b;
        return a - b;
    }
    public int Multiplicacao(int a, int b) {
        this.a = a;
        this.b = b;
        return a * b;
    }
}
