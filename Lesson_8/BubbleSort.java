package JavaRushTask.JR_8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BubbleSort {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
         /////////////////////////////////////////////   isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] < array[i+1]){
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
    }}

