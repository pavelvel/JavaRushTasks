package JavaRushTask.JR_10;
/*Задача: Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
        Новая задача: Программа вводит с клавиатуры пары (число и строку), сохраняет их в HashMap.
        Пустая строка - конец ввода данных.
        Числа могут повторяться.
        Строки всегда уникальны.
        Введенные данные не должны потеряться!
        Затем программа выводит содержание HashMap на экран.
        Каждую пару с новой строки.*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class HashMap_10_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();

        while (true) {
            String name = reader.readLine();// испоользуется String тк isEmpty работает со String(с int не работает)
            if (name == null || name.isEmpty()) {
                name = " ";
                break;
            }
            int id = Integer.parseInt(name);// id присваивается конвертированная строка
            name = reader.readLine();
            if (name == null || name.isEmpty()) {
                name = " ";  //пустое значение-для занесения в мап вместо строки
            }
            map.put(name, id);

        }

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }

}

