import java.util.Scanner;

public class Main {

public static void main(String[] args){
    Scanner sayiGirisi = new Scanner(System.in);
    System.out.println("Sayı giriniz:");
    int number= sayiGirisi.nextInt();
    int remainder=number%2;
    boolean isPrime=true;


    if(number==1)
    {
        System.out.println("Sayı asal değildir");
        return;
    }
    if(number<1)
    {
        System.out.println("Geçersiz sayı");
    }


    for(int i=2;i<number;i++)
    {
        if(number%i==0)
        {
            isPrime=false;
        }

    }

    if(isPrime)
    {
        System.out.println(number+" bir asal sayıdır.");
    }else
    {
        System.out.println(number+" bir asal sayı değildir");
    }




}
}




