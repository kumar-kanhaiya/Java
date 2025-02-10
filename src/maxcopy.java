public class maxcopy {
    public static void main(String[] args) {
        int[] array = ArrayUtility.inputArray();
        int max = max(array);
        int min = min(array);
        System.out.println("the maximum number in array is " + max);
        System.out.println("the minimum number in array is " + min);

    }
    public static int max(int[] array ){
        if(array.length == 0){
            return Integer.MIN_VALUE;
        }
        int max = array[0];
        int i = 1;
        while(i< array.length){
            if(max<array[i]){
                max = array[i];
            }
            i++;
        }
        return max ;
    }
    public static int min(int[] array){
        int min = array[0];
        int i = 1;
        while(i< array.length){
            if(min > array[i]){
                min = array[i];
            }
            i++;
        }
        return min;
    }
}
