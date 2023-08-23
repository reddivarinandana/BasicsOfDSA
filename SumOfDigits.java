public class SumOfDigits{
    public static void main(String[] args){
        int number = 2122;
        int sum = sumOfDigits(number);
        System.out.println(sum);
    }

    public static int sumOfDigits(int number){
        int sum = 0;
        while(number > 0){
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        return sum;
    }
}