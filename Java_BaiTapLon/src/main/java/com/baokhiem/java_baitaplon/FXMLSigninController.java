/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.baokhiem.java_baitaplon;

import com.baokhiem.conf.jdbcUtils;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author wert
 */
public class FXMLSigninController implements Initializable {
private static String isManager = "0";
    @FXML
    private Pane admin_form;

    @FXML
    private Pane employee_form;

    @FXML
    private Hyperlink admin_hyperlink;

    @FXML
    private Button admin_loginBtn;

    @FXML
    private PasswordField admin_password;

    @FXML
    private TextField admin_username;

    @FXML
    private TextField employee_username;

    @FXML
    private PasswordField employee_password;

    @FXML
    private Button employee_loginBtn;

    @FXML
    private Hyperlink employee_hyperlink;



    private ResultSet rs;
    private PreparedStatement stm;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void afterLogin(ActionEvent event) throws IOException {
        String username = employee_username.getText();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLThemChuyenDi.fxml"));
        Parent root = loader.load();

        FXMLQuanLyVeController veController = loader.getController();

    }


    public void adminLogin(ActionEvent event) throws SQLException {
        Connection conn = jdbcUtils.getConn();
        String  adminData = "SELECT * FROM admin WHERE username = ? and password = ? ";


        try{
            Alert alert;

            if(admin_username.getText().isEmpty()
                || admin_password.getText().isEmpty()) {
                alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setContentText("Please fill username and password fields");
                alert.showAndWait();
            }else {
                stm = conn.prepareStatement(adminData);
                stm.setString(1, admin_username.getText());
                stm.setString(2, admin_password.getText());
                rs = stm.executeQuery();

                if(rs.next()) {
                  alert = new Alert(Alert.AlertType.INFORMATION);
                  alert.setTitle("Information Message");
                  alert.setContentText("Successfully Login");
                  alert.showAndWait();
                  admin_loginBtn.getScene().getWindow().hide();

                  Parent root = FXMLLoader.load(FXMLSigninController.class.getResource("/com/baokhiem/Java_BaiTapLon/FXMLThemChuyenDi.fxml"));

                  Stage stage = new Stage();
                  Scene scene = new Scene(root);

                  stage.setScene(scene);
                  stage.show();
                }else {
                    alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setContentText("Wrong Username/Password");
                    alert.showAndWait();
                }
            }
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    public void employeeLogin(ActionEvent event) throws SQLException {
        Connection conn = jdbcUtils.getConn();
        String  employeeData = "SELECT * FROM nhanvien WHERE username = ? and password = ? ";


        try{
            Alert alert;

            if(employee_username.getText().isEmpty()
                    || employee_password.getText().isEmpty()) {
                alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setContentText("Please fill username and password fields");
                alert.showAndWait();
            }else {
                stm = conn.prepareStatement(employeeData);
                stm.setString(1, employee_username.getText());
                stm.setString(2, employee_password.getText());
                rs = stm.executeQuery();

                if(rs.next()) {
//                    GetData.username = employee_username.getText();
                    //Chuyen den employee view
                    alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setContentText("Successfully Login");
                    alert.showAndWait();
//                    String username = employee_username.getText();
                    employee_loginBtn.getScene().getWindow().hide();
                    Parent root = FXMLLoader.load(App.class.getResource("FXMLQuanLyVe.fxml"));

//                    EmployeeController employeeController = loader.getController();
//                    employeeController.displayName(username);


                    //Parent root = FXMLLoader.load(getClass().getResource("employee-view.fxml"));

                    Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                    Scene scene = new Scene(root);

                    stage.setScene(scene);
                    stage.show();
                }else {
                    alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setContentText("Wrong Username/Password");
                    alert.showAndWait();
                }
            }
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    public void switchForm(ActionEvent event) {
        if(event.getSource() == admin_hyperlink) {
            admin_form.setVisible(false);
            employee_form.setVisible(true);
        }else if(event.getSource() == employee_hyperlink) {
            admin_form.setVisible(true);
            employee_form.setVisible(false);
        }
    }
    
}
