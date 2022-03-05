/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project.ppbo;

import java.util.*;

public class Main {
    private static Scanner scan;
    private static KebutuhanKalori kkal;
    
    public static void main(String[] args) {
        int tinggi, berat, usia;
        String gender;
        boolean valid = false;
        
        scan = new Scanner(System.in);
        
        System.out.println("== Program Kalori ==\n");
        
        System.out.println("Tinggi (cm): ");
        tinggi = scan.nextInt();
        
        System.out.println("Berat (kg): ");
        berat = scan.nextInt();
        
        System.out.println("Usia (tahun): ");
        usia = scan.nextInt();
        
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
        
        
        kkal = new KebutuhanKalori(tinggi, berat, usia, gender);
        
        System.out.println("\nKebutuhan kalori per hari: " + kkal.hitungKalori() + " kkal");
    }
}
