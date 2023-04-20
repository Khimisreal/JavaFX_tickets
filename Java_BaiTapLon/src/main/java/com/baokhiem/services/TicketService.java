/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.baokhiem.services;

import com.baokhiem.conf.jdbcUtils;
import com.baokhiem.pojo.Ve;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

/**
 *
 * @author wert
 */
public class TicketService {
    public boolean addVe(Ve v) throws SQLException {
        if(v.getIdve()!= 0){
            try (Connection conn = jdbcUtils.getConn()) {
                conn.setAutoCommit(false);

                PreparedStatement stm = conn.prepareStatement("INSERT INTO `ve` "
                        + "VALUES(?, ?, ?, ?, ?, ?)");

                stm.setInt(1, v.getIdve());
                stm.setInt(2, v.getIdkhachhang());
                stm.setInt(3, v.getIdnhanvien());
                stm.setDate(4, v.getNgaytao()); 
                stm.setInt(5, v.getIdghexe());
                stm.setInt(6, v.getIdct_chuyendi());
                               
               
                stm.executeUpdate();
                conn.commit();

                return true;
            }
        }
        return false;
    }
    public boolean delVe(Integer idve) throws SQLException {
        if( idve != null ) {
            try (Connection conn = jdbcUtils.getConn()) {
                conn.setAutoCommit(false);
                
                PreparedStatement stm = conn.prepareStatement("DELETE FROM `ve` WHERE idve = ?");

                stm.setInt(1, idve);
                
                
                int rowAffected = stm.executeUpdate();
                conn.commit();

                return rowAffected != 0;
            }
        }
        return false;
    }
}
