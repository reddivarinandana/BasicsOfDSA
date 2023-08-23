public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = { 1,2,3,4,5,1,2,3,4,5,6 };
        int length = array.length;
        
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] == array[j]) {
                    for (int k = j; k < length - 1; k++) {
                        array[k] = array[k + 1];
                    }
                    length--;
                    j--;
                }
            }
        }
        
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
