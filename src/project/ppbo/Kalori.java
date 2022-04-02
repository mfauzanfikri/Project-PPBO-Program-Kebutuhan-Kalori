/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package project.ppbo;

public class Kalori {
    public static void hitungKalori(User user) {
        float kebutuhankal = 0;
                
        if ("L".equals(user.getGender())) {
            kebutuhankal = (float) (66.5 + (13.7 * user.getBerat()) + (5 * user.getTinggi()) - (6.8 * user.getUsia()));
        } else if ("P".equals(user.getGender())) {
            kebutuhankal = (float) (655 + (9.6 * user.getBerat()) + (1.8 * user.getTinggi()) - (4.7 * user.getUsia()));
        }
        
        user.setKalori(kebutuhankal);
    }
     
    public static void bagiKalori(User user) { 
        if(user.getKalori() == 0f) {
            return;
        }
        
        user.setKalPagi(user.getKalori() / 4);
        user.setKalSiang(user.getKalori() / 2);
        user.setKalMalam(user.getKalori() / 4);
    }
    
    public static void kalPagi(User user) {
        float kalPagi = user.getKalPagi();
        float[] floatArr;
        
        //mp
        float kalMp = kalPagi / 100 * 70;
        user.getPagi().setKalMp(kalMp);
        floatArr = new float[MakananPagi.mpS.length];
        float[] kalMpS = MakananPagi.kalMpS;
        for (int i = 0; i < MakananPagi.mpS.length; i++) {
            floatArr[i] = 100 * kalMp / kalMpS[i];
        } 
        user.getPagi().setGramMp(floatArr);
        
        //buah
        float kalB = kalPagi / 100 * 20;
        user.getPagi().setKalB(kalB);
        floatArr = new float[MakananPagi.buahS.length];
        float[] kalBS = MakananPagi.kalBS;
        for (int i = 0; i < MakananPagi.buahS.length; i++) {
            floatArr[i] = 100 * kalB / kalBS[i];
        } 
        user.getPagi().setGramB(floatArr);
    }
}
