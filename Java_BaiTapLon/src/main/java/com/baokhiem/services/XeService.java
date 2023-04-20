/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.baokhiem.services;


import com.baokhiem.conf.jdbcUtils;
import com.baokhiem.pojo.Xe;
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
public class XeService {
    public List<Xe> getXe() throws SQLException{
        List<Xe> results = new ArrayList<>();
        try(Connection conn = jdbcUtils.getConn()){
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM xe");
            while (rs.next()){
                Xe c = new Xe(rs.getString("idxe"));
                results.add(c);
            }
        }
        return results;
    }
}
