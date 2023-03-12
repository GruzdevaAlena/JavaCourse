package JavaCorse.Lab06.Task5;

public class Client extends People{

    public Client(String Name,int age){
        super(Name,age);
    }

    @Override
    public void Print(){
        System.out.println("Имя пользователя - " + super.name);
    }
}
