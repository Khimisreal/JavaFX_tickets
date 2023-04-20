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
import java.util.HashSet;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Assertions;
/**
 *
 * @author wert
 */
public class XoaChuyenDiTester {
    private static Connection conn;
    private static ThemChuyenDiService s;
    
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
    public void testXoaChuyenDi() throws SQLException {       
        Assertions.assertTrue(s.delCT_ChuyenDi(1));
    }
    @Test
    @Order(2)
    public void testXoaChuyenDiERR() throws SQLException {       
        Assertions.assertFalse(s.delCT_ChuyenDi(12));
    }
}
