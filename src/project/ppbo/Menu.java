/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package project.ppbo;

import java.text.DecimalFormat;
import java.text.NumberFormat;
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
        
    }
    
    public static void prosesMenu2(User user) {
        int tinggi, berat, usia;
        String gender;
        boolean valid = false;
        
        scan = new Scanner(System.in);
                
        System.out.println("Tinggi (cm): ");
        tinggi = scan.nextInt();
        user.setTinggi(tinggi);
        
        System.out.println("Berat (kg): ");
        berat = scan.nextInt();
        user.setBerat(berat);
        
        System.out.println("Usia (tahun): ");
        usia = scan.nextInt();
        user.setUsia(usia);
        
        System.out.println("Gender (L/P): ");
        gender = scan.next();
            
        while(!valid) {
            if("L".equals(gender) || "P".equals(gender)) {
                valid = true;
            } else {
                System.out.println("\nGender invalid, coba lagi.\n");
                System.out.println("Gender (L/P): ");
                gender = scan.nextLine();
            }
        }
        
        user.setGender(gender);
        Kalori.hitungKalori(user);
       
        System.out.println("\nKebutuhan kalori per hari: " + user.getKalori() + " kkal");
    }
}
