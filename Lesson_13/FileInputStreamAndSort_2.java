package JavaRushTask.JR_13;
import java.io.*;
import java.util.*;
/*
1. Ввести имя файла с консоли.
        2. Прочитать из него набор чисел.
        3. Вывести на консоль только четные, отсортированные по возрастанию.
*/

public class FileInputStreamAndSort_2 {

    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        //вводим имя файла
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        //формируем поток
        FileInputStream fileInputStream = new FileInputStream(fileName);
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(fileInputStream));

        ArrayList<Integer> list = new ArrayList<>();

        while(reader2.ready()){
            int i = Integer.parseInt(reader2.readLine());
            if(i%2==0){
                list.add(i);
            }
        }

        Collections.sort(list);
        for (int i : list){
            System.out.println(i);
        }

        fileInputStream.close();
        reader.close();
        reader2.close();
    }
}
