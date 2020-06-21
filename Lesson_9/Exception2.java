package JavaRushTask.JR_9;
/*Написать программу, которая будет вводить числа с клавиатуры.
        Код по чтению чисел с клавиатуры должен быть в методе readData.
        Код внутри readData обернуть в try..catch.
        Если пользователь ввёл какой-то текст, вместо ввода числа, то метод должен перехватить исключение и вывести на экран все ранее введенные числа в качестве результата.
        Числа выводить с новой строки сохраняя порядок ввода.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Exception2 {
    ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {

        readData();
    }

    public static void readData() {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try{
            while(true){
                int i = Integer.parseInt(reader.readLine());
                list.add(i);
            }
        }

        catch(NumberFormatException | IOException e){
            for(int i = 0; i < list.size(); i++){
                System.out.println(list.get(i));
            }
        }

    }
}


