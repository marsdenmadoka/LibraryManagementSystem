/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marsmadoka98.gmail;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author rootkali
 */
public class javaconnect {
    
    public static Connection ConnectDb(){
       try{ 
     Class.forName("");
     Connection conn=DriverManager.getConnection(" ");
     return conn;
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        return null;
}
     
     
        
    
  
    
    }
    
}
