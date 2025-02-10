public class maximum_minimum {
    public static void main(String[] args) {
        int[] marks = {15,23,65,85,96,45,65,23,52,65,32,12};
        int i = 0;
        while(i< marks.length){
            int j =0;
            while(j< marks.length){
                if(marks[i] > marks[j]){
                    System.out.println(marks[i] + " is the largest number in array ");
                    break;
                }

                j++;
            }
            i++;
        }
    }
}
