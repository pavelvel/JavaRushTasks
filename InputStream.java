package JavaRushTask.JR_5;
import java.io.IOException;

 class InputStream {
    public static void main(String[] args) throws IOException {

        while (true) {
            int x = System.in.read();
            System.out.println((char)x);
        }
    }
}


