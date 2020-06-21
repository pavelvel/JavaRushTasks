package JavaRushTask.JR_13;
/*1. Считать с консоли имя файла.
        2. Вывести в консоль(на экран) содержимое файла.
        3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.*/

import  java.io.*;
public class FileInputStream_1 {
    public static void main(String[] args) throws IOException{
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inStream = new FileInputStream(reader.readLine());

        while(inStream.available()>0){
            System.out.print((char)inStream.read());
        }

        inStream.close();
        reader.close();


    }
}
