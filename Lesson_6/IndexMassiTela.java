package JavaRushTask.JR_6;
import java.io.*;
public class IndexMassiTela {
    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Vedite ves v kg");
        double weight = Double.parseDouble(bis.readLine());
        System.out.println("Vvedite rost v santimetrah");
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            double index=weight/(height*height)*10000;
            if (index<18.5){System.out.println("Недовес: меньше чем 18.5");
                System.out.println(index);}
            else if (index>=18.5&&index<25){System.out.println("Нормальный: между 18.5 и 25");
            System.out.println(index);}
            else if (index>=25&&index<30){System.out.println("Избыточный вес: между 25 и 30");
              System.out.println(index);}
            else if (index>=30){System.out.println("Ожирение: 30 или больше");
              System.out.println(index);}

        }
    }

}
