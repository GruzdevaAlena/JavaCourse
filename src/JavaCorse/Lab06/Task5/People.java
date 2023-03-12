package JavaCorse.Lab06.Task5;

public class People {
    protected String name;
    protected int age;
    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void Print(){
        System.out.println("Возраст пользователя - " + this.age);
    }
}
