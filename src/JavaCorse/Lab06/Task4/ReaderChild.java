package JavaCorse.Lab06.Task4;

import java.util.Scanner;

public class ReaderChild extends Reader {

    public ReaderChild(Scanner in){
        super(in);
    }
    public void getNumber(){
        System.out.println("Число родителя - " + super.number);
    }
}
