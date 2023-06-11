import java.util.Scanner;
public class KdvHesaplamaProgrami {
    public static void main(String[] args) {
        // Değişkenleri oluşturuyoruz.
        double  tutar, kdv, kdvliTutar , kdvOrani = 18 ;

        // Scanner sınıfımızı tanımlıyoruz.
        Scanner giris = new Scanner(System.in);

        // Tutarı kullanıcıdan alıyoruz.
        System.out.print(" Kdv'siz Tutarı Girinis : ");
        tutar = giris.nextDouble();

        // Kdv ve Kdv li tutar hesaplamaları yapıyoru<.
        kdv = (tutar / 100.00) * 18;
        kdvliTutar = kdv + tutar;

        // Ekrana yazdırma işlemleri yapıyoruz.
        System.out.print(" Kdv'siz Fiyat : ");
        System.out.println(tutar);
        System.out.println(" Kdv oranı : %18 ");
        System.out.print(" Kdv : ");
        System.out.println(kdv);
        System.out.print(" Kdv'li Fiyat : ");
        System.out.println(kdvliTutar);
