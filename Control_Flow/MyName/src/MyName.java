import java.util.Scanner;

public class MyName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // zbog entera nakon unosenja godista, scanner preskace trazenje imena. potrebno je udrit nextLine kako bi se ponistilo djelovanje entera

        age = 2019 - age;

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Your name is: " + name + "and your age is: " + age);

        scanner.close();
    }
}
