import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    static int arr_size = 20;
    public static void main(String[] args) throws Exception {
        int[] array = initArr();
        int max = max(array);
        System.out.println("Max num: " + max);
    }

    public static int[] initArr() throws IOException {
        int[] array = new int[arr_size];
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        for(int x=0; x<arr_size; x++){
            array[x] = Integer.parseInt(reader.readLine());
        }
        return array;
    }

    public static int max(int[] array) {
        int m = array[0];
        for(int x=0; x<array.length; x++){
            if (m < array[x]){
                m = array[x];
            }
        }
        return m;
    }
}
// Метод initArr должен создавать массив из 20 целых чисел.
// Метод initArr должен считать 20 чисел и вернуть их в виде массива.
// Метод max должен возвращать максимальный элемент из переданного массива.
// Метод main изменять нельзя.