import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Пункту танданыз");
            System.out.println("1.Кошуу");
            System.out.println("2.Кемитуу");
            System.out.println("3.Кобойтуу");
            System.out.println("4.Болуу");
            System.out.println("5.Чыгуу");
            int person = scanner.nextInt();
            int result;
            if (person == 5) {
                break;
            } else if (person == 1) {
                System.out.println("Биринчи числону жазыныз");
                int a = scanner.nextInt();
                System.out.println("Экинчи числону жазыныз");
                int b = scanner.nextInt();
                System.out.println("биринчи число: " + a);
                System.out.println("экинчи число:  " + b);
                result = a+ b;
                System.out.println("Жообу: " + result);
            }
            else if (person == 2) {
                System.out.println("Биринчи числону жазыныз");
                int a = scanner.nextInt();
                System.out.println("Экинчи числону жазыныз");
                int b = scanner.nextInt();
                System.out.println("биринчи число: " + a);
                System.out.println("экинчи число : " + b);
                result = a - b;
                System.out.println("Жообу: " + result);
            }
            else if (person == 3) {
                System.out.println("Биринчи числону жазыныз");
                int a = scanner.nextInt();
                System.out.println("Экинчи числону жазыныз");
                int b = scanner.nextInt();
                System.out.println("биринчи число: " + a);
                System.out.println("экинчи число: " + b);
                result = a * b;
                System.out.println("Жообу: " + result);
            }
            else if (person == 4) {
                System.out.println("Биринчи числону жазыныз");
                int a = scanner.nextInt();
                System.out.println("Экинчи числону жазыныз");
                int b = scanner.nextInt();
                if (b == 0){
                    System.out.println("Нолго болгонго болбойт!");
                }
                System.out.println("биринчи число: " + a);
                System.out.println("экинчи число: " + b);
                result = a / b;
                System.out.println("Жообу: " + result);
            } else {
                System.out.println("Мындай пункт жок, ойлонуп анан басыныз ;)");
            }
            System.out.println("Программа бутту!");
        }
    }
}