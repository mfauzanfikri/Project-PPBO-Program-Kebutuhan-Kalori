/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project.ppbo;

import java.util.*;

public class Main {
    private static Scanner scan;
    private static User user;
    
    public static void main(String[] args) {
        user = new User();
        scan = new Scanner(System.in);
        String konfirmasi = "";
        
        System.out.println("== Program Kalori ==\n");
        
        Menu.printMenu();
        System.out.print("Masukkan pilihan menu (1-2): ");
        Menu.setPilihan(scan.nextInt());
        
        while(Menu.getPilihan() >=1 && Menu.getPilihan() <= 2) {
            if ("Y".equals(konfirmasi) || "y".equals(konfirmasi)) {
                Menu.printMenu();
                System.out.print("Masukkan pilihan menu (1-2): ");
                Menu.setPilihan(scan.nextInt());
            }
            
            switch (Menu.getPilihan()) {
                case 1 -> {
                    Menu.prosesMenu1();
                    System.out.print("Kembali ke menu? (Y/N):");
                    konfirmasi = scan.next();
                    if ("Y".equals(konfirmasi) || "y".equals(konfirmasi)) {
                        continue;
                    } else {
                        return;
                    }
                }
                    
                case 2 -> {
                    Menu.prosesMenu2(user);
                    System.out.print("Kembali ke menu? (Y/N):");
                    konfirmasi = scan.next();
                    if ("Y".equals(konfirmasi) || "y".equals(konfirmasi)) {
                        continue;
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
