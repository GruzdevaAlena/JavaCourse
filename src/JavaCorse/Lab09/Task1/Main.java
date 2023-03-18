package JavaCorse.Lab09.Task1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(); // Задача 1
        names.add("Егор");
        names.add("Анастасия");
        names.add("Егор");
        names.add("Иван");
        names = new ArrayList<>(duplicats(names));
        System.out.println(names);


    }
    public static <T>Collection<T> duplicats(Collection<T> collection){
        return new HashSet<>(collection);
    }


}