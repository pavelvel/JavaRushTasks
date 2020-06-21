package JavaRushTask.JR_6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SredArifm {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        double sr=0;
        double count=-1;
        double sum=1;

        while(true){
            double i=Double.parseDouble(reader.readLine());
            count++;
            sum=sum+i;

            if (i==-1){
                sr=sum/count;
                System.out.println(sr);
                break;
            }

        }
    }
}
