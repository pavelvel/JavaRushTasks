package JavaRushTask.JR_10;
/*
Задача: ввести с клавиатуры 30 чисел. Вывести 10-е и 11-е минимальные числа.
        Пояснение:
        Самое минимальное число - 1-е минимальное.
        Следующее минимальное после него - 2-е минимальное
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BubbleSort_10 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < 30; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[9]);
        System.out.println(array[10]);
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
}


