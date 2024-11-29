import java.util.Scanner;
public class Tugas23 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int N = sc.nextInt();

        int[] angka = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Masukkan angka ke-" + (N - i) + ": ");
            angka[i] = sc.nextInt();
        }
        int total = hitung(angka, N);
        System.out.println("Total dari " + N + " angka yang dimasukkan adalah: " + total);
    
    }
    static int hitung(int[] angka, int N) {
        if (N == 0) {
            return 0;
        } else {
            return angka[N - 1] + hitung(angka, N - 1);
        }
    }
    static int hitungIteratif(int[] angka, int N) {
        int total = 0;
        for (int i = 0; i < N; i++) {
            total += angka[i];
        }
        return total;
    }
}