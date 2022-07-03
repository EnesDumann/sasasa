import java.util.Scanner;

public class taksi {
    public static void main(String[] args) {
        int km; double perkm = 2.20 ,total ,startPrice= 10 ;
        Scanner deger = new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz:");
        km = deger.nextInt();
        total = (km * perkm);
        total += startPrice ;
        System.out.println(total);

    }
}
