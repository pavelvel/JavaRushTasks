package JavaRushTask.JR_13;
import java.io.*;
import java.util.*;

public class FileInputStreamAndSort {
    public static void main(String[] args) throws  IOException{
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream fis=new FileInputStream(reader.readLine());
        ArrayList <Integer> list=new ArrayList<>();

        try{
           while(fis.available()>0) {
               if(fis.read()%2==0)  list.add(fis.read());
           }
        }
        catch (Exception e){
            System.out.println(e);
        }
        fis.close();
        reader.close();

        for(int i=0;i<list.size();i++){
            int temp;
            for(int j=i+1;j<list.size();j++){
               if(i>j){
                   temp=i;
                   i=j;
                   j=i;
               }
            }
        }
        for(Integer i:list) {
            System.out.println(list.get(i));
        }
    }
}
