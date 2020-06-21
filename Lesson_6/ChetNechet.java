package JavaRushTask.JR_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChetNechet {

    public static int even=0;
    public static int odd=0;
    public static void main(String[] args) throws IOException {


            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s1 = reader.readLine();
            int length = s1.length();
            for (int i = 0; i < length; i++) {
                String str = s1.substring(i, i + 1);//начинается с индекса под номером i(0) и заканчивается на индексе под номером i+1(1)
                //	System.out.println(str);
                int number = Integer.parseInt(str);
                if(number%2 ==0) {
                    even++;
                }else odd++;
            }
            System.out.println("Even: " + even + " Odd: " + odd);}}

            // исправить--0 считается за четное