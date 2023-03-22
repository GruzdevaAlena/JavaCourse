package JavaCorse.Lab10.Task2;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "Lab10/Task2/output.txt";
        if(writeFile("Java язык программирования",path)){
            System.out.println("Успешно");
        }
    }
    public static Boolean writeFile(String text,String path){
        try
        {
            FileWriter writer = new FileWriter(path, false);
            writer.write(text);
            writer.flush();
            return true;
        }
        catch(IOException e){
            System.out.println(e.getMessage());
            return false;
        }

    }
}