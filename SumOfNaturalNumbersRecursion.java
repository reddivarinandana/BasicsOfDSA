public class SumOfNaturalNumbersRecursion {
    public static void main(String[] args) {
        int n = 10; 
        int sum = SumOfNaturalNumbers(n);
        System.out.println(sum);
    }
    public static int SumOfNaturalNumbers(int num) {
        if(num == 1) {
            return 1;
        } 
            return num + SumOfNaturalNumbers(num - 1);
    }
}
