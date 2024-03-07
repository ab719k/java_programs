# Vehicle
Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have properties such as make, model, year, and fuel type. Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.



'''
// Vehicle.java
// Parent class Vehicle

public abstract class Vehicle {
    private String make;
    private String model;
    private int year;
    private String fuelType;
    private double fuelEfficiency;

    public Vehicle(String make, String model, int year, String fuelType, double fuelEfficiency) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.fuelEfficiency = fuelEfficiency;
    }
	
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getFuelType() {
        return fuelType;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public abstract double calculateFuelEfficiency();

    public abstract double calculateDistanceTraveled();

    public abstract double getMaxSpeed();
}
'''