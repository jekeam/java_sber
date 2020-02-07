// Создать 3 объекта типа Jedi.
// Сохрани каждый экземпляр в отдельную переменную.
// Присвоить им имена "Obi-Wan", "Anakin", "Joda". 
public class Solution {
    public static void main(String[] args) {
        Jedi jedi1 = new Jedi();
        Jedi jedi2 = new Jedi();
        Jedi jedi3 = new Jedi();
        
        jedi1.name = "Obi-Wan";
        jedi2.name = "Anakin";
        jedi3.name = "Joda";
    }
    public static class Jedi {
        public String name;
    }
}
// Программа не должна выводить текст на экран.  
// В методе main должно быть только три переменные типа Jedi.
// Переменным сразу должны быть присвоены значения.
// Каждому объекту типа Jedi должно быть присвоено имя. В классе Jedi должна быть одна переменная name.
// В классе Jedi не должно быть методов.