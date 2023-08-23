public class Pattern3 {
    public static void main(String[] args) {
        int n = 3; 
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                for (int j = 1; j <= 5; j++) {
                    System.out.print("* ");
                }
            }else {
                System.out.println("*");
            }
            System.out.println(); 
        }
    }
}



