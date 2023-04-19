/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.baokhiem.nhanvien;

import com.baokhiem.conf.jdbcUtils;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author wert
 */
public class NhanvienTester {
    private static Connection conn;
    @BeforeAll
    public static void beforeAll()throws SQLException{
        conn = jdbcUtils.getConn();
    }
    
    @AfterAll
    public static void afterAll() throws SQLException{
        if(conn!=null)
            conn.close();
    } 
    
    @Test
    public void testQuantity() throws SQLException{
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery("SELECT * FROM nhanvien");
        
        List<String> kq = new ArrayList<>();
        while (rs.next()){
            String name = rs.getString("ten");
            System.out.println(name);
            kq.add(name);
        }
        Set<String> kq2 = new HashSet<>(kq);
        Assertions.assertEquals(kq.size(), kq2.size());
    }
}
