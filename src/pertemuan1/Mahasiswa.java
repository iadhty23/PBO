/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1;

/**
 *
 * @author Ilhamadhty
 */
public class Mahasiswa {


      String nama;
        String nim;
        int usia;
        int uts, uas;
        int pilih;
            
    Mahasiswa(String nama, String nim, Integer usia, Integer uts, Integer uas)
        {
            this.nama   = nama;
            this.nim    = nim;
            this.usia   = usia;
            this.uts    = uts;
            this.uas    = uas;
        }
    int nilaiakhir()
    {
        int nilaiakhir;
        nilaiakhir = (uts+uas)/2;
        return nilaiakhir;
    }
}