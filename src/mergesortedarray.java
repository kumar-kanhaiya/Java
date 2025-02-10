class mergesortedarray {
    public static void main(String[] args) {
        System.out.println("Welcome to the mergeShortedArray program\n");
        int[] array1 = ArrayUtility.inputArray();
        int[] array2 = ArrayUtility.inputArray();
        int[] mergedArray = MergedArray(array1,array2);
        System.out.println("your merged shorted array is ");
        ArrayUtility.displayArray(mergedArray);

    }
    public static int[] MergedArray(int[] array1 , int[] array2){
        int newSize = array1.length  + array2.length;
        int[] NewArray = new int[newSize];
        int i =0 , j =0 , k=0;
        while(i<array1.length || j<array2.length){
            if(j == array2.length ||
                    (i<array1.length && array1[i] < array2[j])){
                NewArray[k] = array1[i];
                i++;
                k++;
            }
            else{
                NewArray[k] = array2[j];
                j++;
                k++;
            }
        }



        return NewArray;
    }
}
