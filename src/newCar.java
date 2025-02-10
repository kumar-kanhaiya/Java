public class newCar {
    int numberOfDoors;
    int numberOfWheels;
    int numberOfSeats;
    String name;
    String model;
    String color;

    public newCar(int numberOfDoors, int numberOfSeats, int numberOfWheels, String name, String model, String color) {
        this.numberOfDoors = numberOfDoors;
        this.numberOfSeats = numberOfSeats;
        this.numberOfWheels = numberOfWheels;
        this.name = name;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "My car is : " + name;
    }

    public static void main(String[] args) {
        newCar myCar = new newCar(5,5,4,
                "swift" , "mg58795" , "black");
        System.out.println(myCar.toString());
    }
}
