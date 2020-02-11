// Напишите код метода sumDigitsInNumber(int number). Метод на вход принимает целое трехзначное число. Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.
// Пример: Метод sumDigitsInNumber вызывается с параметром 322.
import java.util.stream.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(322));
    }
    public static int sumDigitsInNumber(int number) {
        int sum = Arrays.stream(Integer.toString(number).split("(?!^)")).mapToInt(Integer::parseInt).sum();
        return sum;
    }
}
// Требования:
// Программа не должна считывать данные с клавиатуры.
// Метод sumDigitsInNumber(int) должен быть публичным и статическим.
// Метод sumDigitsInNumber должен возвращать значение типа int.
// Метод sumDigitsInNumber не должен ничего выводить на экран.
// Метод sumDigitsInNumber должен правильно возвращать сумму.