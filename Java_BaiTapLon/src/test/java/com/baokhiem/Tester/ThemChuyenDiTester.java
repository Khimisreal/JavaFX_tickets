/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.baokhiem.Tester;

import com.baokhiem.conf.jdbcUtils;
import com.baokhiem.pojo.Chitiet_Chuyendi;
import com.baokhiem.services.ThemChuyenDiService;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Date;
import java.time.LocalDate;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Assertions;

/**
 *
 * @author wert
 */
public class ThemChuyenDiTester {
    private static Connection conn;
    private static ThemChuyenDiService s;
//    private static UserServices s;
    
    @BeforeAll
    public static void beforeAll()throws SQLException{
        conn = jdbcUtils.getConn();
        s = new ThemChuyenDiService();
    }
    @AfterAll
    public static void afterAll() throws SQLException{
        if(conn!=null)
            conn.close();
    }
    @Test
    @Order(1)
    public void testAddChuyenDi() throws SQLException {
        Chitiet_Chuyendi ctcd = new Chitiet_Chuyendi();
        ctcd.setIdct_chuyendi(1);
        ctcd.setIdchuyendi(1);
        ctcd.setIdxe("BUSa50");
        ctcd.setXuatphat(Date.valueOf(LocalDate.now()));        
        Assertions.assertTrue(s.addCT_ChuyenDi(ctcd));
    }
    @Test
    @Order(2)
    public void testAddChuyenDiErr() throws SQLException {
        Chitiet_Chuyendi ctcd = new Chitiet_Chuyendi();
        ctcd.setIdct_chuyendi(2);
        ctcd.setIdchuyendi(0);
        ctcd.setIdxe("BUSb50");
        ctcd.setXuatphat(Date.valueOf(LocalDate.now()));
        
        
        
        
        Assertions.assertFalse(s.addCT_ChuyenDi(ctcd));
        


    }
}
