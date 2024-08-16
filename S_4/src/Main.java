import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Basamak Sayıları Toplamı

        System.out.println("Değer giriniz : ");
        Scanner input =new Scanner(System.in);
        int number = input.nextInt();
        int top=0;
        int kalan=0;
        while (number !=0){
             kalan=number%10;
             top +=kalan;
             number/=10;
        }
        System.out.println("Basamak sayılarının toplamı :"+top);
    }
}