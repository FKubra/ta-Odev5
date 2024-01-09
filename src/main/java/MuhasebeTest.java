import java.util.Scanner;

public class MuhasebeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Muhasebe calisan = new Muhasebe();

        System.out.println("Çalışan için çalıştığı gün sayısını giriniz: ");
        calisan.calisilanGun = input.nextInt();
        System.out.println("Çalışanın günlük ücretini giriniz: ");
        calisan.gunlukUcret = input.nextInt();

        calisan.maasHesapla();

    }
}
