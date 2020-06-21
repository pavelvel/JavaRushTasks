package JavaRushTask.JR_9;
/*Написать программу, которая вводит с клавиатуры строку текста.
        Программа должна вывести на экран две строки:
        1. первая строка содержит только гласные буквы из введённой строки.
        2. вторая - только согласные буквы и знаки препинания из введённой строки.
        Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CharArray {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String writeIn = reader.readLine();
        char[] chArray = writeIn.toCharArray();
        for (int i = 0; i < chArray.length;i++ ){
            if(chArray[i]!=' '){

                if (isVowel(chArray[i]) == true){
                    System.out.print(chArray[i] + " ");

                }
            }
        }

        System.out.println();

        for (int i = 0; i < chArray.length;i++ ){
            if(chArray[i]!=' '){
                if (isVowel(chArray[i]) == false){
                    System.out.print(chArray[i] + " ");

                }
            }
        }
        //напишите тут ваш код
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}

