import java.util.Scanner;

/*
Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.

Ödev
Java döngüler ile 0'dan girilen sayıya kadar
olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
 */
public class Odd_Even_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int number = input.nextInt();
        int i;
        double count = 0;
        double sum = 0;

        for (i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("------------");
        for (i = 0; i <= number; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                sum += i;
                if (i!=0){
                    count += 1;

                }

            }
        }
        double avarage = sum / count;
        System.out.println(avarage);



    }
}
