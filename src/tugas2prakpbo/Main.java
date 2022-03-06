/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2prakpbo;
import java.util.Scanner;
/**
 *
 * @author Ardya
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner(System.in);
       int pilih;
       int ulang;
       do{
            System.out.println("==========");
            System.out.println("MENU UTAMA");
            System.out.println("==========");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("0. Exit");
            
            System.out.print("Pilih : ");
            pilih = input.nextInt();
            switch(pilih){
                case 1 :
                    double p,l,t;
                    System.out.print("Input Panjang = ");
                    p = input.nextInt();
                    System.out.print("Input Lebar   = ");
                    l = input.nextInt();
                    System.out.print("Input Tinggi  = ");
                    t = input.nextInt();
                    Balok balok = new Balok(t, p, l);
                    System.out.println("Luas Persegi Panjang        = " + balok.Luas());
                    System.out.println("Keliling Persegi Panjang    = " + balok.Keliling());
                    System.out.println("Volume Balok                = " + balok.Volume());
                    System.out.println("Luas Permukaan Balok        = " + balok.luasPermukaan());
                    System.out.println(" ");
                    break;
                case 2 :
                    double r;
                    System.out.print("Input Tinggi    = ");
                    t = input.nextInt();
                    System.out.print("Input Jari-jari = ");
                    r = input.nextInt();
                    Tabung tabung = new Tabung(r,t);
                    System.out.println("Luas Lingkaran          = " + tabung.Luas());
                    System.out.println("Keliling Lingkaran      = " + tabung.Keliling());
                    System.out.println("Volume Tabung           = " + tabung.Volume());
                    System.out.println("Luas Permukaan Tabung   = " + tabung.luasPermukaan());
                    System.out.println(" ");
                    break;
                case 0 :
                    System.exit(0);
                    break;
                default :
                    System.out.println("Upss !! Opsi tidak ada. Mohon masukkan opsi dengan benar !! ");
                    break;
            }
              System.out.print("Ulangi? (Ya:1 || Tidak: 0)");
              ulang = input.nextInt();
              System.out.println("\n");
       }
       while(ulang==1);
    }
}
