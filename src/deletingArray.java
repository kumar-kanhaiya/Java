import java.util.Scanner;

class deletingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to array deletion \n");
        int[] numArr = ArrayUtility.inputArray();
        System.out.println("now , enter the value you want to delete ");
        int numToDelete = input.nextInt();
        int[] newArr = deleteNumber(numArr , numToDelete);
        System.out.println("here is your new array ");
        ArrayUtility.displayArray(newArr);
    }
    public static int[] deleteNumber(int[] arr , int numToDelete){
        int occ = occurence(arr , numToDelete);
        if(occ ==0){
            return arr;
        }
        int newSize = arr.length-occ;
        int[] NewArr = new int[newSize];
        int i = 0 , j=0;
        while(i< arr.length){
            if(arr[i] != numToDelete){
                NewArr[j] = arr[i];
                j++;
            }
            i++;
        }



    return NewArr;
    }
    public static int occurence(int[] arr ,int  number ){
        int count = 0;
        int i = 0 ;
        while(i<arr.length){
            if(number == arr[i]){
                count++;
            }
            i++;
        }
        return count;
    }
}
