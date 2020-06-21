package JavaRushTask.JR_7;
/*1. Создай список из слов "мама", "мыла", "раму".
        2. После каждого слова вставь в список строку, содержащую слово "именно".
        3. Вывести результат на экран, каждый элемент списка с новой строки.*/


import java.util.ArrayList;
import java.util.Collections;

public class ArrayList5 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"мама", "мыла", "раму");
        for (int i=0;i<list.size();i++){
            if(!list.get(i).equals("именно")){
                list.add(i+1,"именно");}
        }
        for (int i=0;i<list.size();i++)
            System.out.println(list.get(i));
    }
}
