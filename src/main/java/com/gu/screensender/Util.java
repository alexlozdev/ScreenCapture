package com.gu.screensender;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javafx.scene.control.Alert;

/**
 *
 * @author John
 */
public class Util {
    private static Util mUtil ;
    public static Util getInstance() {
        if (mUtil == null) {
            mUtil = new Util();            
        }
        
        return mUtil;
    }
    
    public void infoBox(String infoMessage, String titleBar, String headerMessage)
    {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titleBar);
        alert.setHeaderText(headerMessage);
        alert.setContentText(infoMessage);
        alert.showAndWait();
    }
}
