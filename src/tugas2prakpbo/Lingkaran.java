/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2prakpbo;

/**
 *
 * @author Ardya
 */
public class Lingkaran implements MenghitungBidang {
    private double r;

    public double getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public Lingkaran(double r) {
        this.r = r;
    }
    
      public double getD(){
        return 2*r;
    }
    
    @Override
    public double Luas() {
        return PHI * (r*r);
    }

    @Override
    public double Keliling() {
        return PHI * (2*r);
    }
}