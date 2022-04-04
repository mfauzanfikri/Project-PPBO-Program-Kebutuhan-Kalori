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
        if(kalPagi == 0) return;
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
    
    public static void kalSiang(User user) {
        float kalSiang = user.getKalSiang();
        if(kalSiang == 0) return;
        float[] floatArr;
        
        //mp
        float kalMp = kalSiang / 100 * 30;
        user.getSiang().setKalMp(kalMp);
        floatArr = new float[MakananSiang.mpS.length];
        float[] kalMpS = MakananSiang.kalMpS;
        for (int i = 0; i < MakananSiang.mpS.length; i++) {
            floatArr[i] = 100 * kalMp / kalMpS[i];
        } 
        user.getSiang().setGramMp(floatArr);
        
        //Lauk-Pauk
        float kalL = kalSiang / 100 * 30;
        user.getSiang().setKalL(kalL);
        floatArr = new float[MakananSiang.laukS.length];
        float[] kalLS = MakananSiang.kalLS;
        for (int i = 0; i < MakananSiang.laukS.length; i++) {
            floatArr[i] = 100 * kalL / kalLS[i];
        } 
        user.getSiang().setGramL(floatArr);
        
        
        //buah
        float kalB = kalSiang / 100 * 15;
        user.getSiang().setKalB(kalB);
        floatArr = new float[MakananSiang.buahS.length];
        float[] kalBS = MakananSiang.kalBS;
        for (int i = 0; i < MakananSiang.buahS.length; i++) {
            floatArr[i] = 100 * kalB / kalBS[i];
        } 
        user.getSiang().setGramB(floatArr);
        
        //minuman
        float kalM = kalSiang / 100 * 10;
        user.getSiang().setKalM(kalM);
        floatArr = new float[MakananSiang.minumanS.length];
        float[] kalMS = MakananSiang.kalMS;
        for (int i = 0; i < MakananSiang.minumanS.length; i++) {
            floatArr[i] = 100 * kalM / kalMS[i];
        } 
        user.getSiang().setGramM(floatArr);
        
        //Sayur
        float kalS = kalSiang / 100 * 30;
        user.getSiang().setKalS(kalS);
        floatArr = new float[MakananSiang.sayurS.length];
        float[] kalSS = MakananSiang.kalSS;
        for (int i = 0; i < MakananSiang.sayurS.length; i++) {
            floatArr[i] = 100 * kalS / kalSS[i];
        } 
        user.getSiang().setGramS(floatArr);
        
    }
    
    public static void kalMalam(User user) {
        float kalMalam = user.getKalMalam();
        if(kalMalam == 0) return;
        float[] floatArr;
        
        //mp
        float kalMp = kalMalam / 100 * 60;
        user.getMalam().setKalMp(kalMp);
        floatArr = new float[MakananMalam.mpS.length];
        float[] kalMpS = MakananMalam.kalMpS;
        for (int i = 0; i < MakananMalam.mpS.length; i++) {
            floatArr[i] = 100 * kalMp / kalMpS[i];
        } 
        user.getMalam().setGramMp(floatArr);
        
        //Lauk-Pauk
        float kalL = kalMalam / 100 * 30;
        user.getMalam().setKalL(kalL);
        floatArr = new float[MakananMalam.laukS.length];
        float[] kalLS = MakananMalam.kalLS;
        for (int i = 0; i < MakananMalam.laukS.length; i++) {
            floatArr[i] = 100 * kalL / kalLS[i];
        } 
        user.getMalam().setGramL(floatArr);
        
        //minuman
        float kalM = kalMalam / 100 * 10;
        user.getMalam().setKalM(kalM);
        floatArr = new float[MakananMalam.minumanS.length];
        float[] kalMS = MakananMalam.kalMS;
        for (int i = 0; i < MakananMalam.minumanS.length; i++) {
            floatArr[i] = 100 * kalM / kalMS[i];
        } 
        user.getMalam().setGramM(floatArr);
    }
}
