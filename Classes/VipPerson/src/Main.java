public class Main {
    public static void main(String[] args) {

        Account PERSON = new Account ();

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bob", 25000.00);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Ana", 100.00, "ana@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAdress());
    }
}
