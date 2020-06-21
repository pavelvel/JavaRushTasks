package JavaRushTask.JR_7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array1 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] num = new int[10];
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        for (int a=0; a<10;a++){
            num[a] = Integer.parseInt(br.readLine());
        }
        for(int b=9;b>-1;b--){
            System.out.println(num[b]);
        }
    }
}

