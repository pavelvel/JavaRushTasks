package JavaRushTask.JR_7;

/*
1. Создай список слов, заполни его самостоятельно.
        2. Метод fix должен:
        2.1. удалять из списка строк все слова, содержащие букву "р"
        2.2. удваивать все слова содержащие букву "л".
        2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
        2.4. с другими словами ничего не делать.
*/

import java.util.ArrayList;

public class ArrayList6 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        for (int i = 0; i < strings.size();) {
            if (strings.get(i).contains("р") && !strings.get(i).contains("л")){
                strings.remove(i);
            } else if(strings.get(i).contains("л") && !strings.get(i).contains("р")) {
                strings.add(i+1, strings.get(i));
                i +=2;
            }else i++;
        }
        return strings;
    }
}

