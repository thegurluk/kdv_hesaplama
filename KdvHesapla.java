import java.util.Scanner;
public class KdvHesapla {
    public static void main(String[] args) {
        System.out.println("Hoşgeldiniz.");
        System.out.println("KDV sini Hesaplamak istediğiniz ürünün tutarını giriniz:");

        Scanner input=new Scanner(System.in);
        double a= input.nextDouble();
        double kdv=a*18/100;
        double kdvli=a+kdv;
        double kdvsiz=a;

        System.out.println("Ürünün normal fiyatı:"+kdvsiz);
        System.out.println("Ürünün %18lik KDV oranı sonucu KDV tutarı:"+kdv);
        System.out.println("Ürünğn KDV li tutarı:"+kdvli);
    }
}
