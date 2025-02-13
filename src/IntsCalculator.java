public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() { this.target = new Calculator(); }

    @Override
    public int sum(int arg0, int arg1) {
        return target.sum(arg0, arg1);
    }

    @Override
    public int mult(int arg0, int arg1) {
        return target.mult(arg0, arg1);
    }

    @Override
    public int pow(int a, int b) {
        return target.pow(a, b);
    }
}