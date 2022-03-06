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
public class Balok extends PersegiPanjang implements MenghitungRuang{
    private double t;

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    public Balok(double t, double p, double l) {
        super(p, l);
        this.t = t;
    }
    
    @Override
    public double Volume() {
        return super.Luas()*t;
    }

    @Override
    public double luasPermukaan() {
        return 2*(super.Luas()+ (super.getL()*t) + (super.getP()*t));
    }
    
}
