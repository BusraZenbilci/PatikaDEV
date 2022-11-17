/**
 * @author: Büşra Zenbilci
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double pear = 2.14 , apple = 3.67 , tomato=1.11 , banana = 0.95 , eggplant=5.00;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut kaç kilo : ");
        int a= input.nextInt();        // kullanicidan kaç kilo armut alacagını girmemiz istenir
        System.out.print("Elma kaç kilo: ");
        int e = input.nextInt();      // kullanicidan kaç kilo elma alacagını girmemiz istenir
        System.out.print("Domates kaç kilo: ");
        int d = input.nextInt();      // kullanicidan kaç kilo domates alacagını girmemiz istenir
        System.out.print("Muz kaç kilo: ");
        int m = input.nextInt();      // kullanicidan kaç kilo muz alacagını girmemiz istenir
        System.out.print("Patlıcan kaç kilo: ");
        int p = input.nextInt();      // kullanicidan kaç kilo patlican alacagını girmemiz istenir

        double toplamTutar = (pear * a) + (apple * e) + (tomato * d) + (banana * m) + (eggplant * p);
        // toplam ne kadar para ödeneceği hesaplanir
        System.out.print("Toplam tutar: " + toplamTutar);
        // ödenecek tutar burada bastirilir
    }
}
