/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package project.ppbo;

/**
 *
 * @author Fauzan
 */
public class KebutuhanKalori {
    private static int tinggi, berat, usia;
    private static String gender;
    
    public KebutuhanKalori(int tinggi, int berat, int usia, String gender) {
        KebutuhanKalori.tinggi = tinggi;
        KebutuhanKalori.berat = berat;
        KebutuhanKalori.usia = usia;
        KebutuhanKalori.gender = gender;
    }
   
    public float hitungKalori() {
        float kebutuhankal = 0;
                
        if ("L".equals(gender)) {
            kebutuhankal = (float) ((88.4 + 13.4 * berat) + (4.8 * tinggi) - (5.68 * usia));
        } else if ("P".equals(gender)) {
            kebutuhankal = (float) ((4447.6 + 9.25 * berat) + (3.1 * tinggi) - (4.33 * usia));
        }
        
        return kebutuhankal;
    }
}
