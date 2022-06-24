package hometasks.task4;

public enum Vehicles {

    Car1(10500, "black"), Car2(8500, "green"), Car3(3600, "yellow");

    private int price;
    private String color;

    Vehicles(int price, String color) {
        this.price = price;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return this.name() + ": price = " + price + ", color = " + this.getColor();
    }


}

class Main {
    public static void main(String[] args) {

        Vehicles vehicles = null;

        System.out.println(vehicles.Car1.toString());
        System.out.println(vehicles.Car2.toString());
        System.out.println(vehicles.Car3.toString());
    }
}