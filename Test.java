import java.util.Scanner;

public class Test
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя пользователя (строка):");
        String name1 = in.nextLine();
        System.out.println("Введите возраст пользователя (целое число):");
        int age1 = in.nextInt();
        in.nextLine();
        User user1 = new User(name1, age1);

        System.out.println("Введите имя второго пользователя (строка):");
        String name2 = in.nextLine();
        System.out.println("Введите возраст второго пользователя (целое число):");
        int age2 = in.nextInt();
        User user2 = new User(name2, age2);

        if (user1.getAge() < user2.getAge())
            System.out.println(user1.toString());
        else
            System.out.println(user2.toString());
    }

}