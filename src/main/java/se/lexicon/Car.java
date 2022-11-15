package se.lexicon;

public class Car {
    //12. Create a new class and call it Car. Add fields for Id,Brand and Model + getters and setters
    //Create a new hashMap of type <Integer,Car> and populate it with elements containing an
    //id(Integer) and a car object(Car). Lastly, print out only the car's brand.

    //Fields
    private int Id;
    private String Brand;
    private String Model;

    //Constructor
    public Car(int id, String brand, String model) {
        Id = id;
        Brand = brand;
        Model = model;
    }
    //Getters & Setters


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }
}
