package Java;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Car car = new Car("MD1245", new Account("Christian", "and123" ));
        
        car.passegenger = 4;
        car.printDataCar();

        Car car2 = new Car("QWE567", new Account("Andrea Herrera", "ANDA876"));
        car2.passegenger = 3;
        car2.printDataCar();
    }
}