public class arrayreverse {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        int[] NewArr = new int[arr.length];
        int i =0 , j=arr.length-1;
        while(i< arr.length){
            NewArr[j] = arr[i];
            j--;
            i++;
        }
        System.out.println("before reverse");
        ArrayUtility.displayArray(arr);
        System.out.println("after reverse");
        ArrayUtility.displayArray(NewArr);
        boolean check = isPalindrome(arr);
        if(check){
            System.out.println("your array is palindrome");
        }
        else{
            System.out.println("your array is not palindrome");
        }

    }
    public static boolean isPalindrome(int[] array){
        int i =0;
        while(i<array.length){
            if(array[i] != array[array.length - 1 - i]){
             return false;
            }
            i++;
        }
        return true;
    }
}
