/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package project.ppbo;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Menu {
    private static int pilihan;
    private static Scanner scan = new Scanner(System.in);
    private static final NumberFormat formatter = new DecimalFormat("#0.00");
    
    public static void setPilihan(int pilihan) {
        Menu.pilihan = pilihan;
    }
    
    public static int getPilihan() {
        return Menu.pilihan;
    }
    
    public static void printMenu() {
        System.out.println("""    
                           
                           Menu:
                           1. Menu Makanan
                           2. Kebutuhan Kalori
                           3. Exit
                           """);
    }   
    
    public static void prosesMenu1() {
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
        
    }
    
    public static void prosesMenu2(User user) {
        int tinggi, berat, usia;
        String gender;
        boolean valid = false;
        
        scan = new Scanner(System.in);
                
        System.out.print("Tinggi (cm): ");
        tinggi = scan.nextInt();
        user.setTinggi(tinggi);
        
        System.out.print("Berat (kg): ");
        berat = scan.nextInt();
        user.setBerat(berat);
        
        System.out.print("Usia (tahun): ");
        usia = scan.nextInt();
        user.setUsia(usia);
        
        System.out.print("Gender (L/P): ");
        gender = scan.next();
            
        while(!valid) {
            if("L".equalsIgnoreCase(gender) || "P".equalsIgnoreCase(gender)) {
                valid = true;
            } else {
                System.out.println("\nGender invalid, coba lagi.\n");
                System.out.print("Gender (L/P): ");
                gender = scan.nextLine();
            }
        }
        
        user.setGender(gender);
        Kalori.hitungKalori(user);
       
        System.out.println("\nKebutuhan kalori per hari: " + user.getKalori() + " kkal");
        
        Kalori.bagiKalori(user);
        Kalori.kalPagi(user);
        Kalori.kalSiang(user);
        Kalori.kalMalam(user);
        
        float[] arr = user.getPagi().getGramMp();
        System.out.println(
                "\n"
                + "==================================PAGI HARI==================================\n"
                + "Kalori: " + user.getKalori() + "\n"
                + "Kalori Pagi: " + user.getKalPagi() + "\n" + "\n"
                + "\n"
                + "-----------------MAKANAN POKOK-----------------\n"
                + "Kalori Makanan Pokok: " + user.getPagi().getKalMp() + "\n"
                + "Rekomendasi Makanan Pokok");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + ". " + MakananPagi.mpS[i] + " sebesar " + (int) Math.round(arr[i]) + " gram");
        }

        arr = user.getPagi().getGramB();
        System.out.println(
                "\n" +
                "-----------------BUAH-----------------\n"
                + "Kalori Buah: " + user.getPagi().getKalB() + "\n"
                + "Rekomendasi Buah");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + ". " + MakananPagi.buahS[i] + " sebesar " + (int) Math.round(arr[i]) + " gram");
        }
        
        
        System.out.println(
                "\n" +
                "-----------------MINUMAN-----------------\n"
                + "Rekomendasi Minum");
        for (int i = 0; i < MakananPagi.minumanS.length ; i++) {
            System.out.println(i + 1 + ". " + MakananPagi.minumanS[i] + " sebesar " + " 1 gelas");
        }

        arr = user.getSiang().getGramMp();
        System.out.println(
                "\n"
                + "==================================SIANG HARI==================================\n"
                + "Kalori: " + user.getKalori() + "\n"
                + "Kalori Siang: " + user.getKalSiang() + "\n" + "\n"
                + "-----------------MAKANAN POKOK-----------------\n"
                + "Kalori Makanan Pokok: " + user.getSiang().getKalMp() + "\n"
                + "Rekomendasi Makanan Pokok");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + ". " + MakananSiang.mpS[i] + " sebesar " + (int) Math.round(arr[i]) + " gram");
        }

        arr = user.getSiang().getGramL();
        System.out.println(
                "\n" +
                "-----------------LAUK-PAUK-----------------\n"
                + "Kalori Lauk-pauk: " + user.getSiang().getKalL() + "\n"
                + "Rekomendasi Lauk-Pauk");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + ". " + MakananSiang.laukS[i] + " sebesar " + (int) Math.round(arr[i]) + " gram");
        }

        arr = user.getSiang().getGramB();
        System.out.println(
                "\n"
                + "-----------------BUAH-----------------\n"
                + "Kalori Buah: " + user.getSiang().getKalB() + "\n"
                + "Rekomendasi Buah");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + ". " + MakananSiang.buahS[i] + " sebesar " + (int) Math.round(arr[i]) + " gram");
        }

        arr = user.getSiang().getGramS();
        System.out.println(
                "\n" +
                "-----------------Sayur-----------------\n"
                + "Kalori Sayur: " + user.getSiang().getKalS() + "\n"
                + "Rekomendasi Sayur");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + ". " + MakananSiang.sayurS[i] + " sebesar " + (int) Math.round(arr[i]) + " gram");
        }
       
        
        System.out.println(
                "\n" +
                "-----------------MINUMAN-----------------\n"
                + "Rekomendasi Minum");
        for (int i = 0; i < MakananSiang.minumanS.length; i++) {
            System.out.println(i + 1 + ". " + MakananSiang.minumanS[i] + " sebesar " + " 1 gelas");
        }

        arr = user.getMalam().getGramMp();
        System.out.println(
                "\n"
                + "==================================MALAM HARI==================================\n"
                + "Kalori: " + user.getKalori() + "\n"
                + "Kalori Malam: " + user.getKalMalam() + "\n" + "\n"
                + "-----------------MAKANAN POKOK-----------------\n"
                + "Kalori Makanan Pokok: " + user.getMalam().getKalMp() + "\n"
                + "Rekomendasi Makanan Pokok");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + ". " + MakananMalam.mpS[i] + " sebesar " + (int) Math.round(arr[i]) + " gram");
        }

        arr = user.getMalam().getGramL();
        System.out.println(
                "\n" +
                "-----------------LAUK-PAUK-----------------\n"
                + "Kalori Lauk-pauk: " + user.getMalam().getKalL() + "\n"
                + "Rekomendasi Lauk-Pauk");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + ". " + MakananMalam.laukS[i] + " sebesar " + (int) Math.round(arr[i]) + " gram");
        }
        
        System.out.println(
                "\n" +
                "-----------------MINUMAN-----------------\n"
                + "Rekomendasi Minum");
        for (int i = 0; i < MakananMalam.minumanS.length; i++) {
            System.out.println(i + 1 + ". " + MakananMalam.minumanS[i] + " sebesar " + " 1 gelas");
        }
        
        System.out.println("=================================================");
    }
}
