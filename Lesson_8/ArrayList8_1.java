package JavaRushTask.JR_8;


/*
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
        Новая задача: Программа должна работать не с номерами домов, а с городами:
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class ArrayList8_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();
        while (true) {
            String city=reader.readLine();
            if (city.isEmpty()) {
                break;
            }
            String family = reader.readLine();
            if (family.isEmpty()) {
                break;
            }
            list.add(city);
            list.add(family);
        }


        String city2=reader.readLine();
        if (list.contains(city2)) {
            int family2=list.indexOf(city2)+1;
            System.out.println(list.get(family2));


        }
    }
}
