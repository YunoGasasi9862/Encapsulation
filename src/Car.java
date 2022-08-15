public class Car {
    private String make;
    private String model;
    private int year;


    Car(String make, String model, int year) {
        this.setMake(make);  //you have ot use this
        this.setModel(model);
        this.setYear(year);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getyear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void copy(Car car) {  //this is setting all the variables from the getter methods.
        //this is how you create copies of object
        this.setMake(car.getMake());
        this.setYear(car.getyear());
        this.setModel(car.getModel());

    }
}