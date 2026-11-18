package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sayi giriniz(Programi bitirmek icin 0 yazin)");
        int sayi = input.nextInt();
        boolean flag = true;
        int toplam = 0;
        float aritmetik = 0;
        float pozaritmetik = 0;
        int pozitif = 0;
        int negatif = 0;
        int tek = 0;
        int cift = 0;
        int enbuyuk = sayi;
        int enkucuk = sayi;
        int asal = 0;
        if (sayi == 0) {
            System.out.println("Ilk basta 0 girdin ben kabul etmiyorum");
        } else {
            while (flag == true) {
                if (sayi < 0) {
                    negatif++;
                } else {
                    pozitif++;
                    pozaritmetik = pozaritmetik + sayi;

                }
                if (sayi % 2 == 0) {
                    cift++;
                } else {
                    tek++;
                }
                if (sayi > enbuyuk) {
                    enbuyuk = sayi;
                } else {

                }
                if (sayi < enkucuk) {
                    enkucuk = sayi;
                }
                toplam = toplam + sayi;
                aritmetik = aritmetik + sayi;


                int i = 2;
                boolean a = true;
                if (sayi == 2) {
                    System.out.println("Sayi asaldir");
                    asal++;
                } else {
                    while (i < sayi) {
                        if (sayi % i == 0) {
                            a = false;
                            i++;
                        } else {

                            i++;
                        }
                    }
                    if (a == false) {
                        System.out.println("Sayi asal degildir");
                    } else {
                        System.out.println("Sayi asaldir");
                        asal++;
                    }














                    int mukemmeltoplam = 0;
                    int i3 = 1;
                    while (i3 < sayi){
                        if (sayi%i3 == 0){
                            mukemmeltoplam = mukemmeltoplam + i3;
                            i3++;
                        }else{
                            i3++;
                        }
                    }if(mukemmeltoplam == sayi){
                        System.out.println("Sayi mukemmeldir");
                    }else {
                        System.out.println("Sayi mukemmel degildir");
                    }
                }
                int basamak = 1;
                while (sayi >= 10) {
                    sayi = sayi / 10;
                    basamak++;
                }








                    System.out.println("Girdiginiz sayi " + basamak + " basamaklidir");
                    int yokedicikutsalint = sayi;
                    System.out.println(" Yeni sayi girin");
                    sayi = input.nextInt();
                    if (sayi == 0) {
                        flag = false;
                    } else {

                    }

                }
                float aritmetikgercek = aritmetik / (negatif + pozitif);
                float pozaritmetikgercek = pozaritmetik / pozitif;
                int fark = enbuyuk - enkucuk;
                System.out.println("Pozitif sayi sayisi " + pozitif);
                System.out.println("Negatif sayi sayisi " + negatif);
                System.out.println("Tek sayi sayisi " + tek);
                System.out.println("Cift sayi sayisi " + cift);
                System.out.println("En buyuk sayi " + enbuyuk);
                System.out.println("En kucuk sayi " + enkucuk);
                System.out.println("SAyilarin toplami " + toplam);
                System.out.println("Sayilarin aritmetigi " + aritmetikgercek);
                System.out.println("Pozitif sayilain aritmetigi " + pozaritmetikgercek);
                System.out.println("Asal sayi sayisi " + asal);
                System.out.println("En buyuk ve en kucuk sayilar arassindaki fark " + fark);


            }

        }
    }
