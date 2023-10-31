import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
         //Değişenleri oluştur
         int mat, fizik, kimya, turkce, tarih, muzik;

         //Scanner sınıfını atayalım
         Scanner inp = new Scanner(System.in);

         //Kullanıcıdan değerleri al
         System.out.print("Matematik Notu: ");
         mat = inp.nextInt();

         System.out.print("Fizik Notu: ");
         fizik = inp.nextInt();

         System.out.print("Kimya Notu: ");
         kimya = inp.nextInt();

         System.out.print("Türkçe Notu: ");
         turkce = inp.nextInt();

         System.out.print("Tarih Notu: ");
         tarih = inp.nextInt();

         System.out.print("Müzik Notu: ");
         muzik = inp.nextInt();

         int toplam =(mat+fizik+kimya+turkce+tarih+muzik);
         double sonuc= toplam/6;
         boolean netice = sonuc >=60;
         System.out.println(sonuc);
         System.out.println(netice);

     }
}

