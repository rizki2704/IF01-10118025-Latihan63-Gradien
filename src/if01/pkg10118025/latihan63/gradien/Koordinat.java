/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan63.gradien;

/**
 * Nama     : Rizki Restu Illahi
 * Kelas    : IF01
 * NIM      : 10118025
 */
public class Koordinat implements GarisLurus{
    
    private final int x1;
    private final int y1;
    private final int x2;
    private final int y2;

    public Koordinat(int x1,int y1, int x2, int y2){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }
    
    @Override
    public int hitungGradien() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return (y2-y1)/(x2-x1);
    }
    
}
