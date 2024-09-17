/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjekUAS;

/**
 *
 * @author Yuu
 */
public class DataBuku {
    public String KBuku, JBuku,Penerbit,Pengarang ;
    public int TTerbit;
    
    public DataBuku(){}
    
    public DataBuku(String KBuku, String JBuku, String Penerbit,String Pengarang, int TTerbit) {
        this.KBuku = KBuku;
        this.JBuku = JBuku;
        this.Penerbit = Penerbit;
        this.Pengarang = Pengarang;
        this.TTerbit = TTerbit;
    }

    public String getKBuku() {
        return KBuku;
    }
    public String getJBuku() {
        return JBuku;
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
 
}


