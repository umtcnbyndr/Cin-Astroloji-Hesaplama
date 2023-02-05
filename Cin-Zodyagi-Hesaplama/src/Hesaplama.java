import java.util.Scanner;
public class Hesaplama {
    public static void main(String[] args) {
        //Değişkenlerin tanımlanması.

        int dogumyili,sonuc;

        //Bilgi girişi yapılma işlemi.
        Scanner input=new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz: ");
        dogumyili=input.nextInt();

        //Çin Zodyağı burcu karşılaştırma işlemi ve sonucu.

        sonuc=dogumyili%12;

        switch (sonuc){

            case 0:
                System.out.println("Çin zodyağı burcunuz:MAYMUN ("+sonuc+")");
                break;

            case 1:
                System.out.println("Çin zodyağı burcunuz:HOROZ ("+sonuc+")");
                break;

            case 2:
                System.out.println("Çin zodyağı burcunuz:KÖPEK ("+sonuc+")");
                break;

            case 3:
                System.out.println("Çin zodyağı burcunuz:DOMUZ ("+sonuc+")");
                break;

            case 4:
                System.out.println("Çin zodyağı burcunuz:FARE ("+sonuc+")");
                break;

            case 5:
                System.out.println("Çin zodyağı burcunuz:ÖKÜZ ("+sonuc+")");
                break;

            case 6:
                System.out.println("Çin zodyağı burcunuz:KAPLAN ("+sonuc+")");
                break;

            case 7:
                System.out.println("Çin zodyağı burcunuz:TAVŞAN ("+sonuc+")");
                break;

            case 8:
                System.out.println("Çin zodyağı burcunuz:EJDERHA ("+sonuc+")");
                break;

            case 9:
                System.out.println("Çin zodyağı burcunuz:YILAN ("+sonuc+")");
                break;

            case 10:
                System.out.println("Çin zodyağı burcunuz:AT ("+sonuc+")");
                break;

            case 11:
                System.out.println("Çin zodyağı burcunuz:KOYUN ("+sonuc+")");
                break;
        }
    }
}
