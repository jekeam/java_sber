// Введите с клавиатуры имя: Darth Sidious и занесите его в переменную name.
// Вывести надпись:
// " "name" - is a header of the Senate"

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); 
        String name = scanner.nextLine(); 
        int count = scanner.nextInt(); 
        System.out.printf("Master %s is here with %d jedis\n", name, count);
    }
}