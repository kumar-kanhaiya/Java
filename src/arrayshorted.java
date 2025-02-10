public class arrayshorted {
    public static void main(String[] args) {
        int[] array = ArrayUtility.inputArray();
        boolean max = increasing(array);
        boolean min = decreasing(array);
        if(max || min){
            System.out.println("this is shorted array ");
        }
        else {
            System.out.println("this is not as shorted array");
        }

    }
    public static boolean increasing(int[] arr){
        boolean check = false;
        int max = arr[0];
        int i = 0;
        while(i < arr.length){
            if(max>arr[i]){
//                System.out.println("this is not a shorted array ");
                check = true;
                break;
            }

                max = arr[i];
            i++;
        }
        if(check == true){
            System.out.println("this is not a shorted array increasing ");
        }
        else{
            System.out.println("this is a shorted array increasing");
        }
        return check;

    }
    public static boolean decreasing(int[] arr){
        boolean check = false;
        int min = arr[0];
        int i = 0;
        while(i<arr.length){
            if(min<arr[i]){
                check = true;
                break;
            }
                min = arr[i];
            i++;
        }
        if(check == true){
            System.out.println("this is not a shorted array by decreasing ");
        }
        else{
            System.out.println("this is a shorted array by decreasing");
        }
        return check;

    }
}
