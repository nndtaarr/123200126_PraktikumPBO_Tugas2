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
public class Tabung extends Lingkaran implements MenghitungRuang{
    private double t;

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }
    
    public Tabung (double r,double t) {
        super(r);
        this.t = t;
    }
    
    @Override
    public double Volume() {
        return PHI * (super.getR()*super.getR())*t;
    }

    @Override
    public double luasPermukaan() {
        return 2 * (PHI* super.getR()) * (super.getR() + t);
    }  
}
