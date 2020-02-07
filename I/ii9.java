public class Solution {
    public static int a = 1;
    public static int b = 3;
    public static int c = 9;
    public static int d = 27;

    public static void main(String[] args) {
        int x = sqr(5);
        System.out.println(x);
    }
    
    public static int sqr(int n){
        return n * n;
    }
}