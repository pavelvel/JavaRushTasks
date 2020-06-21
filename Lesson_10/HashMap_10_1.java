package JavaRushTask.JR_10;
/*
Ввести с клавиатуры в список 20 слов.
        Нужно подсчитать сколько раз каждое слово встречается в списке.
        Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр - уникальное слово,
         а второй - число, сколько раз данное слово встречалось в списке.

        Вывести содержимое словаря на экран.
        В тестах регистр (большая/маленькая буква) влияет на результат.
*/

import java.io.*;
import java.util.*;
public class HashMap_10_1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        for (int i = 0; i < list.size(); i++) {
            int count = 1;
            for (int j = i + 1; j < list.size(); j++) {     //пробегаю по ArrayList list в поисках совпадений
                if (list.get(i).equals(list.get(j))) {         //сравниваю текущее слово со всеми словами list
                    list.remove(j);                         //при нахождении совпадения удаляю дублирующееся слово дабы не проходить по нему повторно внешним циклом
                    count ++;                               //при нахождении дублирующегося слова счетчик увеличивается на единицу
                    j--;                                    //откатываю назад поскольку текущая ячейка удалена (чтобы не перескочить j + 1)
                }
            }
            result.put(list.get(i), count);                 //в ключ добавляю слово, в значение количество повторений
        }
        return result;
    }
}


