package JavaRushTask.JR_6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SimpleSort {


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int max = (Math.max(Math.max(a, b), c));
        int min = (Math.min(Math.min(a, b), c));
        int mid = a + b + c - (max + min);
        System.out.println(max + " " + mid + " " + min);

    }
}
