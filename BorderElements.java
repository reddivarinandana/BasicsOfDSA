public class BorderElements {
    public static void main(String[] args){
            int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
            int row =3;
            int col = 3;
            for(int i = 0;i<row;i++){
                System.out.print(array[i][0]+" ");
            }
             for(int i = 1;i<col;i++){
                System.out.print(array[row-1][i] + " ");
            }
            for(int i = row-2;i>=1;i--){
                System.out.print(array[i][col-1]+ " ");
            }
            for(int i = col-1;i>=1;i--){
                System.out.print(array[0][i] + " ");
            }
        }
}


class Hello{
    public static void main(String[] args){
        int [][] arr ={{1,2,3},{4,5,6},{7,8,9}};
        int row = 3;
        int col = 3;
        for(int i=0; i<row; i++){
            System.out.println(arr[0][i]);
        }
        for(int i=1; i<col; i++){
            System.out.println(arr[i][col-1]);
        }
        for(int i=col-2; i>=0; i--){
            System.out.println(arr[row-1][i]);
        }
        for(int i=row-2; i>=1; i--){
            System.out.println(arr[i][0]);
        }
    }
    
}
