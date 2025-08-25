import java.util.Scanner;

public class armstrong {

    public static void main(String[] args) {

        int sayi;

        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        sayi = inp.nextInt();

        int geciciSayi = sayi;
        int basamakSayisi = 0;
        int toplam = 0;
        int basToplam = 0;

        // basamak sayısını bulmak :

        while(geciciSayi > 0){
            basamakSayisi++;
            geciciSayi /= 10;
        }

        geciciSayi = sayi; // tekrar kullanmak için kopya sıfırlandı

        // her basamağın üssünü alıp toplama :

        while(geciciSayi > 0){
            int basamak = geciciSayi % 10; // son basamak
            int usSonuc = 1;
            for (int i=0; i<basamakSayisi; i++){
                usSonuc *= basamak;
            }
            toplam += usSonuc;
            basToplam += basamak;
            geciciSayi /= 10;
        }

        if(toplam == sayi){
            System.out.println(sayi + " bir Armstrong sayıdır");
        } else {
            System.out.println(sayi + " bir Armstrong sayı değildir.");
        }

        System.out.println("Basamaklar toplamı : " + basToplam);

    }
}
