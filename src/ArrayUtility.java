import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner sh = new Scanner(System.in);
        System.out.println("please enter your number of elements: ");
        int size = sh.nextInt();
        int[] nums = new int[size];
        int i =0;
        while(i<size){
            System.out.println("please enter the element no " + i + " :");
            nums[i] = sh.nextInt();
            i++;
        }

    return nums;
    }
    public static void displayArray(int[] arry){
        int i = 0 ;
        while(i<arry.length){
            System.out.print(arry[i] + " ");
            i++;
        }
    }
    public static int[][] input2DArray(){
        Scanner sh = new Scanner(System.in);
        System.out.println("please enter your number of rows: ");
        int rows = sh.nextInt();
        System.out.println("please enter your number of collums");
        int collums = sh.nextInt();
        int[][] numArray = new int[rows][collums];
        int i =0;
        while(i<rows){
            int j = 0 ;
            while(j<collums){
                System.out.println("please enter the row  " + (i+1) + " , collumns :" +
                        (j+1) + " :");
                numArray[i][j] = sh.nextInt();
                j++;
            }
            i++;
        }
        return numArray;
    }
}
