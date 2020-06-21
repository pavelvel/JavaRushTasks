package JavaRushTask.JR_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array4 {
    static int chet=0;
    static int nechet=0;
    public static void main(String[] args) throws IOException {
        int value=0;
        int[] number=new int [15];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<15;i++){
            number[i]=Integer.parseInt(reader.readLine());
            if (i%2==0){
                chet+=number[i];
            }
            else {nechet+=number[i];
            }
        }
        if(chet>nechet)System.out.println("В домах с четными номерами проживает больше жителей.");
        else System.out.println("В домах с нечетными номерами проживает больше жителей." );

    }
}
