package HW_10.Exercise1;

public class Lesson10 {

    public static void main(String[] args) {

        Dog dogBobik = new Dog("Бобик");
        dogBobik.run(151);
        dogBobik.swim(4);
        dogBobik.swim(16);

        Cat catMurka = new Cat("Мурка");
        catMurka.run(175);
        catMurka.run(230);
        catMurka.swim(3);

        Cat[] cats = new Cat[3];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("Кот " + (i + 1));
        }

        Dog[] dogs = new Dog[2];
        for (int i = 0; i < dogs.length; i++) {
            dogs[i] = new Dog("Собака " + (i + 1));
        }

        for (Dog dog : dogs) {
            dog.run(300);
            dog.swim(5);
        }



        int foodInBowl = 50;
        for (Cat cat : cats) {
            cat.addFoodToBowl(foodInBowl / cats.length);
            cat.eat(15);
        }


        for (Cat cat : cats) {
            System.out.println(cat.getName() + " сыт: " + cat.isFull());
        }


        System.out.println("Всего создано животных: " + Animal.getAnimalCount());
        System.out.println("Всего создано собак: " + Dog.getDogCount());
        System.out.println("Всего создано котов: " + Cat.getCatCount());
    }
}