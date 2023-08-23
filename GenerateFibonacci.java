public class GenerateFibonacci {
    public static void main(String[] args) {
        int number = 10;    
        for (int i = 0; i < number; i++) {
            System.out.print(fibonacciSeries(i) + " ");
        }
    }
    
    public static int fibonacciSeries(int number) {
        if(number <= 1) {
            return number;
        }else {
            return fibonacciSeries(number - 1) + fibonacciSeries(number - 2);
        }
    }
}


