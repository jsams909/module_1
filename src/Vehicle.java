 class Vehicle{

    protected  int numberOfWheels;
    protected String color;
    protected float engineSize;
    protected String fuelType;

    Vehicle(int numberOfWheels, String color, float engineSize, String fuelType){

        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }

    public int getNumberOfWheels(){
        return numberOfWheels;
    }

    Object setNumberOfWheels(int numberOfWheels){
        return this.numberOfWheels=numberOfWheels;
    }

    public String getColor(){
        return color;
    }


    public void setColor(String color){
        this.color=color;
    }

    public float getEngineSize(){
        return engineSize;
    }

    public void setEngineSize(float engineSize){
        this.engineSize =engineSize ;
    }

    public String getFuelType(){
        return fuelType;
    }

    public void setFuelType(String fuelType){
        this.fuelType=fuelType;
    }


    class Car extends Vehicle{
        String brand;

        Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
            super(numberOfWheels, color, engineSize, fuelType);
        }

        void honk(){
            System.out.println("Honk, honk!");
        }
        void displayInfo(){
            System.out.println("Number of wheels on the automobile: "+ numberOfWheels);
            System.out.println("Automobile color: "+ color);
            System.out.println("Engine Size: " + engineSize);
            System.out.println("Type of fuel used: " + fuelType);
            System.out.println("Automotive brand: " + brand);
        }





        public class Main {
            public  void main(String[] args) {
                //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
                // to see how IntelliJ IDEA suggests fixing it.
                Vehicle v1 = new Vehicle(4, "red", 2.2f, "regular");
                v1.getNumberOfWheels();
                Car c1 = new Car(4, "Green", 2.2f, "regular", "Honda");
                c1.displayInfo();
                c1.honk();

            }
        }}}
