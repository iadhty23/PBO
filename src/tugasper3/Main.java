/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasper3;

import java.util.Scanner;
import tugasper3.Bidang.Lingkaran;
import tugasper3.Bidang.PersegiPanjang;
import tugasper3.Ruang.Balok;
import tugasper3.Ruang.Kerucut;
/**
 *
 * @author Ilhamadhty
 */
public class Main {
 public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int panjang, lebar, tinggi, jarijari;
        int pilih;
                                         
        do {
            
            System.out.println("\n\n----- INPUT -----");
            System.out.println("1. Balok");
            System.out.println("2. Kerucut");
            System.out.println("3. Exit");
            System.out.print("Pilih : "); pilih = input.nextInt();
            
            if (pilih==1) {
                
                System.out.print("Panjang\t\t: "); panjang = input.nextInt();
                System.out.print("Lebar\t\t: "); lebar = input.nextInt();
                System.out.print("Tinggi\t\t: "); tinggi = input.nextInt();
                
                PersegiPanjang persegipanjang = new PersegiPanjang(panjang,lebar);
                Balok balok = new Balok(panjang,lebar,tinggi);
                
                System.out.println("\n----- OUTPUT -----");                
                System.out.println("Luas Persegi\t\t: " + persegipanjang.Luas());
                System.out.println("Keliling Persegi\t: " + persegipanjang.Keliling());
                System.out.println("Volume Balok\t\t: " + balok.Volume());
                System.out.println("Luas Permukaan Balok\t: " + balok.Luaspermukaan());
            }
            
            else if (pilih==2) {
                input = new Scanner(System.in);
                System.out.print("Jari-jari\t: "); jarijari = input.nextInt();
                System.out.print("Tinggi\t\t: "); tinggi = input.nextInt();
                
                Kerucut kerucut = new Kerucut(tinggi,jarijari);
                Lingkaran lingkaran = new Lingkaran(jarijari);
                
                System.out.println("\n----- OUTPUT -----");
                System.out.println("Luas Lingkaran\t\t: " + lingkaran.Luas());
                System.out.println("Keliling Lingkaran\t: " + lingkaran.Keliling());
                System.out.println("Volume Kerucut\t\t: " + kerucut.Volume());
                System.out.println("Luas Permukaan Kerucut\t: " + kerucut.Luaspermukaan());
            }
            
        } while (pilih!=3);
    }
}
