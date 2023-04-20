/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.baokhiem.Tester;

import com.baokhiem.conf.jdbcUtils;
import com.baokhiem.pojo.Nhanvien;
import com.baokhiem.services.UserService;
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
public class LoginTester {
    private static Connection conn;
//    private static UserServices s;
    
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
    @Order(1)
    public void testLogin() throws SQLException {
        Nhanvien user = new Nhanvien();

        user.setUsername("duc123");
        user.setPassword("1");
   
        
        Nhanvien newUser = UserService.getUserByUserName(user.getUsername());
        Assertions.assertNotNull(newUser);
        
        Assertions.assertEquals(user.getUsername(), newUser.getUsername());
        Assertions.assertEquals(user.getPassword(), newUser.getPassword());
        
    }  
    @Test
    @Order(2)
    public void testLoginErr1() throws SQLException {
        Nhanvien user = new Nhanvien();
        
        user.setUsername("duc123");
        user.setPassword("cccccc");
   
        
        Nhanvien newUser = UserService.getUserByUserName(user.getUsername());
        Assertions.assertNotNull(newUser);
       
        Assertions.assertEquals(user.getUsername(), newUser.getUsername());
        Assertions.assertNotEquals(user.getPassword(), newUser.getPassword());
        
    } 
    
}
