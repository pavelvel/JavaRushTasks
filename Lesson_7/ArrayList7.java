package JavaRushTask.JR_7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayList7 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        for (int i=0; i<10; i++)
        {
            String s = reader.readLine();
            list.add(s);
        }

        ArrayList<String> result = doubleValues(list);

        for (String string : result) {
            System.out.println(string);
        }// Вывести на экран result
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i=0; i<list.size(); i+=2) {
            String j = list.get(i);
            list.add(i, j);  }

        //напишите тут ваш код
        return list;
    }
}


