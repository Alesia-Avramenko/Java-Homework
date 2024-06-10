package Exercise1;

public class Animal {
    private String name;
    private static int animalCount = 0;
    private static int dogCount = 0;
    private static int catCount = 0;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public String getName() {
        return this.name;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public static int getDogCount() {
        return dogCount;
    }

    public static int getCatCount() {
        return catCount;
    }


    public void run(int distance) {

        System.out.println(this.name + " пробежал(a) " + distance + " м.");
    }

    public void swim(int distance) {

        System.out.println(this.name + " проплыл(а) " + distance + " м.");
    }
}

