package JavaCorse.Lab03;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Study study = new Study("Изучение Java - это просто!"); // 1 Задание
        System.out.println(study.printCourse());

        Car car = new Car("Голубой");   // 2 Задание
        car.Print();

        Car car2 = new Car("Синий", "2000 кг");
        car2.Print();

        Home home = new Home(); // 3 Задание
        home.Home(5, 2000, "Дом1");
        home.Print();
        System.out.println(home.yearBuild());

        Home home2 = new Home();
        home2.Home(10, 2010, "Дом2");
        home2.Print();
        System.out.println(home2.yearBuild());

        Tree tree = new Tree(100, "Дуб");
        Tree tree2 = new Tree(75, false, "Береза");
        Tree tree3 = new Tree();
    }
}
