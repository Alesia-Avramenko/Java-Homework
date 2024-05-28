public class Park {
    public static void main(String[] args) {

        Attraction[] attractions = {new Attraction("Тир", "17:00 - 22:00", 20.0), new Attraction("Пещера ужасов", "11:00 - 21:00", 30.0), new Attraction("Комната кривых зеркал", "11:00 - 22:00", 25.0)};

        Park park = new Park("Парк развлечений", attractions);
        park.printParkInfo();
    }

    private String name;
    private Attraction[] attractions;

    public Park(String name, Attraction[] attractions) {
        this.name = name;
        this.attractions = attractions;
    }

    public void printParkInfo() {
        System.out.println("Парк: " + name);
        for (Attraction attraction : attractions) {
            attraction.printAttractionInfo();
        }
    }

    public static class Attraction {
        private String name;
        private String workingHours;
        private double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void printAttractionInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price + " руб.");
            System.out.println();
        }
    }
}
