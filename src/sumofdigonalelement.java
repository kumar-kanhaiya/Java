public class sumofdigonalelement {
    public static void main(String[] args) {
        int[][] array = ArrayUtility.input2DArray();
        long sum = 0;
        int i = 0 , j=0;
        while(i<array.length){
            sum += array[i][i];
            i++;
        }
        System.out.println("the sum of diagonal element is : " + sum);

    }
}
