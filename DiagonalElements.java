// public class DiagonalElements {
//     public static void main(String[] args){
//         int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//         int rows = 3;
//         int cols = 3;
//         int i = 0;
//         int j = 0;
//         while(i<rows && j<cols){
//             System.out.println(arr[i][j]);
//             i++;
//             j++;
//         }
        
//         int m = 0;
//         int n = cols-1;
//         while(m<rows && n >= 0){
//             if(n != m){
//                 System.out.println(arr[m][n]);
//             }
//             m++;
//             n--;
//         }
        
//     }
// }

//1
//5
//9
//7
//3

public class DiagonalElements {
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int rows = 3;
        int cols = 3;
        int i = rows-1;
        int j = cols-1;
        while(i>=0 && j>=0){
            System.out.println(arr[i][j]);
            i--;
            j--;
        }
        
        int m = 0;
        int n = cols-1;
        while(m<rows && n >= 0){
            if(n != m){
                System.out.println(arr[m][n]);
            }
            m++;
            n--;
        }
        
    }
}
//9
//5
//1
//3
//7