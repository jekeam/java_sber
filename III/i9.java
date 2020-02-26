/*
Напишите несколько конструкторов, принимающих различные наборы параметров и создайте Высший совет. Да пребудет с вами сила!
В классе Jedi создать несколько конструкторов, принимающих различные наборы параметров. 
У джедая обязательно должно быть имя String name и уровень мидихлориан int midichlorians. 
В общей сумме, в конструкторах должны быть проинициализированы все переменные класса.
В методе main создайте 12 джедаев, составлявших Совет.
*/
public class Solution {
    public static void main(String[] args) {
        int next_num = 0;
        while (next_num < 12) {
            next_num += 1;
            Jedi jedi = new Jedi(next_num);
            System.out.printf("%s %d %d %s %s\n", jedi.name, jedi.age, jedi.midichlorians, jedi.homeworld, jedi.species);
        }
    }
    static class Jedi {
        String name;
        int age;
        int midichlorians;
        String homeworld;
        String species;      
        
        public Jedi(int age){
            this("Name_" + age, age);
        }
        public Jedi(String name, int age){
            this(name, age, age*2);
        }
        public Jedi(String name, int age, int midichlorians){
            this(name, age, midichlorians, "Homeworld_" + age);
        }
        public Jedi(String name, int age, int midichlorians, String homeworld){
            this(name, age, midichlorians, homeworld, "species_" + age);
        }
        public Jedi(String name, int age, int midichlorians, String homeworld, String species){
            this.name = name;
            this.age = age;
            this.midichlorians = midichlorians;
            this.homeworld = homeworld;
            this.species = species;
        }
    }
}