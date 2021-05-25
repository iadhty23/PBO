/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasper3.Ruang;

import tugasper3.Bidang.PersegiPanjang;
/**
 *
 * @author Ilhamadhty
 */
public class Balok extends PersegiPanjang implements MenghitungRuang{

    int tinggi;
    
    public Balok(int panjang, int lebar, int tinggi){
        
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
        @Override
        public double Volume(){
        double volumebalok;
        volumebalok = panjang*lebar*tinggi;
        return volumebalok;
    }
    
        @Override
        public double Luaspermukaan(){
        double luaspermukaanbalok;
        luaspermukaanbalok = (2*panjang*lebar)+(2*panjang*tinggi)+(2*lebar*tinggi);
        return luaspermukaanbalok;
    }
    
    
}
