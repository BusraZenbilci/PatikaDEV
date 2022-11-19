import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Scanner tanimla
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        double height = input.nextDouble();
        // kullanicidan boyunu girmesini iste
        System.out.print("Lütfen kilonuzu giriniz: ");
        int weight = input.nextInt();
        // kullanicidan kilosunu girmesini iste

        double bodyMassIndex = weight / (height * height);
        // boy ve kiloya göre vücut kitle indeksini hesapla

        System.out.println("Vucüt kitle indeksiniz: " + bodyMassIndex);
        // vücut kitle indeksini yazdir.
    }
}
