import java.util.Scanner;

public class searchin2darray {
    public static void main(String[] args) {

        int[][] array = {{1,2,3}, {4,5,6}, {7,8,9}};
        int i =0;
        Scanner sh = new Scanner(System.in);
        System.out.println("enter the number for search ");
        int number = sh.nextInt();
        boolean check = false;
        while(i< array.length){
            int j =0;
            while(j< array.length){
                if(array[i][j] == number){
                    check = true;
                    break;
                }

                j++;
            }
            i++;
        }
        if(check == true){
            System.out.println("this number is present in 2d array");
        }
        else{
            System.out.println("this number is not present in 2d array");
        }

    }
}
