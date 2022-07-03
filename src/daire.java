import java.util.Scanner;
public class daire {
    public static void main(String[] args) {
    int r ;
    double pi =3.14 ;

    Scanner input = new Scanner(System.in);

    System.out.print("Yaricap uzunlugunu giriniz :");
    r = input.nextInt();


    double alan = (r * r) * pi ;
    double cevre = 2 * pi * r;


    System.out.println("ALAN SONUC  :" + alan);
    System.out.println("CEVRE SONUC :" + cevre);

    }
}
