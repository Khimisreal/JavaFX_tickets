/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.baokhiem.pojo;

/**
 *
 * @author wert
 */
public class Admin {
    private int idadmin;
    private String username;
    private String password;

    public Admin() {
    }

    public Admin(int idadmin, String username, String password) {
        this.idadmin = idadmin;
        this.username = username;
        this.password = password;
    }

    
    
    /**
     * @return the id
     */
    public int getIdadmin() {
        return idadmin;
    }

    /**
     * @param idadmin the id to set
     */
    public void setIdadmin(int idadmin) {
        this.idadmin = idadmin;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
