/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.baokhiem.services;

import com.baokhiem.conf.jdbcUtils;
import com.baokhiem.pojo.Chitiet_Chuyendi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



/**
 *
 * @author wert
 */
public class ThemChuyenDiService {
   public boolean addCT_ChuyenDi(Chitiet_Chuyendi ctcd) throws SQLException {
        if(ctcd.getIdct_chuyendi()!= 0){
            try (Connection conn = jdbcUtils.getConn()) {
                conn.setAutoCommit(false);

                PreparedStatement stm = conn.prepareStatement("INSERT INTO `ct_chuyendi` "
                        + "VALUES(?, ?, ?, ?)");

                stm.setInt(1, ctcd.getIdct_chuyendi());
                stm.setInt(2, ctcd.getIdchuyendi());
                stm.setString(3, ctcd.getIdxe());
                stm.setDate(4, ctcd.getXuatphat());
                
               
                stm.executeUpdate();
                conn.commit();

                return true;
            }
        }
        return false;
    }
   public boolean delCT_ChuyenDi(Integer idct_chuyendi) throws SQLException {
        if( idct_chuyendi != null ) {
            try (Connection conn = jdbcUtils.getConn()) {
                conn.setAutoCommit(false);
                
                PreparedStatement stm = conn.prepareStatement("DELETE FROM `ct_chuyendi` WHERE idct_chuyendi = ?");

                stm.setInt(1, idct_chuyendi);
                
                
                int rowAffected = stm.executeUpdate();
                conn.commit();

                return rowAffected != 0;
            }
        }
        return false;
    }
   
   
}
