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
    
    public void printInfo() {
        System.out.println("Class Makanan.");
    }
}

class MakananPagi extends Makanan {
    public static String[] mpS = {"Roti", "Bubur", "Sereal", "Mie"};
    public static String[] buahS = {"Alpukat", "Pisang", "Apel", "Melon"};
    public static String[] minumanS = {"Susu", "Kopi", "Teh", "Yogurt"};
    public static float[] kalMpS = {264.4f , 49.7f , 379.1f , 138.1f};
    public static float[] kalBS = {160.1f , 88.7f , 52.1f , 33.7f};
    public static float[] kalMS = {42.3f , 0.5f , 35.1f , 55.8f};
    
    @Override
    public void printInfo() {
        System.out.println("Class Makanan Pagi.");
    }
}

class MakananSiang extends Makanan {
    public static String[] mpS = {"Nasi", "Mie",  "Kentang"};
    public static String[] laukS = {"Ayam", "Daging",  "TempSe", "Tahu", "Ikan", "Telur"};
    public static String[] buahS = {"Semangka", "Mangga",  "Jeruk", "Melon"};
    public static String[] minumanS = {"Es Jeruk", "Jeruk Hangat",  "Es Teh", "Air Kelapa"};
    public static String[] sayurS = {"Bayam", "Kangkung",  "Sawi", "Pakcoy"};
    public static float[] kalMpS = {130f , 138.1f , 76.7f};
    public static float[] kalLS = {239f , 250.5f , 192.9f, 76f, 205.8f, 155.1f};
    public static float[] kalBS = {30.4f , 59.8f , 47.1f, 33.7f};
    public static float[] kalMS = {112f , 47f , 35.1f, 18.9f};
    public static float[] kalSS = {23f , 18.9f , 66.4f, 13.1f};
    
    @Override
    public void printInfo() {
        System.out.println("Class Makanan Siang.");
    }
}

class MakananMalam extends Makanan {
    public static String[] mpS = {"Nasi", "Mie",  "Roti"};
    public static String[] laukS = {"Ayam", "Ikan",  "Telur"};
    public static String[] minumanS = {"Teh", "Kopi",  "Susu"};
    public static float[] kalMpS = {130f , 138.1f , 264.4f};
    public static float[] kalLS = {239f , 205.8f , 155.1f};
    public static float[] kalMS = {35.1f , 0.5f , 42.3f};
    
    @Override
    public void printInfo() {
        System.out.println("Class Makanan Malam.");
    }
}