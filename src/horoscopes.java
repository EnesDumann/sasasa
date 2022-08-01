import java.util.Scanner ;

public class horoscopes {
    public static void main(String[] args) {
        int month , day;



        Scanner input = new Scanner(System.in);

        System.out.println("Dogdugunuz Ayi Yaziniz : ");
        month = input.nextInt();

        System.out.println("Dogdugunuz gunu yaziniz :");
        day = input.nextInt();

        if (month ==1  ){

        if  (day >= 1 && day <= 31 ){
            if(day<21) {
                System.out.println("Oglak Burcusunuz .");
            } else {
                System.out.println("Kova Burcusunuz .");

            }

            }else {
            System.out.println("Gecersiz Bir Sayi Girdiniz.");
        }
            }



        if (month ==2  ){

            if  (day >= 1 && day <= 29 ){
                if(day<19) {
                    System.out.println("Kova Burcusunuz .");
                } else {
                    System.out.println("Balik Burcusunuz .");

                }

            }else {
                System.out.println("Gecersiz Bir Sayi Girdiniz.");
            }
        }



        if (month ==3  ){

            if  (day >= 1 && day <= 31 ){
                if(day<21) {
                    System.out.println("Balik Burcusunuz .");
                } else {
                    System.out.println(" Koc Burcusunuz .");

                }

            }else {
                System.out.println("Gecersiz Bir Sayi Girdiniz.");
            }
        }



        if (month ==4  ){

            if  (day >= 1 && day <= 31 ){
                if(day<22) {
                    System.out.println("Koc Burcusunuz .");
                } else {
                    System.out.println("Boga Burcusunuz .");

                }

            }else {
                System.out.println("Gecersiz Bir Sayi Girdiniz.");
            }
        }





        if (month ==5  ){

            if  (day >= 1 && day <= 31 ){
                if(day<22) {
                    System.out.println("Boga Burcusunuz .");
                } else {
                    System.out.println("Ikizler Burcusunuz .");

                }

            }else {
                System.out.println("Gecersiz Bir Sayi Girdiniz.");
            }
        }





        if (month == 6 ){

            if  (day >= 1 && day <= 31 ){
                if(day<23) {
                    System.out.println("Ikizler Burcusunuz .");
                } else {
                    System.out.println("Yengec Burcusunuz .");

                }

            }else {
                System.out.println("Gecersiz Bir Sayi Girdiniz.");
            }
        }






        if (month == 7  ){

            if  (day >= 1 && day <= 31 ){
                if(day<24) {
                    System.out.println("Yengec Burcusunuz .");
                } else {
                    System.out.println( "Aslan Burcusunuz .");

                }

            }else {
                System.out.println("Gecersiz Bir Sayi Girdiniz.");
            }
        }






        if (month ==8  ){

            if  (day >= 1 && day <= 31 ){
                if(day<24) {
                    System.out.println("Aslan Burcusunuz .");
                } else {
                    System.out.println("Basak Burcusunuz .");

                }

            }else {
                System.out.println("Gecersiz Bir Sayi Girdiniz.");
            }
        }






        if (month == 9  ){

            if  (day >= 1 && day <= 31 ){
                if(day<23) {
                    System.out.println("Basak Burcusunuz .");
                } else {
                    System.out.println("Terazi Burcusunuz .");

                }

            }else {
                System.out.println("Gecersiz Bir Sayi Girdiniz.");
            }
        }






        if (month ==10  ){

            if  (day >= 1 && day <= 31 ){
                if(day<24) {
                    System.out.println("Terazi Burcusun .");
                } else {
                    System.out.println("Akrep Burcusunuz .");

                }

            }else {
                System.out.println("Gecersiz Bir Sayi Girdiniz.");
            }
        }




        if (month ==11  ){

            if  (day >= 1 && day <= 31 ){
                if(day<22) {
                    System.out.println("Akrep Burcusunuz .");
                } else {
                    System.out.println("Yay Burcusunuz .");

                }

            }else {
                System.out.println("Gecersiz Bir Sayi Girdiniz.");
            }
        }






        if (month ==12  ){

            if  (day >= 1 && day <= 31 ){
                if(day<22) {
                    System.out.println("Yay Burcusunuz :");
                } else {
                    System.out.println("Oglak Burcusunuz .");

                }

            }else {
                System.out.println("Gecersiz Bir Sayi Girdiniz.");
            }
        }
        System.out.println("Programimizi tercih ettiginiz icin Tesekkurler");





        }


    }

