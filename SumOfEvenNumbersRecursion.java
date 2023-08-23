public class SumOfEvenNumbersRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = sumOfEvenNumbers(arr, 0);
        System.out.println(sum);
    }
    public static int sumOfEvenNumbers(int[] array, int i) {
        if (i >= array.length) {
            return 0; 
        }
        int sum = 0;
        if (array[i] % 2 == 0) {
            sum += array[i];
        }
        return sum + sumOfEvenNumbers(array, i + 1); 
    }
}
