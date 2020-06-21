package JavaRushTask.JR_8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class HashMapAndDate {

  /*  Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
    Удалить из словаря всех людей, родившихся летом.*/

    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Супермен", dateFormat.parse("APRIL 1 2012"));
        map.put("Бэтмен", dateFormat.parse("MARCH 1 2012"));
        map.put("Леонардо", dateFormat.parse("FEBRUARY 1 2012"));
        map.put("Сплинтер", dateFormat.parse("JANUARY 1 2012"));
        map.put("Донатель", dateFormat.parse("DECEMBER 1 2012"));
        map.put("Рафаэль", dateFormat.parse("AUGUST 1 2012"));
        map.put("Микеланджело", dateFormat.parse("NOVEMBER 1 2012"));
        map.put("Паркер", dateFormat.parse("OCTOBER 1 2012"));
        map.put("Старк", dateFormat.parse("MAY 1 2012"));
        return map;
        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        map.values().removeIf(date -> date.getMonth() == Calendar.JUNE
                ||date.getMonth() == Calendar.JULY
                ||date.getMonth() == Calendar.AUGUST);


    }

    public static void main(String[] args) {

    }
}


