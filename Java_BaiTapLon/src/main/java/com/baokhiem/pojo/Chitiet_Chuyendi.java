/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.baokhiem.pojo;

import java.util.Date;

/**
 *
 * @author wert
 */
public class Chitiet_Chuyendi {
    private int idct_chuyendi;
    private int idchuyendi;
    private String idxe;
    private Date xuatphat;

    public Chitiet_Chuyendi() {
    }

    public Chitiet_Chuyendi(int idct_chuyendi, int idchuyendi, String idxe, Date xuatphat) {
        this.idct_chuyendi = idct_chuyendi;
        this.idchuyendi = idchuyendi;
        this.idxe = idxe;
        this.xuatphat = xuatphat;
    }

    
    
    /**
     * @return the idct_chuyendi
     */
    public int getIdct_chuyendi() {
        return idct_chuyendi;
    }

    /**
     * @param idct_chuyendi the idct_chuyendi to set
     */
    public void setIdct_chuyendi(int idct_chuyendi) {
        this.idct_chuyendi = idct_chuyendi;
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
     * @return the idxe
     */
    public String getIdxe() {
        return idxe;
    }

    /**
     * @param idxe the idxe to set
     */
    public void setIdxe(String idxe) {
        this.idxe = idxe;
    }

    /**
     * @return the xuatphat
     */
    public Date getXuatphat() {
        return xuatphat;
    }

    /**
     * @param xuatphat the xuatphat to set
     */
    public void setXuatphat(Date xuatphat) {
        this.xuatphat = xuatphat;
    }
    
    
}
