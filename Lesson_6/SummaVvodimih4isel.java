package JavaRushTask.JR_6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class SummaVvodimih4isel {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int summ=0;
        while (true){

            String s = reader.readLine();
            int s1 = Integer.parseInt(s);
            summ =summ+s1;
            if(s1 == -1)
                break;

        }
        System.out.println(summ);
    }
}

