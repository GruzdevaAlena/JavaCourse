package JavaCorse.Lab06.Task5;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        People people = new People(in);
        people.print();


        People client = new Client(in);
        client.print();


    }
}