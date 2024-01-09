public class Muhasebe {

    int calisilanGun;
    int gunlukUcret;
    int maas;
    int prim;

    public void maasHesapla(){
        if (calisilanGun <= 25){
            maas = calisilanGun * gunlukUcret;
            System.out.println("Çalışanın maaşı: " + maas);
        }
        else{
            prim = (1000 * (calisilanGun -25) );
            maas = (calisilanGun * gunlukUcret) + prim ;
            System.out.println("Çalışanın maaşı: " + maas);
        }


    }

}
