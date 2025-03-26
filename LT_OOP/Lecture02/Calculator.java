import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1st number: ");
        String strNum1 = scanner.nextLine();
        System.out.print("2nd number: ");
        String strNum2 = scanner.nextLine();

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        System.out.println("tong: " + sum);
        System.out.println("hieu: " + difference);
        System.out.println("tich: " + product);

        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("thuong: " + quotient);
        } else {
            System.out.println("Lỗi: Không thể chia cho 0.");
        }

        scanner.close();
    }
}
