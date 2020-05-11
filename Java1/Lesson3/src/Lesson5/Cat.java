package Lesson5;

public class Cat {
    //свойства - fields
    private String name;  // public - публикуем вне класса, private - публикуется только внутри класса
    private int age;
    private static int counter = 0;
    // getters & setters

    @Override
    protected void finalize() throws Throwable{
        counter++;
        super.finalize();
    }

    public Cat(int age){// конструктор - функция с именем класса
        //counter++;
        this.age = age;
    }

    // полиморфизм - многоформие(разные функции с одинаковым именем)
    public Cat(){// выделяет ссылку
    }

    public int getCounter(){
        return counter;
    }
    //getters and setters - публичные функции
    public void setName(String name) {
        this.name = name;
    }  // изменение свойств сэтит именно имя класса

    public int getAge(){
        return age;
    }  // возвращает из приватного свойства

    public String getName(){
        return name;
    }

    // методы, функции(СВОЙСТВА СКРЫВАЕМ МЕТОДЫ ОСТАВЛЯЕМ)
    // private - in class
    // default (package private) - in package пустой идентификатор
    // protected pp + extension - внутри пакета + по наследству
    // public - everywhere

    public void say() {
        System.out.println(name + "MEOW");
    }

}
