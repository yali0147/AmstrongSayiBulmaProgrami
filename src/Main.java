import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Amstrong Sayı bulma");
         Scanner imp= new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int number = imp.nextInt();

        int result=0,pow,temp=number,basvalue,basnumber=0;
        while (temp!=0) {
            temp/=10;
            basnumber++;
        }temp=number;
        while (temp!=0){
            basvalue = temp % 10;
            pow=1;
            for (int i=1;i<=basnumber;i++){
                pow*=basvalue;
            }
            result+=pow;
            temp/=10;
        }
        if (result == number) {
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(number + " sayısı bir Armstrong sayısı değildir.");
        }

    }
}