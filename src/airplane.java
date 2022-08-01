import java.util.Scanner;

public class airplane {
    public static void main(String[] args) {





        Scanner inp = new Scanner(System.in);
        int   age, km , typeTrip   ;

        System.out.println("Gideceginiz mesafeyi giriniz:");
        km = inp.nextInt();

        System.out.println("Yasinizi giriniz :");
        age = inp.nextInt();

        System.out.println("Seyehat Turunuzu Seciniz :" +
                " 1.Gidis" +
                "2.Gidis Donus");
        typeTrip = inp.nextInt();


        double normalFiyat , yasindirimi, tipIndirimi ;


        if  (age >0 && km > 0 && typeTrip== 2 || typeTrip == 1)  {
            normalFiyat= km * 0.10 ;
            if (age <12 ){
                yasindirimi = normalFiyat * 0.5 ;
                normalFiyat = normalFiyat - yasindirimi ;
            } else if (age>= 12 && age <= 24 ) {
                yasindirimi = normalFiyat * 0.1;
                normalFiyat = normalFiyat - yasindirimi;
            } else if (age >= 65) {
                yasindirimi = normalFiyat * 0.3 ;
                normalFiyat = normalFiyat - yasindirimi;

            }else {
                yasindirimi = 0;
                normalFiyat = normalFiyat - yasindirimi;


            }if (typeTrip ==2  ){
                tipIndirimi = normalFiyat * 0.2 ;
                normalFiyat = 2*(normalFiyat- tipIndirimi);


            }System.out.println("Bilet Fiyatiniz :"+normalFiyat);

        }
        }







    }

