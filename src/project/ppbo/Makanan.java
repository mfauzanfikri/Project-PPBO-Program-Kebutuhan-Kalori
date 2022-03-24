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
        Pagi.mk = new String[]{};
        Pagi.kalMk = new float[]{};
        
        Pagi.lauk = new String[]{};
        Pagi.kalL = new float[]{};
        
        Pagi.buah = new String[]{};
        Pagi.kalB = new float[]{};
        
        Pagi.minuman = new String[]{};
        Pagi.kalM = new float[]{};
        
        Pagi.sayur = new String[]{};
        Pagi.kalS = new float[]{};
    }
}

class Siang extends Makanan {
    //constructor
    Siang() {
        Siang.mk = new String[]{};
        Siang.kalMk = new float[]{};
        
        Siang.lauk = new String[]{};
        Siang.kalL = new float[]{};
        
        Siang.buah = new String[]{};
        Siang.kalB = new float[]{};
        
        Siang.minuman = new String[]{};
        Siang.kalM = new float[]{};
        
        Siang.sayur = new String[]{};
        Siang.kalS = new float[]{};
    }
}

class Malam extends Makanan {
    //constructor
    Malam() {
        Malam.mk = new String[]{};
        Malam.kalMk = new float[]{};
        
        Malam.lauk = new String[]{};
        Malam.kalL = new float[]{};
        
        Malam.buah = new String[]{};
        Malam.kalB = new float[]{};
        
        Malam.minuman = new String[]{};
        Malam.kalM = new float[]{};
        
        Malam.sayur = new String[]{};
        Malam.kalS = new float[]{};
    }
}