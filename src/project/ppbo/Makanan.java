/*
 * Click nbfs://nbhost/SystemFileSystem/TempSlates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/TempSlates/Classes/Class.java to edit this tempSlate
 */

package project.ppbo;

class Makanan {
    private String[] mp, lauk, buah, minuman, sayur;
    private float kalMp, kalL, kalB, kalM, kalS;
    private float[] gramMp, gramL, gramB, gramM, gramS;

    protected String[] getMp() {
        return mp;
    }

    protected void setMp(String[] mp) {
        this.mp = mp;
    }

    protected String[] getLauk() {
        return lauk;
    }

    protected void setLauk(String[] lauk) {
        this.lauk = lauk;
    }

    protected String[] getBuah() {
        return buah;
    }

    protected void setBuah(String[] buah) {
        this.buah = buah;
    }

    protected String[] getSayur() {
        return sayur;
    }

    protected void setSayur(String[] sayur) {
        this.sayur = sayur;
    }

    protected String[] getMinuman() {
        return minuman;
    }

    protected void setMinuman(String[] minuman) {
        this.minuman = minuman;
    }

    protected float getKalMp() {
        return kalMp;
    }

    protected void setKalMp(float kalMp) {
        this.kalMp = kalMp;
    }

    protected float getKalL() {
        return kalL;
    }

    protected void setKalL(float kalL) {
        this.kalL = kalL;
    }

    protected float getKalB() {
        return kalB;
    }

    protected void setKalB(float kalB) {
        this.kalB = kalB;
    }

    protected float getKalM() {
        return kalM;
    }

    protected void setKalM(float kalM) {
        this.kalM = kalM;
    }

    protected float getKalS() {
        return kalS;
    }

    protected void setKalS(float kalS) {
        this.kalS = kalS;
    }

    protected float[] getGramMp() {
        return gramMp;
    }

    protected void setGramMp(float[] gramMp) {
        this.gramMp = gramMp;
    }

    protected float[] getGramL() {
        return gramL;
    }

    protected void setGramL(float[] gramL) {
        this.gramL = gramL;
    }

    protected float[] getGramB() {
        return gramB;
    }

    protected void setGramB(float[] gramB) {
        this.gramB = gramB;
    }

    protected float[] getGramM() {
        return gramM;
    }

    protected void setGramM(float[] gramM) {
        this.gramM = gramM;
    }

    protected float[] getGramS() {
        return gramS;
    }

    protected void setGramS(float[] gramS) {
        this.gramS = gramS;
    }
}

class MakananPagi extends Makanan {
    public static String[] mpS, buahS, minumanS;
    public static float[] kalMpS, kalLS, kalBS, kalMS, kalSS;
    
    //constructor
    MakananPagi() {
        MakananPagi.mpS = new String[]{"Roti", "Bubur", "Sereal", "Mie"};
        MakananPagi.kalMpS = new float[]{264.4f , 49.7f , 379.1f , 138.1f};
        
        MakananPagi.buahS = new String[]{"Alpukat", "Pisang", "Apel", "Melon"};
        MakananPagi.kalBS = new float[]{160.1f , 88.7f , 52.1f , 33.7f};
        
        MakananPagi.minumanS = new String[]{"Susu", "Kopi", "Teh", "Yogurt"};
        MakananPagi.kalMS = new float[]{42.3f , 0.5f , 35.1f , 55.8f};

    }
}

class MakananSiang extends Makanan {
    public static String[] mpS, laukS, buahS, minumanS, sayurS;
    public static float[] kalMpS, kalLS, kalBS, kalMS, kalSS;
    
    //constructor
    MakananSiang() {
        MakananSiang.mpS = new String[]{"Nasi", "Mie",  "Kentang"};
        MakananSiang.kalMpS = new float[]{130f , 138.1f , 76.7f};
        
        MakananSiang.laukS = new String[]{"Ayam", "Daging",  "TempSe", "Tahu", "Ikan", "Telur"};
        MakananSiang.kalLS = new float[]{239f , 250.5f , 192.9f, 76f, 205.8f, 155.1f};
        
        MakananSiang.buahS = new String[]{"Semangka", "Mangga",  "Jeruk", "Melon"};
        MakananSiang.kalBS = new float[]{30.4f , 59.8f , 47.1f, 33.7f};
        
        MakananSiang.minumanS = new String[]{"Es Jeruk", "Jeruk Hangat",  "Es Teh", "Air Kelapa"};
        MakananSiang.kalMS = new float[]{112f , 47f , 35.1f, 18.9f};
        
        MakananSiang.sayurS = new String[]{"Bayam", "Kangkung",  "Sawi", "Pakcoy"};
        MakananSiang.kalSS = new float[]{23f , 18.9f , 66.4f, 13.1f};
    }
}

class MakananMalam extends Makanan {
    public static String[] mpS, laukS, minumanS;
    public static float[] kalMpS, kalLS, kalBS, kalMS, kalSS;
    
    //constructor
    MakananMalam() {
        MakananMalam.mpS = new String[]{"Nasi", "Mie",  "Roti"};
        MakananMalam.kalMpS = new float[]{130f , 138.1f , 264.4f};
        
        MakananMalam.laukS = new String[]{"Ayam", "Ikan",  "Telur"};
        MakananMalam.kalLS = new float[]{239f , 205.8f , 155.1f};
        
        MakananMalam.minumanS = new String[]{"Teh", "Kopi",  "Susu"};
        MakananMalam.kalMS = new float[]{35.1f , 0.5f , 42.3f};
    }
}