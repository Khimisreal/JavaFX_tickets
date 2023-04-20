/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.baokhiem.Tester;

import com.baokhiem.conf.jdbcUtils;
import com.baokhiem.services.ThemChuyenDiService;
import com.baokhiem.services.TicketService;
import java.sql.Connection;
import java.sql.SQLException;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

/**
 *
 * @author wert
 */
public class XoaVeTester {
    private static Connection conn;
    private static TicketService s;
    
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
    public void testXoaVe() throws SQLException {      
        Assertions.assertTrue(s.delVe(1));
    }
    @Test
    @Order(2)
    public void testXoaVeERR() throws SQLException {      
        Assertions.assertFalse(s.delVe(14));
    }
}
