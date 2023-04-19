/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.baokhiem.pojo;

/**
 *
 * @author wert
 */
public class Ghexe {
    private int idghexe;
    private boolean is_taken;
    private String idxe;

    public Ghexe() {
    }

    public Ghexe(int idghexe, boolean is_taken, String idxe) {
        this.idghexe = idghexe;
        this.is_taken = is_taken;
        this.idxe = idxe;
    }
    
    

    /**
     * @return the idghexe
     */
    public int getIdghexe() {
        return idghexe;
    }

    /**
     * @param idghexe the idghexe to set
     */
    public void setIdghexe(int idghexe) {
        this.idghexe = idghexe;
    }

    /**
     * @return the is_taken
     */
    public boolean isIs_taken() {
        return is_taken;
    }

    /**
     * @param is_taken the is_taken to set
     */
    public void setIs_taken(boolean is_taken) {
        this.is_taken = is_taken;
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
}
