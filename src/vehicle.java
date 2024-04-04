class Vehicle {
    private String name;
    private String color;

    public Vehicle(String name, String color){
        this.name = name;
        this.color = color;
    }

    public void method() {
        System.out.println("this.name = " + this.name);
    }
}

class Car extends Vehicle {
    private String model;
    private  int doors;

    public int getDoors() {
        return doors;
    }

    @Override
    public void method() {
        super.method();
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car(String name, String model, String color, int doors) {
        super(name, color); // inherit
        this.model=model;
        this.doors = doors;

    }
}
