package JavaCorse.Lab06.Task1N2;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Иван","Иванов","Сбербанк"); // 1 Задание
        client.Display();
        Worker worker = new Worker("Александр","Александров","Тинькофф");
        worker.Display();

        IPeople client1 = new Client("Максим","Максимов","Уралбанк");   // 2 Задание
        client1.Display();
        IPeople worker2 = new Worker("Анастасия","Осипова","ВТБ");
        worker2.Display();

    }
}