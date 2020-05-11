package Lesson5.homework;

public class homework {
    private String fio;
    private String post;
    private String email;
    private String tel;
    private double salary;
    private int age;

    public homework(String fio, String post, String email, String tel, double salary, int age) {
        this.fio = fio;
        this.post = post;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
    }

    int GetAge() {return age; }

    void ShowInfo() {
        System.out.println(fio + " " + post + " " +  email + " " + tel + " " + salary + " " + age);
    }

    public static void main(String[] args) {

        homework[] persArray = new homework[5];
        persArray[0] = new Person("Нестеров Михаил Алексеевич", "Начальник по охране труда", "nest@mail.ru", "8923123-45-67", 48000, 36);
        persArray[1] = new Person("Потапенко Андрей Борисович", "Инженер 1 кат", "PotaoAB@gmail.com", "81234567890", 37500, 28);
        persArray[2] = new Person("Иванов Иван Иванович", "Сварщик 5 разряда", "Ivanov12@mail.ru", "89888888888", 29000, 51);
        persArray[3] = new Person("Гафаров Дамир Гареевич", "Инженер по технике безопасности", "Gafarov24@gmail.com", "83832251845", 33000, 40);
        persArray[4] = new Person("Михайленко Мария Алексеевна", "Бухгалтер", "buch1414@mail.ru", "89132466777", 51800, 47);

        for(homework item : persArray) {
            if(item.GetAge() > 40) item.Show();
        }
    }
}

