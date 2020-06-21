package JavaRushTask.JR_7;


/*
1. Создай список строк.
        2. Добавь в него 5 строк с клавиатуры.
        3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
        4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list=new ArrayList<>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<5;i++){
            String s=reader.readLine();
            list.add(s);
        }
        for(int i=0;i<13;i++){
            list.add(0,list.get(4));
            list.remove(5);
        }
        for(int i=0;i<list.size();i++) System.out.println(list.get(i));

    }
}
