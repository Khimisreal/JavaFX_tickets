/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.baokhiem.services;

import com.baokhiem.conf.jdbcUtils;
import com.baokhiem.pojo.Nhanvien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author wert
 */
public class UserService {
    public static Nhanvien getUserByUserName(String username) throws SQLException {
        try (Connection conn = jdbcUtils.getConn()) {
            PreparedStatement stm = conn.prepareStatement("SELECT * FROM `nhanvien` WHERE `username` = ?");
            stm.setString(1, username);
            ResultSet rs = stm.executeQuery();
            
            Nhanvien user = null;
            while (rs.next()) {
                user = new Nhanvien();
                
                user.setIdnhanvien(rs.getInt("idnhanvien"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                
                
               
                break;
            }
            
            return user;
        }
    }
}
