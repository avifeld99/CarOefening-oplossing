package be.intecbrussel;

public class CarApp {

    public static void main(String[] args) {

        Car car = new Car();
        Car car1 = new Car("Purple");
        Car car2 = new Car("Green", 70);
        Car car3 = new Car("Yellow", 160, 200);

        car.setLights(false);
        System.out.println(car.toggleLights());

        System.out.println("There are total: " + Car.getCounter() + " cars");

        car1.repair();
        System.out.println(car1);

        car1.repaint("cyan");
        System.out.println(car1);

        car1.setCurrentSpeed(100);
        car1.speedUp();
        car1.speedUp();
        car1.speedUp();
        System.out.println("Speed of car1 " + car1.getCurrentSpeed());
        car1.slowDown();
        car1.slowDown();
        System.out.println("Speed of car1 " + car1.getCurrentSpeed());

        car1.assignDriver("qui");
        car1.generateLicensePlate();
        System.out.println(car1.getLicensePlate());

        System.out.println(car1);

    }

}
