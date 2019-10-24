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
public class IF0110118025Latihan63Gradien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koordinat k1 = new Koordinat(2, 10, 5, 7);
        Koordinat k2 = new Koordinat(5, 1, 3, 12);
        
        System.out.println("===Gradien Garis Lurus===\n");
        System.out.printf("Garis yang melalui titik (%d,%d) dan (%d,%d)%nmemiliki gradien sebesar %d%n", k1.getX1(),k1.getY1(),k1.getX2(),k1.getY2(), k1.hitungGradien());
        System.out.printf("Garis yang melalui titik (%d,%d) dan (%d,%d)%nmemiliki gradien sebesar %d%n%n", k2.getX1(),k2.getY1(),k2.getX2(),k2.getY2(), k2.hitungGradien());
    }
    
}
