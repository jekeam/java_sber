/*Создайте трех джедаев в классе Jedi, по образу с классом Sith с именем, возрастом, расой и ростом и заполните эти профили конкретными данными.*/

public class Solution {
    public static void main(String[] args) {
        Jedi jedi1 = new Jedi("A", 1, 171, "X");
        Jedi jedi2 = new Jedi("B", 2, 172, "X");
        Jedi jedi3 = new Jedi("C", 3, 173, "X");
    }
    public static class Jedi {
        private String name;
        private int age;
        private String race;
        private int height;
        public Jedi(String name, int age, int height, String race) {
            this.name = name;
            this.age = age;
            this.race = race;
            this.height = height;
        }
    }
}
/*
Требования:
Программа не должна считывать данные с клавиатуры.
Нужно создать три объекта типа Jedi.
Класс Jedi нельзя изменять.
Программа не должна выводить данные на экран.
*/