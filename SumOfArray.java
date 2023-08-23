public class SumOfArray {
    public static void main(String[] args) {
        int[] array = { 5,10,15,20,25,30,35,40,45,50 };
        int sum = findArraySum(array);
        System.out.println(sum);
    }

    public static int findArraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}



