package lessons.vehicle;

public class Car {
    int doors;
    String transmission;

    public Car(int count, String type) {
        doors = count;
        transmission = type;
    }

    public void info() {
        System.out.println("Количество дверей - " + doors);
        System.out.println("Трансмиссия - " + transmission);
    }
}

