/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package project.ppbo;

public class KebutuhanKalori {
    private int tinggi, berat, usia;
    private String gender;
    
    public KebutuhanKalori(int tinggi, int berat, int usia, String gender) {
        this.tinggi = tinggi;
        this.berat = berat;
        this.usia = usia;
        this.gender = gender;
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
    
    public float hitungKalori() {
        float kebutuhankal = 0;
                
        if ("L".equals(this.gender)) {
            kebutuhankal = (float) ((88.4 + 13.4 * this.berat) + (4.8 * this.tinggi) - (5.68 * this.usia));
        } else if ("P".equals(this.gender)) {
            kebutuhankal = (float) ((4447.6 + 9.25 * this.berat) + (3.1 * this.tinggi) - (4.33 * this.usia));
        }
        
        return kebutuhankal;
    }
    
    public float hitungKalori(int tinggi, int berat, int usia, String gender) {
        float kebutuhankal = 0;
                
        if ("L".equals(gender)) {
            kebutuhankal = (float) ((88.4 + 13.4 * berat) + (4.8 * tinggi) - (5.68 * usia));
        } else if ("P".equals(gender)) {
            kebutuhankal = (float) ((4447.6 + 9.25 * berat) + (3.1 * tinggi) - (4.33 * usia));
        }
        
        return kebutuhankal;
    }
}
