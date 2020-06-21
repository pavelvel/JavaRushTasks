package JavaRushTask.JR_5;
import java.io.*;
import java.io.BufferedReader;

class Treugolnik {
    public static void main(String[] args) throws Exception {
        java.io.BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(reader.readLine());
        int b=Integer.parseInt(reader.readLine());
        int c=Integer.parseInt(reader.readLine());
        if((a<(b+c))&&(b<(a+c))&&(c<(a+b))){
            System.out.println("Треугольник существует.");
        }
        else {System.out.println("Треугольник не существует.");


        }
    }
}
