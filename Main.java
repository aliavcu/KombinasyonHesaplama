import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N,r,a;
        int totalN=1, totalr=1, totala=1, sonuc;
        System.out.print("N sayısını giriniz: ");
        N = scan.nextInt();
        System.out.print("r sayısını giriniz: ");
        r = scan.nextInt();
        a = N-r ;
        for (int i=1; i<=N; i++){
            totalN *=i;
        }
        for (int i=1; i<=r; i++){
            totalr *= i;
        }
        for (int i=1; i<=a; i++){
            totala *=i;
        }
        sonuc = totalN / (totalr*totala);
        System.out.println("Sonuç: " + sonuc);
    }
}