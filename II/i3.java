// В методе main создайте объект Zam и сразу сохраните ссылку на него в переменную zam.  
// В методе main создайте объект Dron и сразу сохраните ссылку на него в переменную dron.
// В методе main сохраните ссылку на ранее созданный объект Dron в zam.hunter.
// В методе main сохраните ссылку на ранее созданный объект Zam в dron.spy.
// Класс Zam должен содержать 3 переменные.
// Класс Dron должен содержать 3 переменные
public class Solution {
    public static void main(String[] args) {
        Zam zam = new Zam();
        Dron dron = new Dron();
        zam.hunter = dron;
        dron.spy = zam;
    }
    public static class Zam {
        int a=1, b=2, c=3;
        Dron hunter;
    }
    public static class Dron {
        int x=4, y=5, z=6;
        Zam spy;
    }
}