/* 
Реализуем метод print
*/
public class Solution {
    public static void main(String[] args) {
        print("The power is easy to use!");
        print("The power opens many opportunities!");
    }
    public static void print(String s) {
        int x = 1;
        while (x <= 4){
            x += 1;
            System.out.println(s);
        }
    }
}