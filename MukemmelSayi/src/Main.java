import java.util.Scanner;

public class Main {

public static void main(String[] args){
    Scanner sayiGirisi = new Scanner(System.in);
    System.out.println("Lütfen bir sayı giriniz: ");
    int number= sayiGirisi.nextInt();
    boolean mukemmelSayiMi=false;
    int total=0;

    if(number<=1) {
        System.out.println("Lütfen geçerli bir sayı giriniz");
        return;
    }
    for(int i=1;i<number;i++) {
        if(number%i==0) {
            total+=i;
        }
    }

    if(total==number) {
        System.out.println(number+" sayısı mukemmel bir sayıdır");
    }else {
        System.out.println(number+" sayısı mukemmel bir sayı değildir");

    }
}
}




