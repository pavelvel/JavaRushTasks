package JavaRushTask.JR_10;

import java.io.*;
import java.util.*;

public class ToCharArray {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж',
                'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о',
                'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        // напишите тут ваш код

       /* HashMap<Character,Integer>map=new HashMap<>(); можно создать Мап, но тогда без сортировки
        вывод будет произвольный*/
        for (int i = 0; i < alphabet.size(); i++) {    //беру букву-элемент alphabet
            int count = 0;
            for (int j = 0; j < 10; j++) {
                char[] chArray = list.get(j).toCharArray();//перевожу строку в массив символов
                for (int x = 0; x < chArray.length; x++) {
                    if (alphabet.get(i).equals(chArray[x]))  //сравниваю символ из alphabet с каждым символом из chArray
                        count++;
                }
            }
            System.out.println(alphabet.get(i) + " " + count);
            //map.put(alphabet.get(i),count);
        }
       /*  for (Map.Entry<Character, Integer> pair : map.entrySet()) {
             System.out.println(pair.getKey() + " " + pair.getValue());
         }*/

    }
}
