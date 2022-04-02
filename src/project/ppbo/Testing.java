/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package project.ppbo;

/**
 *
 * @author Fauzan
 */
public class Testing {
    public static void main(String[] args) {
        User user = new User(150, 45, 19, "P");
        
        Kalori.hitungKalori(user);
        Kalori.bagiKalori(user);
        Kalori.kalPagi(user);
        
        float[] arr = user.getPagi().getGramMp();
        
        System.out.println(
                "Kalori: " + user.getKalori() + "\n" + 
                "Kalori Pagi: " + user.getKalPagi() + "\n" + 
                "Kalori MP: " + user.getPagi().getKalMp() + "\n" + 
                "Gram Roti: " + arr[0]);
    }
}
