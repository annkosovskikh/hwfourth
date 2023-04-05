import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                int number;


                System.out.print("Введите шестизначный номер: ");
                number = scanner.nextInt();

                int evenSum = 0;
                int oddSum = 0;
                int ticket = number;

                while (true) {
                    while (ticket > 0) {
                        int digit = ticket % 10;
                        if (digit % 2 == 0) evenSum += digit;
                        else oddSum += digit;
                        ticket /= 10;
                    }

                    if (evenSum == oddSum) {
                        System.out.println("Ваш билет счастливый!");
                        break;
                    }
                    else evenSum = oddSum = 0;
                        number++;
                        ticket = number;
                }
                System.out.println("Следующий счастливый билет: " + number);
            }
        }