public class Lesson5 {
    public static class Employee {

        private int id;
        private String name;
        private String position;
        private String email;
        private String phoneNumber;
        private int salary;
        private int age;

        public Employee(int id, String name, String position, String email, String phoneNumber, int salary, int age) {
            this.id = id;
            this.name = name;
            this.position = position;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.salary = salary;
            this.age = age;
        }

        public void info() {
            System.out.println("Id: " + id + "; Имя пользователя: " + name + "; должность: " + position + "; email: " + email + "; телефон: " + phoneNumber + "; зарплата: " + salary + "; возраст: " + age);
        }

        public static void main(String[] args) {

            Employee employee1 = new Employee(1, "Иван Иванов", "Продавец", "ivan@mail.com", "8659236606", 2000, 30);
            Employee employee2 = new Employee(2, "Ирина Иванова", "Менеджер", "iren1234@mail.com", "579656585", 3000, 29);

            employee1.info();
            employee2.info();


// 2


            Employee[] employees = new Employee[5];

            employees[0] = new Employee(1, "Иван Иванов", "Менеджер", "ivanivan@mailbox.com", "89991119", 80000, 35);
            employees[1] = new Employee(2, "Ирина Петрова", "Инженер", "iren1234@mail.ru", "899922233", 200000, 42);
            employees[2] = new Employee(3, "Ольга Авдеенко", "Бухгалтер", "olya7878@mailbox.com", "899933344", 90000, 28);
            employees[3] = new Employee(4, "Алексей Гаврилкин", "Проектировщик", "alexey@mailbox.com", "899944455", 100000, 38);
            employees[4] = new Employee(5, "Евгений Смирнов", "Аналитик", "evgen@example.mailbox.com", "899955566", 150000, 31);

            for (Employee employee : employees) {
                employee.info();
                System.out.println();

            }


        }


// 3

        public static class Park {
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

            public static void main(String[] args) {
                Attraction[] attractions = {new Attraction("Тир", "17:00 - 22:00", 20.0), new Attraction("Пещера ужасов", "11:00 - 21:00", 30.0), new Attraction("Комната кривых зеркал", "11:00 - 22:00", 25.0)};

                Park park = new Park("Парк развлечений", attractions);
                park.printParkInfo();
            }
        }


    }
}
