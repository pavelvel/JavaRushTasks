package JavaRushTask.JR_7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayList2 {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        strings=new ArrayList<>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        for(int i=0;i<5;i++){
            String s =reader.readLine();
            strings.add(s);
        }
        String max=strings.get(0);

        for(int i=0;i<strings.size();i++){
            if(strings.get(i).length()>max.length())
                max=strings.get(i);

        }

        for(int i=0;i<strings.size();i++){
            if(strings.get(i).length()==max.length()) {System.out.println(strings.get(i)); }
            //вывод всех строк с максимальной(одинаковой) длиной.
        }



    }
}
