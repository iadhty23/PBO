/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasper3.Ruang;

import tugasper3.Bidang.Lingkaran;
/**
 *
 * @author Ilhamadhty
 */
public class Kerucut extends Lingkaran implements MenghitungRuang {
   int tinggi;
    
  public Kerucut(int tinggi, int jarijari){
        super(jarijari);
        this.tinggi = tinggi;
    }
        @Override   
        public double Volume(){
        return Math.PI*jarijari*jarijari*tinggi/3;
    }
    
    
        @Override
        public double Luaspermukaan(){
        float s;
        s = (float) Math.sqrt(jarijari*jarijari+tinggi*tinggi);
        return Math.PI*jarijari*(jarijari+s);
    }
}
