/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package project.ppbo;

public class User {
    private int tinggi, berat, usia;
    private String gender;
    private float kalori, kalPagi, kalSiang, kalMalam;
    private MakananPagi pagi;
    private MakananSiang siang;
    private MakananMalam malam;
    
    public User(int tinggi, int berat, int usia, String gender) {
        this.tinggi = tinggi;
        this.berat = berat;
        this.usia = usia;
        this.gender = gender;
        this.kalPagi = 0f;
        this.kalSiang = 0f;
        this.kalMalam = 0f;
        this.kalori = 0f;
        this.pagi = new MakananPagi();
        this.siang = new MakananSiang();
        this.malam = new MakananMalam();
    }
    
    public User() {
        this.kalPagi = 0f;
        this.kalSiang = 0f;
        this.kalMalam = 0f;
        this.kalori = 0f;
        this.pagi = new MakananPagi();
        this.siang = new MakananSiang();
        this.malam = new MakananMalam();
    }
   
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    public void setTinggi(double tinggi) {
        this.tinggi = (int)tinggi;
    }
    
    public void setBerat(int berat) {
        this.berat = berat;
    }
    
    public void setBerat(double berat) {
        this.berat = (int)berat;
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
    
    public void setKalori(int kalori) {
        this.kalori = (float)kalori;
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

    public float getKalPagi() {
        return kalPagi;
    }

    public void setKalPagi(float kalPagi) {
        this.kalPagi = kalPagi;
    }

    public float getKalSiang() {
        return kalSiang;
    }

    public void setKalSiang(float kalSiang) {
        this.kalSiang = kalSiang;
    }

    public float getKalMalam() {
        return kalMalam;
    }

    public void setKalMalam(float KalMalam) {
        this.kalMalam = KalMalam;
    }

    public MakananPagi getPagi() {
        return pagi;
    }

    public void setPagi(MakananPagi pagi) {
        this.pagi = pagi;
    }

    public MakananSiang getSiang() {
        return siang;
    }

    public void setSiang(MakananSiang siang) {
        this.siang = siang;
    }

    public MakananMalam getMalam() {
        return malam;
    }

    public void setMalam(MakananMalam malam) {
        this.malam = malam;
    }
}
