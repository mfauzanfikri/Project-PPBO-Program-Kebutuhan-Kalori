/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package project.ppbo;

/**
 *
 * @author Fauzan
 */
abstract class Makanan {
    protected String jenis[];
    protected float kalori[];
}

class MakananPokok extends Makanan {    
    //constructor
    MakananPokok() {
        this.jenis = new String[]{"Nasi", "Keripik Singkong", "Ubi Rebus", "Jagung Bakar", "Kentang Goreng"};
        this.kalori = new float[]{130f,  485f, 100f, 435.9f, 311.9f};
    }
}

class Buah extends Makanan {
    //constractor
    Buah() {
        this.jenis = new String[]{"Pisang", "Mangga", "Semangka", "Apel", "Kiwi"};
        this.kalori = new float[]{88.7f , 59.8f , 30.8f , 52.1f, 60.9f};
    }
}

class Lauk extends Makanan {
    //constractor
    Lauk() {
        this.jenis = new String[]{"Ayam", "Ikan", "Telur", "Rendang", "Perkedel"};
        this.kalori = new float[]{245.6f , 127f , 155.1f , 193f, 143f};
    }
}

class Minuman extends Makanan {
    //constractor
    Minuman() {
        this.jenis = new String[]{"Air Putih", "Susu", "Air Kelapa", "Teh Manis", "Es Jeruk"};
        this.kalori = new float[]{0f , 42.3f , 18.9f , 35.1f, 20f};
    }
}

class Sayur extends Makanan {
    //constractor
    public Sayur() {
        this.jenis = new String[]{"Sayur Bening", "Sayur Asem", "Sayur Sup", "Tumis Kangkung", "Sawi"};
        this.kalori = new float[]{36f , 9f , 30f , 98f, 42f};

    }
}