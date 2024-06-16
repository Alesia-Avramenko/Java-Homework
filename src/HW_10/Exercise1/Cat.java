package HW_10.Exercise1;

public class Cat extends Animal {
    private static final int MAX_RUNNING_DISTANCE = 200;

    private static int catCount = 0;
    private boolean isFull;
    private int foodInBowl;

    public Cat(String name) {
        super(name);
        catCount++;
        this.isFull = false;
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(this.getName() + " пробежал(а) " + distance + " м.");
        } else {
            System.out.println(this.getName() + " не может пробежать больше 200 м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(this.getName() + " не умеет плавать.");
    }

    public void eat(int amount) {
        if (this.foodInBowl >= amount) {
            this.foodInBowl -= amount;
            this.isFull = true;
            System.out.println(this.getName() + " поел(а) " + amount + " еды.");
        } else {
            System.out.println("В миске недостаточно еды для " + this.getName() + ".");
        }
    }

    public void addFoodToBowl(int amount) {
        this.foodInBowl += amount;
        System.out.println("В миску для " + this.getName() + " добавлено " + amount + " еды.");
    }

    public boolean isFull() {
        return this.isFull;
    }
}