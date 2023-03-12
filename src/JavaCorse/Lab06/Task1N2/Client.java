package JavaCorse.Lab06.Task1N2;

public class Client extends People {

    private String bank;
    public Client(String name, String surname,String bank) {
        super(name, surname);
        this.bank = bank;
    }

    public void Display() {
        System.out.printf("Данные клиента:\n Имя - %s \n Фамилия - %s \n Банк - %s \n",super.getName(),super.getSurname(),bank);
    }
}
