@FunctionalInterface
interface interfaceNumberFile {
    int addNumbers(int a, int b);
}

public class NumberFile {
    public static void main(String[] args) {
        // Lambda expression

        interfaceNumberFile add = (int a, int b) -> {
            int sum = 0;
            for (int i = a; i <= b; i++) {

                sum += i;

            }

            return sum;
        };
    }

}
