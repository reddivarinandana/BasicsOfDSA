public class ReverseStringRecursion {
    public static void main(String[] args) {
        String str = "Nandana";
        int start = 0;
        int end = str.length() - 1;
        int i = 0;
        String bag = reverseString(str, start, end, i, "");
        System.out.println(bag);
    }

    public static String reverseString(String str, int start, int end, int i, String bag) {
        if (start > end) {
            return bag;
        }
        bag = bag + str.charAt(end);
        return reverseString(str, start, end - 1, i, bag);
    }
}
