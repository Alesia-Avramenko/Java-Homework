
public class Employee {

    public int id;
    public String name;
    public String position;
    public String email;
    public String phoneNumber;
    public int salary;
    public int age;

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
}


