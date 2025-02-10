public class twoDarry {
    public static void main(String[] args) {
//        int[][] arry = {{1,2,3},{4,5,6}};
//        System.out.println(arry[0].length);
        System.out.println("sum and average of all element in array ");
        int[] marks = {65,85,95,75,85,65,65};
        int sum =0;
        int i = 0;
        while(i< marks.length){
            sum = sum + marks[i];
            i++;
        }
        float average = sum/marks.length;
        System.out.println("the sum of all element in array is " + sum);
        System.out.println("average of all element in array is " + average);
        System.out.println("program for number of occurence ");
        int count = 0;
        int number = 65;
        int j =0;
        while(j< marks.length){
            if(marks[j] == 65){
                count++;
            }
            j++;
        }
        System.out.println("the number of ocurence of " + number + " is " + count);
    }
}
