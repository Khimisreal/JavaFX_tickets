/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.baokhiem.pojo;

/**
 *
 * @author wert
 */
public class Chuyendi {
    private int idchuyendi;
    private String tenchuyen;
    private double gia;

    public Chuyendi() {
    }

    public Chuyendi(int idchuyendi, String tenchuyen, double gia) {
        this.idchuyendi = idchuyendi;
        this.tenchuyen = tenchuyen;
        this.gia = gia;
    }
    
    

    /**
     * @return the idchuyendi
     */
    public int getIdchuyendi() {
        return idchuyendi;
    }

    /**
     * @param idchuyendi the idchuyendi to set
     */
    public void setIdchuyendi(int idchuyendi) {
        this.idchuyendi = idchuyendi;
    }

    /**
     * @return the tenchuyen
     */
    public String getTenchuyen() {
        return tenchuyen;
    }

    /**
     * @param tenchuyen the tenchuyen to set
     */
    public void setTenchuyen(String tenchuyen) {
        this.tenchuyen = tenchuyen;
    }

    /**
     * @return the gia
     */
    public double getGia() {
        return gia;
    }

    /**
     * @param gia the gia to set
     */
    public void setGia(double gia) {
        this.gia = gia;
    }
    
}
