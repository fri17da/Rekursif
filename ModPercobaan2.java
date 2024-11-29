import java.util.Scanner;
public class ModPercobaan2 {
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
           return (1);
        } else {
            return (x * hitungPangkat(x, y - 1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan;
        int pangkat;
        System.out.print("Bilangan yang dihitung: ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        pangkat = sc.nextInt();
        int n = bilangan;
        for (int i = n; i >= n; i--) {
            System.out.print("dicetak ");
            for (int j = 1; j <= pangkat; j++) {
                System.out.print(n + "x");
            }
            System.out.print(1 + " = " + hitungPangkat(bilangan, pangkat));
            System.out.println();
    }
}
}