import java.util.Scanner;
 class manav {
    public static void main(String[] args) {
        double a ,b ,c ,d ,e ;
        double af=2.14 , bf = 3.67, cf = 0.95, df = 1.11,ef = 5 ;
        double result ;
        Scanner input = new Scanner(System.in);
        System.out.print("ARMUT KG GIRINIZ:");
        a = input.nextDouble();
        System.out.print("ELMA KG GIRINIZ ");
        b = input.nextDouble();
        System.out.print(" MUZ KG GIRINIZ :");
        c = input.nextDouble();
        System.out.print("DOMATEZ KG GIRINIZ :");
        d = input.nextDouble();
        System.out.print("PATLICAN KG GIRINIZ");
        e = input.nextDouble();
        result = a* af + b*bf + c*cf + d*df +e*ef ;
        System.out.print("TOPLAM :" + result );



    }
}
