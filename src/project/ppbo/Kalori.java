/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package project.ppbo;

public class Kalori {
     static void hitungKalori(User user) {
        float kebutuhankal = 0;
                
        if ("L".equals(user.getGender())) {
            kebutuhankal = (float) (66.5 + (13.7 * user.getBerat()) + (5 * user.getTinggi()) - (6.8 * user.getUsia()));
        } else if ("P".equals(user.getGender())) {
            kebutuhankal = (float) (655 + (9.6 * user.getBerat()) + (1.8 * user.getTinggi()) - (4.7 * user.getUsia()));
        }
        
        user.setKalori(kebutuhankal);
    }
}
