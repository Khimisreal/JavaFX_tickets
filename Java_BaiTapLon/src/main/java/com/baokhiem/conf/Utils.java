/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.baokhiem.conf;

import javafx.scene.control.Alert;

/**
 *
 * @author wert
 */
public class Utils {
    public static Alert getBox(String msg, Alert.AlertType type) {
        Alert a = new Alert(type);
        a.setContentText(msg);
        
        return a;
    }
}
