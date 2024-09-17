/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjekUAS;

/**
 *
 * @author Yuu
 */
public class KembaliData {
    public String Kang,Nang, Kbuku, Jbuku, Penerbit, Pengarang,Tanggalpin ;
    public int Kpinjam, TTerbit;
    
    public KembaliData(){}
    
    public KembaliData(int Kpinjam, String Kang, String Nang,String Kbuku, String Jbuku, String Penerbit,String Pengarang, int TTerbit,String Tanggalpin) {
        this.Kpinjam = Kpinjam;
        this.Kang = Kang;
        this.Nang = Nang; 
        this.Kbuku = Kbuku;
        this.Jbuku = Jbuku;
        this.Penerbit = Penerbit;
        this.Pengarang = Pengarang;
        this.TTerbit = TTerbit;
        this.Tanggalpin = Tanggalpin;
        

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
    public String getPenerbit() {
        return Penerbit;
    }
    public String getPengarang() {
        return Pengarang;
    }
    public int getTTerbit() {
        return TTerbit;
    }
     public String getTanggalpin() {
        return Tanggalpin;
    }
}
  

