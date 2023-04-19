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
public class Ve {
    private int idve;
    private int idkhachhang;
    private int idnhanvien;
    private Date ngaytao;
    private int idghexe;
    private int idct_chuyendi;

    public Ve() {
    }

    public Ve(int idve, int idkhachhang, int idnhanvien, Date ngaytao, int idghexe, int idct_chuyendi) {
        this.idve = idve;
        this.idkhachhang = idkhachhang;
        this.idnhanvien = idnhanvien;
        this.ngaytao = ngaytao;
        this.idghexe = idghexe;
        this.idct_chuyendi = idct_chuyendi;
    }

    
    
    /**
     * @return the idve
     */
    public int getIdve() {
        return idve;
    }

    /**
     * @param idve the idve to set
     */
    public void setIdve(int idve) {
        this.idve = idve;
    }

    /**
     * @return the idkhachhang
     */
    public int getIdkhachhang() {
        return idkhachhang;
    }

    /**
     * @param idkhachhang the idkhachhang to set
     */
    public void setIdkhachhang(int idkhachhang) {
        this.idkhachhang = idkhachhang;
    }

    /**
     * @return the idnhanvien
     */
    public int getIdnhanvien() {
        return idnhanvien;
    }

    /**
     * @param idnhanvien the idnhanvien to set
     */
    public void setIdnhanvien(int idnhanvien) {
        this.idnhanvien = idnhanvien;
    }

    /**
     * @return the ngaytao
     */
    public Date getNgaytao() {
        return ngaytao;
    }

    /**
     * @param ngaytao the ngaytao to set
     */
    public void setNgaytao(Date ngaytao) {
        this.ngaytao = ngaytao;
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
    
}
