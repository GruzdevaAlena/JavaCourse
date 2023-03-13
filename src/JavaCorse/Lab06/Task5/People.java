package JavaCorse.Lab06.Task5;

import java.util.Scanner;

public class People {
    protected String name;
    protected int age;
    public People(Scanner in) {
        System.out.println("Введите имя: ");
        this.name = in.next();
        System.out.println("Введите возраст: ");
        this.age = in.nextInt();
    }
    public void print(){
        System.out.println("Возраст пользователя - " + this.age);
    }
}
