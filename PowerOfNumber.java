public class PowerOfNumber {
    public static void main(String[] args) {
        int base = 4;
        int exponent = 4;
        int result = powerofNumber(base, exponent);
        System.out.println(result);
    }
    public static int powerofNumber(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * powerofNumber(base, exponent - 1);
        }
    }
}
