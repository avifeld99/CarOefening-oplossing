package be.intecbrussel;

import java.util.Random;

public class Car {

    // properties
    private String color = "wit";
    private int maxSpeed = 120;
    private int horsePower = 150;
    private int currentSpeed = 0;
    private String driver = "unknown";
    private String licensePlate;
    private boolean lights;
    private static int counter = 0;

    // constructor
    public Car() {
        counter++;
    }

    public Car(String color) {
        this.color = color;
        counter++;
    }

    public Car(String color, int maxSpeed) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        counter++;
    }

    public Car(String color, int maxSpeed, int horsePower) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.horsePower = horsePower;
        counter++;
    }

    // GETTER AND SETTER
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        if(currentSpeed > 0 && currentSpeed < maxSpeed) {
            this.currentSpeed = currentSpeed;
        } else {
            System.out.println("Not possible");
        }

    }

    public String getDriver() {
        return driver;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public boolean getLights() {
        return lights;
    }

    public void setLights(boolean lights) {
        this.lights = lights;
    }

    public static int getCounter() {
        return counter;
    }



    // METHODS
    public String toggleLights() {

        if (this.lights == true) {
            return "Lights on";
        } else {
            return "Lights off";
        }

    }

    public void repaint(String color) {
        this.color = color;
    }

    public void speedUp() {
        if (currentSpeed < maxSpeed) {
            currentSpeed += 5;
        }
    }

    public void slowDown() {
        if (currentSpeed > 0) {
            currentSpeed -= 5;
        }
    }

    public void repair() {
        Random random = new Random();
        int price = random.nextInt(300 - 100) + 100;
        System.out.println("repair cost is: " + price);
    }

    public void assignDriver(String driver) {
        if (driver.isBlank() == true || driver.length() < 5) {
            System.out.println("Naam niet toegestaan");
        } else {
            this.driver = driver;
        }
    }

    public void generateLicensePlate() {
        if (driver.isBlank() == false) {
            Random random = new Random();
            int num = random.nextInt(1000 - 100) + 100;
            licensePlate = driver.substring(0, 3).toUpperCase() + "-" + num;
        }
    }

    // OVERRIDE
    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", horsePower=" + horsePower +
                ", currentSpeed=" + currentSpeed +
                ", driver='" + driver + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", lights=" + lights +
                '}';

    }

}