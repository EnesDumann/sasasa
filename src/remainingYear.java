import java.util.Scanner ;

public class remainingYear {
    public static void main(String[] args) {


        int year ;
        boolean remainingYear  = false ;

        Scanner inf = new Scanner(System.in);
        System.out.println("Yili Giriniz :");
        year = inf.nextInt();


        if (year % 4 == 0) {

            if (year % 100== 0) {
                if (
                        year % 400==0
                ) {
                    remainingYear = true;
                }else{
                    remainingYear = false;
                } ;

            } else {
                remainingYear = true;
            }

        } else {
            remainingYear = false;
        }

        if (remainingYear== false){
            System.out.println("The year is a leap year. \n Entered year :  " + year);

        } else{
            System.out.println("Entered year is not a leap year. \n Entered yar : " + year);
        }

        }
    }
