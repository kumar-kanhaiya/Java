public class car {
    int numberOfSeat;
    String color;
    float CurrentFuel;
    float maxSpeed;
    int Price;

    car(String color){
        this.color = color;
        numberOfSeat = 4;
        Price = 50000;
    }
    public void addFuel(float fuel){
        CurrentFuel += fuel;

    }
    public car start(){
        if(CurrentFuel ==0){
            System.out.println("your car is out of fuel , your car is not start");
        }
        else if (CurrentFuel<5){
            System.out.println("you are in reserved , please refil the car");

        }
        else{
            System.out.println("car is start , bruhh ..... ");

        }
        return this;
    }
    public void driven(){
               System.out.println("you are driving car");
               CurrentFuel--;


    }
        public float getCurrentFuel(){
            return  CurrentFuel;
    }
    public float addFuel(int fuel){
        CurrentFuel += fuel;
        return  CurrentFuel;
    }
}