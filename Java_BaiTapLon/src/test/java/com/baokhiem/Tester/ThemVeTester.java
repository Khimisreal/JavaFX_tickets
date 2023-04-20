/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.baokhiem.Tester;

import com.baokhiem.conf.jdbcUtils;
import com.baokhiem.pojo.Ve;
import com.baokhiem.services.TicketService;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

/**
 *
 * @author wert
 */
public class ThemVeTester {
     private static Connection conn;
    private static TicketService s;
//    private static UserServices s;
    
    @BeforeAll
    public static void beforeAll()throws SQLException{
        conn = jdbcUtils.getConn();
        s = new TicketService();
    }
    @AfterAll
    public static void afterAll() throws SQLException{
        if(conn!=null)
            conn.close();
    }
    @Test
    @Order(1)
    public void testAddChuyenDi() throws SQLException {
        Ve v = new Ve();
        v.setIdve(1);
        v.setIdkhachhang(1);
        v.setIdnhanvien(1);
        v.setNgaytao(Date.valueOf(LocalDate.now())); 
        v.setIdghexe(1);
        v.setIdct_chuyendi(1);
               
        Assertions.assertTrue(s.addVe(v));
    }
}
