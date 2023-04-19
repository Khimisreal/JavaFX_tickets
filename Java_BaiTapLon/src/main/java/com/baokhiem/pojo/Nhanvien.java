/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.baokhiem.pojo;

/**
 *
 * @author wert
 */
public class Nhanvien {
    private int idnhanvien;
    private String ten;
    private String username;
    private String password;

    public Nhanvien() {
    }

    public Nhanvien(int idnhanvien, String ten, String username, String password) {
        this.idnhanvien = idnhanvien;
        this.ten = ten;
        this.username = username;
        this.password = password;
    }

    
    
    /**
     * @return the id
     */
    public int getIdnhanvien() {
        return idnhanvien;
    }

    /**
     * @param idnhanvien the id to set
     */
    public void setIdnhanvien(int idnhanvien) {
        this.idnhanvien = idnhanvien;
    }

    /**
     * @return the ten
     */
    public String getTen() {
        return ten;
    }

    /**
     * @param ten the ten to set
     */
    public void setTen(String ten) {
        this.ten = ten;
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
