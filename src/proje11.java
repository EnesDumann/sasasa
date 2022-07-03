import java.util.Scanner;
public class proje11
{
    public static void main(String[] args) {
        int a,b ;
        double c;

        Scanner girdi =new Scanner(System.in);
        System.out.print("1.kenari girin :" );
        a = girdi.nextInt();
        System.out.print("2.kenari girin :");
        b= girdi.nextInt();


        c=Math.sqrt((a*a) + (b*b));
        System.out.print("Hipotenus: " + c);
    }
}
