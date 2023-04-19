/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.baokhiem.pojo;

/**
 *
 * @author wert
 */
public class Xe {
    private String idxe;
    private String tenxe;
    private boolean is_busy;

    public Xe() {
    }

    public Xe(String idxe, String tenxe, boolean is_busy) {
        this.idxe = idxe;
        this.tenxe = tenxe;
        this.is_busy = is_busy;
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
     * @return the tenxe
     */
    public String getTenxe() {
        return tenxe;
    }

    /**
     * @param tenxe the tenxe to set
     */
    public void setTenxe(String tenxe) {
        this.tenxe = tenxe;
    }

    /**
     * @return the is_busy
     */
    public boolean isIs_busy() {
        return is_busy;
    }

    /**
     * @param is_busy the is_busy to set
     */
    public void setIs_busy(boolean is_busy) {
        this.is_busy = is_busy;
    }
}
