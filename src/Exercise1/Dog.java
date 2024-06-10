package Exercise1;

public class Dog extends Animal {

    private static final int MAX_RUNNING_DISTANCE = 500;
    private static final int MAX_SWIMMING_DISTANCE = 10;

    private static int dogCount = 0;

      public Dog(String name) {
          super(name);
            dogCount++;
        }

        public static int getDogCount() {
            return dogCount;
        }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUNNING_DISTANCE) {
            super.run(distance);
        } else {
            System.out.println(this.getName() + " не может пробежать больше 500 м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= MAX_SWIMMING_DISTANCE) {
            super.swim(distance);
        } else {
            System.out.println(this.getName() + " не может проплыть больше 10 м.");
        }
    }
}
