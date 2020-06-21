package JavaRushTask.JR_9;
/*Задача: Пользователь вводит с клавиатуры список слов (и чисел).
        Слова вывести в возрастающем порядке, числа - в убывающем.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BubbleSort_9_1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код
        String tempString;


        for (int n = 0; n < array.length; n++) {
            for (int m = n + 1; m < array.length; m++) {
                if (isNumber(array[n]) && isNumber(array[m])) {
                    Integer x=Integer.parseInt(array[n]);
                    Integer y=Integer.parseInt(array[m]);

                    if (x<y) {
                        tempString=array[n];
                        array[n]=array[m];
                        array[m]=tempString;

                    }
                }
                if (!isNumber(array[n]) && !isNumber(array[m])){
                    if (isGreaterThan(array[n], array[m])){
                        tempString=array[n];
                        array[n]=array[m];
                        array[m]=tempString;
                    }
                }
            }
        }

    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
    public static boolean isGreaterThan(Integer a, Integer b) {
        return a.compareTo(b) > 0;
    }

    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-')) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}


