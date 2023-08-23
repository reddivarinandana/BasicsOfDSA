public class SwappingNumbers {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;
        System.out.println("Before Swapping");
        System.out.println("num1 = " + num1 + ", num2 = " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp; 
        System.out.println("After Swapping");
        System.out.println("num1 = " + num1 + ", num2 = " + num2);
    }
}


// public class SwappingNumbers{
//     public static void main(String[] args) {
//         int num1 = 5;
//         int num2 = 10;
//         System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);
//         num1 = num1 + num2;
//         num2 = num1 - num2;
//         num1 = num1 - num2;
//         System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
//     }
// }