package JavaRushTask.JR_6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Svetofor {
    public static void main(String[] args) throws Exception {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        double t=Double.parseDouble(reader.readLine());

        if((t%5)>=0&&(t%5)<3){
            System.out.println("зеленый");
        }
        else if((t%5)>=3&&(t%5)<4){
            System.out.println("жёлтый");
        }
        else System.out.println("красный");
    }
}

