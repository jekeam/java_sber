// Создайте объект типа Clone1, Clone2, Clone3 и объект типа Dias.
// Присвой каждому клону владельца (owner).
public class Solution {
    public static void main(String[] args) {
        Clone1 clone1 = new Clone1();
        Clone2 clone2 = new Clone2();
        Clone3 clone3 = new Clone3();
        Dias dias = new Dias();
        
        clone1.owner = new Dias();
        clone2.owner = new Dias();
        clone3.owner = new Dias();
        
    }
    public static class Clone1 {
        public Dias owner;
    }
    public static class Clone2 {
        public Dias owner;
    }
    public static class Clone3 {
        public Dias owner;
    }
    public static class Dias {
    }
}
// Программа не должна выводить текст на экран. 
// В методе main создайте объекты типа Clone1, Clone2, Clone3, Dias занесите их ссылки в переменные.
// В методе main присвойте каждому животному владельца Dias.
// Каждый класс Clone1, Clone2, Clone3 должен содержать только одну переменную Dias owner.
// Класс Dias не должен содержать переменных.