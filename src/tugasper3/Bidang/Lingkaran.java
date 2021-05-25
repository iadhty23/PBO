/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasper3.Bidang;

/**
 *
 * @author Ilhamadhty
 */
public class Lingkaran implements MenghitungBidang{
      
    public int jarijari;
    
   public Lingkaran(int jarijari){

        this.jarijari = jarijari;
    }
    
    @Override
    public double Luas(){
        return Math.PI*jarijari*jarijari;
    }
    
    @Override
    public double Keliling(){
        return Math.PI*2*jarijari;
    }
}
