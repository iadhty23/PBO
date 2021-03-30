/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1;
import java.util.Scanner;
/**
 *
 * @author Ilhamadhty
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        String nim;
        int usia;
        int uts, uas;
        int pilih;
        
        System.out.println("Input Data===");
        System.out.print("Nama : "); 
        nama  = input.nextLine();
        System.out.print("NIM : "); 
        nim  = input.nextLine();
        System.out.print("Usia : ");
        usia  = input.nextInt();
        System.out.print("UTS : "); 
        uts  = input.nextInt();
        System.out.print("UAS : "); 
        uas  = input.nextInt();
        
        Mahasiswa mahasiswa = new Mahasiswa(nama,nim,usia,uts,uas);
        do {
            System.out.println("===Opsi===");
            System.out.println("1. Tampilkan Data");
            System.out.println("2. Tambah Data");
            System.out.println("3. Exit");
            System.out.print("Pilih : "); 
            pilih = input.nextInt();
            if (pilih==1) 
            {
                System.out.println("\nPerkenalkan nama saya " + mahasiswa.nama + " NIM " + mahasiswa.nim);
                System.out.println("Usia : " + mahasiswa.usia);
                System.out.println("Nilai Akhir : " + mahasiswa.nilaiakhir());
            }
            else if (pilih==2) {
                input = new Scanner(System.in);
                System.out.println("\n\n----- Input Data -----");
                System.out.print("Nama : "); 
                mahasiswa.nama = input.nextLine();
                System.out.print("NIM : "); 
                mahasiswa.nim = input.nextLine();
                System.out.print("Usia : "); 
                mahasiswa.usia = input.nextInt();
                System.out.print("UTS : "); 
                mahasiswa.uts = input.nextInt();
                System.out.print("UAS : "); 
                mahasiswa.uas = input.nextInt();
            }
        } while (pilih!=3);
    }
}
