package JavaRushTask.JR_5;
import java.io.*;

class BufferedReader2 {

    public static void main(String[] args) throws Exception {
        java.io.BufferedReader reader = new java.io.BufferedReader(new InputStreamReader(System.in));
        System.out.println("vvedite 4to-to");
        int c;
        while((c = reader.read()) != -1){
            System.out.print((char)c);


        }



    }
}

