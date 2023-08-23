public class MaximumElementRecursion {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,21};
        int max = maximumElement(array, 0, Integer.MIN_VALUE);
        System.out.println(max);
    }
    public static int maximumElement(int[] arr, int i, int maximum) {
        if (i == arr.length) {
            return maximum; 
        }
        if (arr[i] > maximum) {
            maximum = arr[i];
        }
            return maximumElement(arr, i + 1, maximum);
    }
}
