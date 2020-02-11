// Введите с клавиатуры имя: Darth Sidious и занесите его в переменную name.
// Вывести надпись:
// " "name" - is a header of the Senate"

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); 
        String name1 = scanner.nextLine(); 
        String name2 = scanner.nextLine(); 
        System.out.printf("%s + %s = True love!\n", name1, name2);
    }
}