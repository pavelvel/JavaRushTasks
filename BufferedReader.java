package JavaRushTask.JR_5;


import java.io.*;
/*
Предсказание на будущее
*/

class BufferedReader {
    public static void main(String[] args) throws Exception {
        java.io.BufferedReader reader=new java.io.BufferedReader(new InputStreamReader(System.in));
        System.out.println("vvedite name");
        String name=reader.readLine();
        System.out.println("vvedite zp");
        String number1=reader.readLine();
        System.out.println("vvedite 4erez skolko let");
        String number2=reader.readLine();
        System.out.print(name+" получает "+number1+" через "+number2+" лет.");

    }
}
