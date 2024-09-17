/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjekUAS;

/**
 *
 * @author Yuu
 */
public class PinjamData {
    public String Kang,Nang, Kbuku, Jbuku ;
    public int Kpinjam;
    
    public PinjamData(){}
    
    public PinjamData(int Kpinjam, String Kang, String Nang,String Kbuku, String Jbuku) {
        this.Kpinjam = Kpinjam;
        this.Kang = Kang;
        this.Nang = Nang; 
        this.Kbuku = Kbuku;
        this.Jbuku = Jbuku;

    }
    public int getKpinjam () {
        return Kpinjam;
    }
    public String getKang () {
        return Kang;
    }
    public String getNang () {
        return Nang;
    }
    public String getKbuku() {
        return Kbuku;
    }
    public String getJbuku() {
        return Jbuku;
    }
}
