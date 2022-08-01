import java.util.Scanner ;

public class zodiac {
    public static void main(String[] args) {


        int year , circle ;

        Scanner input = new Scanner(System.in);

        System.out.println("Doğum Yılınızı Giriniz:");
        year = input.nextInt();
        circle = year % 12;

        if (year > 0 && circle >= 0 && circle<=12)
        if ( circle == 0 ){
            System.out.println("Zodiac Burcunuz : Maymundur ");
        } if  (circle == 1 ) {
            System.out.println("Zodiac Burcunuz :Horozdur");

        } if (circle == 2 ){

            System.out.println("Zodiac Burcunuz:Kopektir");
        }if (circle== 4){
            System.out.println("Zodiac Burcunuz :Domuzdur");
        }if (circle== 5){
            System.out.println("Zodiac Burcunuz :Faredir ");
        }if (circle== 6){
            System.out.println("Zodiac Burcunuz :Okuzdur");
        }if (circle== 7){
            System.out.println("Zodiac Burcunuz :Kaplandir");
        }if (circle== 8){
            System.out.println("Zodiac Burcunuz :Tavsandir");
        }if (circle== 9){
            System.out.println("Zodiac Burcunuz :Ejderhadir");
        }if (circle== 10){
            System.out.println("Zodiac Burcunuz :Yilandir ");
        }if (circle== 11){
            System.out.println("Zodiac Burcunuz :Atdir");
        }if (circle== 12){
            System.out.println("Zodiac Burcunuz :Koyundur");
        }else if ((circle < 0) || (circle>12)) {
            System.out.println("Lutfen Dogru Bir Deger Giriniz !!");
        }

        System.out.println("Bizi Tercih Ettiginiz Icin Tesekkur Ederiz :)");

    }
}
