/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package project.ppbo;

abstract class Makanan {
    protected static String mk[];
    protected static float kalMk[];
    
    protected static String lauk[];
    protected static float kalL[];
    
    protected static String buah[];
    protected static float kalB[];
    
    protected static String minuman[];
    protected static float kalM[];
    
    protected static String sayur[];
    protected static float kalS[];
}

class Pagi extends Makanan {
    //constructor
    Pagi() {
        Pagi.mk = new String[]{"Roti", "Bubur", "Sereal", "Mie"};
        Pagi.kalMk = new float[]{264.4f , 49.7f , 379.1f , 138.1f};
        
        Pagi.buah = new String[]{"Alpukat", "Pisang", "Apel", "Melon"};
        Pagi.kalB = new float[]{160.1f , 88.7f , 52.1f , 33.7f};
        
        Pagi.minuman = new String[]{"Susu", "Kopi", "Teh", "Yogurt"};
        Pagi.kalM = new float[]{42.3f , 0.5f , 35.1f , 55.8f};

    }
}

class Siang extends Makanan {
    //constructor
    Siang() {
        Siang.mk = new String[]{"Nasi", "Mie",  "Kentang"};
        Siang.kalMk = new float[]{130f , 138.1f , 76.7f};
        
        Siang.lauk = new String[]{"Ayam", "Daging",  "Tempe", "Tahu", "Ikan", "Telur"};
        Siang.kalL = new float[]{239f , 250.5f , 192.9f, 76f, 205.8f, 155.1f};
        
        Siang.buah = new String[]{"Semangka", "Mangga",  "Jeruk", "Melon"};
        Siang.kalB = new float[]{30.4f , 59.8f , 47.1f, 33.7f};
        
        Siang.minuman = new String[]{"Es Jeruk", "Jeruk Hangat",  "Es Teh", "Air Kelapa"};
        Siang.kalM = new float[]{112f , 47f , 35.1f, 18.9f};
        
        Siang.sayur = new String[]{"Bayam", "Kangkung",  "Sawi", "Pakcoy"};
        Siang.kalS = new float[]{23f , 18.9f , 66.4f, 13.1f};
    }
}

class Malam extends Makanan {
    //constructor
    Malam() {
        Malam.mk = new String[]{"Nasi", "Mie",  "Roti"};
        Malam.kalMk = new float[]{130f , 138.1f , 264.4f};
        
        Malam.lauk = new String[]{"Ayam", "Ikan",  "Telur"};
        Malam.kalL = new float[]{239f , 205.8f , 155.1f};
        
        Malam.minuman = new String[]{"Teh", "Kopi",  "Susu"};
        Malam.kalM = new float[]{35.1f , 0.5f , 42.3f};
    }
}