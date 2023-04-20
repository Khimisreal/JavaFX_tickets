/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.baokhiem.services;

import com.baokhiem.conf.jdbcUtils;
import com.baokhiem.pojo.Chuyendi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wert
 */
public class ChuyenDiService {
    public List<Chuyendi> getChuyenDi() throws SQLException{
        List<Chuyendi> results = new ArrayList<>();
        try(Connection conn = jdbcUtils.getConn()){
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM chuyendi");
            while (rs.next()){
                Chuyendi c = new Chuyendi(rs.getInt("idchuyendi"), rs.getString("tenchuyen"));
                results.add(c);
            }
        }
        return results;
    }
}
