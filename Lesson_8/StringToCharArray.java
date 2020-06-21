package JavaRushTask.JR_8;
/*
Написать программу, которая вводит с клавиатуры строку текста.
        Программа заменяет в тексте первые буквы всех слов на заглавные.
        Вывести результат на экран.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringToCharArray {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        //напишите тут ваш код
        char[] charArray = string.toCharArray();
        charArray[0] = Character.toUpperCase(charArray[0]);
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ') {
                charArray[i+1] = Character.toUpperCase(charArray[i+1]);
            }
        }
        System.out.println(charArray);
    }
}
