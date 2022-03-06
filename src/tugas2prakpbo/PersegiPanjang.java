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
public class PersegiPanjang implements MenghitungBidang{
    private double p, l;

    public double getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public double getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public PersegiPanjang(double p, double l) {
        this.p = p;
        this.l = l;
    }
      @Override
    public double Luas() {
        return p*l;
    }

    @Override
    public double Keliling() {
        return 2*(p+l);
    }
}
