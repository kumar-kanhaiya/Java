import java.util.Scanner;

class challenge70to76 {
    String name;
    int age ;
    challenge70to76(String name , int age){
        this.name = name;
        this.age = age;
    }

     @Override
     public String toString() {
         return "name : " + name + "\nage : " + age;
     }

     public static void main(String[] args) {
         challenge70to76 input = new challenge70to76("kanhaiya" , 20);
         System.out.println(input);
         Scanner data = new Scanner(System.in);
//         System.out.println("Enter your name : ");
//         String name1 = data.next();
//         System.out.println("Enter your name : ");
//         String name2 = data.next();
//         String concatenated = name1+name2;
//         System.out.println("concatenated String is :  " + concatenated);
//         System.out.printf("concatenated String in upper case is %S ",concatenated);
//         System.out.println("Enter radius of a circle ");
//         int radius = data.nextInt();
//         System.out.println("area of the circle is : " + area(radius));
//         System.out.println("circumference of the circle is : " + circumference(radius));
         int random = random();
         switch(random){
             case 1 :
                 System.out.println("computer enter 1");
                    break;
             case 2 :
                 System.out.println("computer enter 2");
                    break;
             case 3 :
                 System.out.println("computer enter 3");
                 break;
             case 4 :
                 System.out.println("computer enter 4");
                 break;

             case 5 :
                 System.out.println("computer enter 5");
                 break;

             case 6 :
                 System.out.println("computer enter 6");
                 break;
         }

         numberGuessingGame();

     }
     public static double area(int radius){
        double areaa = (Math.PI * radius  * radius);
        return areaa;
    }
    public static double circumference(int radius){
        double circum = 2*Math.PI * radius;
        return circum;
    }
    public static int random(){
        int randomNumber ;
        do{
            randomNumber = (int)Math.round(Math.random()*10);
//            System.out.println(randomNumber);

        }while(randomNumber>6 || randomNumber<1);

        return randomNumber;
    }

    public static void numberGuessingGame(){
        System.out.println("Welcome to the number guessing game \n");
        Scanner input = new Scanner(System.in);
        int number ;
        int computerNumber = (int) Math.round(Math.random()*100);
        do{
            System.out.print("Enter your number  : ");
            number = input.nextInt();
            if(number > computerNumber){
                System.out.println("you enter a big number please choose smaller one");
            }
            else if (number<computerNumber){
                System.out.println("you enter a smaller number please choose bigger one");
            }
            else{
                System.out.println("Great ! You Win this game");
            }
        }while(number != computerNumber);

    }
 }
