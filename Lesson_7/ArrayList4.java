package JavaRushTask.JR_7;
import java.io.*;
import java.util.ArrayList;

/*
1. Создай список строк.
        2. Добавь в него 10 строчек с клавиатуры.
        3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
        Если таких строк несколько, то должны быть учтены самые первые из них.
        4. Выведи на экран строку из п.3. Должна быть выведена одна строка.
*/

public class ArrayList4 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list=new ArrayList <>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        for(int i=0;i<10;i++){
            String s=reader.readLine();
            list.add(s);
        }
        String max=list.get(0);
        String min=list.get(0);

        for(int i=0;i<list.size();i++){
            if(max.length()<list.get(i).length()){
                max=list.get(i);
            }
            if(min.length()>list.get(i).length()){
                min=list.get(i);
            }

        }
        if(list.indexOf(min)<list.indexOf(max)) System.out.println(min);
        else System.out.println(max);

    }
}
