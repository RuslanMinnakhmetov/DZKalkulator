import java.util.Scanner;

public class Application {
    public static void main (String[] args) throws NumberFormatException {
        System.out.println("Пожалуйста, введите пример. Пример: 5 + 5 (между цифрой и знаком должен быть пробел.): ");
        Scanner sca = new Scanner(System.in);
        try {
            String[] parts = sca.nextLine().split(" ");

            int a = Integer.parseInt(parts[0]);
            String op = parts[1];
            int b = Integer.parseInt(parts[2]);
            if (a<11 && b<10 && a%1==0 && b%1==0){

                int result = 0;

                switch (op) {
                    case "+":
                        result = a + b;
                        break;
                    case "-":
                        result = a - b;
                        break;
                    case "*":
                        result = a * b;
                        break;
                    case "/":
                        result = a / b;
                        break;
                    default:
                        System.out.println("Операция не верна.");
                }
                System.out.println(result);}
            else {
                System.out.println("Вы ввели неверный пример.");
                System.exit(0);
            }
        }
        catch (NumberFormatException e){
            System.out.println("Вы ввели неверный пример.");
            System.exit(0);
        }
    }

}
