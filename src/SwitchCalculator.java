import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        double n1,n2;
        String op;
        Scanner s = new Scanner(System.in);
        System.out.print("Hesaplamak için ilk sayıyı giriniz: ");
        n1 = s.nextDouble();
        System.out.print("Hesaplamak için ikinci sayıyı giriniz: ");
        n2 = s.nextDouble();
        System.out.print("İşlem giriniz(+-*/): ");
        s.nextLine();
        op = s.nextLine();



        switch(op) {
            case "+":
                System.out.println("Toplam: " + (n1 + n2));
                break;
            case "-":
                System.out.println("Fark: " + (n1 - n2));
                break;
            case "*":
                System.out.println("Çarpım: " + (n1 * n2));
                break;
            case "/":
                System.out.println("Bölüm: " + (n1 * n2));
                break;
            default:
                System.out.println("Hatalı operatör girdiniz!");
        }
    }
}
