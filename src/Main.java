public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        public interface Ints {
            int sum(int x, int y);

            int mult(int x, int y);

            int pow(int x, int y);
        }

        public class IntsCalculator implements Ints {
            @Override
            public int sum(int x, int y) {
                return x + y;
            }

            @Override
            public int mult(int x, int y) {
                return x * y;
            }

            @Override
            public int pow(int x, int y) {
                return (int) Math.pow(x, y);
            }

        }
    }