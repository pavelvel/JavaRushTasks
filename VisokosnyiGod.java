package JavaRushTask.JR_5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class VisokosnyiGod {


    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(reader.readLine());
        int c;

            if (year % 400 == 0) {
                System.out.println("количество дней в году:366");
            } else if (year % 100 == 0) {
                System.out.println("количество дней в году:365");
            } else if (year % 4 == 0) {
                System.out.println("количество дней в году:366");
            } else {
                System.out.println("количество дней в году:365");

            }

        }
        }



