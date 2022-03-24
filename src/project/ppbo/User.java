/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package project.ppbo;

public class User {
    private int tinggi, berat, usia;
    private String gender;
    private float kalori, kalPagi, kalSiang, KalMalam;
    
    public User(int tinggi, int berat, int usia, String gender) {
        this.tinggi = tinggi;
        this.berat = berat;
        this.usia = usia;
        this.gender = gender;
    }
    
    public User() {
        
    }
   
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    public void setBerat(int berat) {
        this.berat = berat;
    }
    
    public void setUsia(int usia) {
        this.usia = usia;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void setKalori(float kalori) {
        this.kalori = kalori;
    }
    
    public int getTinggi() {
        return this.tinggi;
    }
    
    public int getBerat() {
        return this.berat;
    }
    
    public int getUsia() {
        return this.usia;
    }
    
    public String getGender() {
        return this.gender;
    }
    
    public float getKalori() {
        return this.kalori;
    }
}
