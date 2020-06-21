package JavaRushTask.JR_7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array3 {  public static void main(String[] args) throws Exception {
    String [] string=new String[10];
    int [] chisla=new int[10];
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    for(int i=0;i<10;i++){
        string [i]=reader.readLine();
    }
    for(int i=0;i<10;i++){
        chisla [i]=string[i].length();
        System.out.println(chisla[i]);
    }

}
}

