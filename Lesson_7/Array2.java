package JavaRushTask.JR_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array2 {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] number = new int[20];
        for (int i = 0; number.length > i; i++)
            number[i] = Integer.parseInt(reader.readLine());// создай и заполни массив
        return number;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++)
            if (array[i]>max)
                max = array[i];// найди максимальное значение
        return max;
    }
}

