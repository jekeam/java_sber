/* Сила языка Java позволяет как использовать свои данные, так и заменять на новые. 
   Геттер - метод, возвращающий текущее значение переменной тому, кто его вызвал. 
   Сеттер — метод, устанавливающий новое значение переменной.
   
   Создайте класс Sith, у которого должно быть имя String name и возраст int age.
   Создайте геттеры и сеттеры для всех переменных класса Sith.
*/   
public class Sith {
    private String name;
    private int age;
    
    public static void main(String[] args) {
        Sith sith = new Sith();
        sith.set_name("Lexa");
        sith.set_age(30);
        System.out.println(sith.get_name());
        System.out.println(sith.get_age());
    }
    public void set_name(String name){
        this.name = name;
    }
    public String get_name(){
        return name;
    }
    public void set_age(int age){
        this.age = age;
    }
    public int get_age(){
        return age;
    }
}

/*
Требования:
Программа не должна считывать данные с клавиатуры.
У класса Sith должна быть переменная name с типом String. 
У класса Sith должна быть переменная age с типом int.
У класса должен быть сеттер для переменной name.
У класса должен быть геттер для переменной name.
У класса должен быть сеттер для переменной age.
У класса должен быть геттер для переменной age.
*/
