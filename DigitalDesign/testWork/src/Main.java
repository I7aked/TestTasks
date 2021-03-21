import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringReceiving first = new StringReceiving();
        StringReceiving second = new StringReceiving();

        System.out.println("Введите свой пример строки ");
        System.out.println(first.computetation(scanner.nextLine()));
        System.out.println("Тестовый пример строки");
        System.out.println(second.computetation("a2[b2[c2[d2[e2[f]]]]]i"));

    }
}
