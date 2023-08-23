public class ReverseElementsRecursion {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        reverseArray(arr, arr.length - 1);
    }
    public static void reverseArray(int[] arr, int i) {
        if (i >= 0) {
            System.out.println(arr[i]);
            reverseArray(arr, i - 1);
        }
    }
}
