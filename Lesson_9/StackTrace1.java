package JavaRushTask.JR_9;
/*
Реализовать метод log.
        Он должен выводить на экран имя класса и имя метода (в котором вызывается метод log), а также переданное сообщение.
        Имя класса, имя метода и сообщение разделить двоеточием с пробелом.
*/

public class StackTrace1 {


    public static void main(String[] args) {
        log("In main method");
    }
    public static void log(String s) {
        StackTraceElement [] element=Thread.currentThread().getStackTrace();

        System.out.println(element[2].getClassName()+":");
        System.out.println(element[2].getMethodName()+": "+s );



    }
}
