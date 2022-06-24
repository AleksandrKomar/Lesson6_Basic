package hometasks.task2;

public enum Animals {
    Amimal1(14), Animal2(7), Animal3(23);

    private int age;

    Animals(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return this.name() + ", age=" + age;
    }
}

class Main {
    public static void main(String[] args) {

        Animals animals = null;

        System.out.println(animals.Amimal1.toString());
        System.out.println(animals.Animal2.toString());
        System.out.println(animals.Animal3.toString());
    }
}