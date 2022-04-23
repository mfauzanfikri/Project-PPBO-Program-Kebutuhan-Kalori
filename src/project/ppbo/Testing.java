/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package project.ppbo;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Fauzan
 */
public class Testing {
    public static void main(String[] args) {
        ArrayList<String> temp1 = new ArrayList<>();
        ArrayList<String> temp2 = new ArrayList<>();
        ArrayList<String> temp3 = new ArrayList<>();
        ArrayList<String> makananPokok;
        ArrayList<String> lauk;
        ArrayList<String> buah;
        ArrayList<String> minuman;
        ArrayList<String> sayur;
        
        //makanan pokok
        Collections.addAll(temp1, MakananPagi.mpS);
        Collections.addAll(temp2, MakananSiang.mpS);
        Collections.addAll(temp3, MakananMalam.mpS);
        temp2.removeAll(temp1);
        temp1.addAll(temp2);
        temp3.removeAll(temp1);
        temp1.addAll(temp3);
        makananPokok = temp1;
        
        //lauk
        temp1 = new ArrayList<>();
        temp2 = new ArrayList<>();
        Collections.addAll(temp1, MakananSiang.laukS);
        Collections.addAll(temp2, MakananMalam.laukS);
        temp2.removeAll(temp1);
        temp1.addAll(temp2);
        lauk = temp1;
        
        //buah
        temp1 = new ArrayList<>();
        temp2 = new ArrayList<>();
        Collections.addAll(temp1, MakananPagi.buahS);
        Collections.addAll(temp2, MakananSiang.buahS);
        temp2.removeAll(temp1);
        temp1.addAll(temp2);
        buah = temp1;
        
        //minuman
        temp1 = new ArrayList<>();
        temp2 = new ArrayList<>();
        temp3 = new ArrayList<>();
        Collections.addAll(temp1, MakananPagi.minumanS);
        Collections.addAll(temp2, MakananSiang.minumanS);
        Collections.addAll(temp3, MakananMalam.minumanS);
        temp2.removeAll(temp1);
        temp1.addAll(temp2);
        temp3.removeAll(temp1);
        temp1.addAll(temp3);
        minuman = temp1;
        
        //sayur
        temp1 = new ArrayList<>();
        Collections.addAll(temp1, MakananSiang.sayurS);
        sayur = temp1;
        
        System.out.println(makananPokok);
        System.out.println(lauk);
        System.out.println(buah);
        System.out.println(minuman);
        System.out.println(sayur);
    }
}
