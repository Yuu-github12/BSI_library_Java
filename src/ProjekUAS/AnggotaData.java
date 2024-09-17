/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjekUAS;

/**
 *
 * @author Yuu
 */
public class AnggotaData {
    public String ID, NamaA,Kelas,Gender ,Alamat,NHP, Email;
    
    public AnggotaData(){}
    
    public AnggotaData(String ID, String NamaA, String Kelas,String Gender, String Alamat,String NHP, String Email) {
        this.ID = ID;
        this.NamaA = NamaA;
        this.Kelas = Kelas;
        this.Gender = Gender;
        this.Alamat = Alamat;
        this.NHP = NHP;
        this.Email = Email;
    }

    public String getID() {
        return ID;
    }
    public String getNamaA() {
        return NamaA;
    }
    public String getKelas() {
        return Kelas;
    }
    public String getGender() {
        return Gender;
    }
    public String getAlamat() {
        return Alamat;
    }
    public String getNHP() {
        return NHP;
    }
    public String getEmail() {
        return Email;
    }
}
