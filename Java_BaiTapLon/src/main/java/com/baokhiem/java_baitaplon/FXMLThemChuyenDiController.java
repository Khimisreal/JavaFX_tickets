/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.baokhiem.java_baitaplon;

import com.baokhiem.conf.Utils;
import com.baokhiem.pojo.Chitiet_Chuyendi;
import com.baokhiem.services.ChuyenDiService;
import com.baokhiem.services.ThemChuyenDiService;
import com.baokhiem.services.XeService;
import java.net.URL;
import java.sql.SQLException;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Window;

/**
 * FXML Controller class
 *
 * @author wert
 */
public class FXMLThemChuyenDiController implements Initializable {
    @FXML private ComboBox cbChuyendi;
    @FXML private ComboBox cbXe;
    @FXML private TableView tbCTChuyendi;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ChuyenDiService s = new ChuyenDiService();
        XeService x = new XeService();
        try {
            this.cbChuyendi.setItems(FXCollections.observableList(s.getChuyenDi()));
            this.cbXe.setItems(FXCollections.observableList(x.getXe()) );
            
        } catch (SQLException ex) {
            Logger.getLogger(FXMLThemChuyenDiController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
//        this.loadTabkeCT_ChuyenDi();
    }
//        private void loadTabkeCT_ChuyenDi() {
//            TableColumn col1 = new TableColumn("Ma thuoc");
//            col1.setCellValueFactory(new PropertyValueFactory("idct_chuyendi"));
//
//            TableColumn col2 = new TableColumn("Ten thuoc");
//            col2.setCellValueFactory(new PropertyValueFactory("idchuyendi"));
//
//            TableColumn col3 = new TableColumn("Ten hoat chat");
//            col3.setCellValueFactory(new PropertyValueFactory("idxe"));
//
//            TableColumn col4 = new TableColumn("Ma don vi");
//            col4.setCellValueFactory(new PropertyValueFactory("xuatphat"));
//
//            TableColumn col5 = new TableColumn("");
//            col5.setCellFactory(param -> new TableCell<Chitiet_Chuyendi, String>() {
//                final Button btnXoa = new Button("Xóa");
//
//                @Override
//                public void updateItem(String item, boolean empty) {
//                    super.updateItem(item, empty);
//                    if (empty) {
//                        setGraphic(null);
//                        setText(null);
//                    } else {
//                        btnXoa.setOnAction(event -> {
//                            Alert a = Utils.getBox("Ban co chac muon xoa?", Alert.AlertType.CONFIRMATION);
//                            Optional<ButtonType> result = a.showAndWait();
//                            if(result.get() == ButtonType.OK) {
//                                Chitiet_Chuyendi ctcd = getTableView().getItems().get(getIndex());
//
//                                try {
//                                    ThemChuyenDiService t = new ThemChuyenDiService();
//
//
//                                    if(t.delCT_ChuyenDi(ctcd.getIdct_chuyendi()) == true) {
//                                        Utils.getBox("Xoa thanh cong!", Alert.AlertType.INFORMATION).show();
//                                    }
//                                }
//                                catch (Exception e) {
//                                    Utils.getBox("Da co loi xay ra!", Alert.AlertType.WARNING).show();
//                                }
//
//                                getTableView().getItems().remove(ctcd);
//
//                            }
//                        });
//                        setGraphic(btnXoa);
//                        setText(null);
//                    }
//                }
//            });
//
//                this.tbCTChuyendi.getColumns().addAll(col1, col2, col3, col4, col5);
//        }
        
//      public void addMedicineHandler(ActionEvent evt) throws SQLException {
//        
//        Chitiet_Chuyendi ctcd = new Chitiet_Chuyendi();
//        ctcd.setIdct_chuyendi(0);
//        ctcd.setIdchuyendi((int) cbChuyendi.getValue());
//        ctcd.setIdXe(cbXe.getValue());
//        medicine.setAllowedUnitInStock(parseIntOrNull(txtAllowedUnitInStock.getText()));
//        medicine.setProducingCountry(txtProducingCountry.getText());
//
//
//        Window owner = submitButton.getScene().getWindow();
//        if (txtBrandName.getText().isEmpty()) {
//        Utils.showAlert(Alert.AlertType.ERROR, owner, "Lỗi!", "Chưa nhập tên thuốc");
//            return;
//        }
//        if (txtChemicalName.getText().isEmpty()) {
//        Utils.showAlert(Alert.AlertType.ERROR, owner, "Lỗi!", "Chưa nhập hoạt chất");
//            return;
//        }
//
//        if (cbxUnit.getValue() == null) {
//        Utils.showAlert(Alert.AlertType.ERROR, owner, "Lỗi!", "Chưa nhập đơn vị tính");
//            return;
//        }else{
//            medicine.setUnitId(cbxUnit.getSelectionModel().getSelectedItem().getId());
//        } 
//        
//        boolean check = false;
//        if (!txtAllowedUnitInStock.getText().isEmpty()) {
//            boolean flag = true;
//            check = true;
//            if (parseIntOrNull(txtAllowedUnitInStock.getText()) == 0) {
//                Utils.showAlert(Alert.AlertType.ERROR, owner, "Lỗi!","Phải nhập số lượng nhập tối đa khác 0");
//                flag = false;
//                return;
//            }
//            if(flag = true)
//                
//                medicine.setAllowedUnitInStock(parseIntOrNull(txtAllowedUnitInStock.getText()));
//        }else{
//            Utils.showAlert(Alert.AlertType.ERROR, owner, "Lỗi!","Chưa nhập số lượng tối đa");
//        }
//        
//        if (!txtUnitInStock.getText().isEmpty() && check == true) {
//            boolean flag = true;
//            if (parseIntOrNull(txtUnitInStock.getText()) == 0) {
//                Utils.showAlert(Alert.AlertType.ERROR, owner, "Lỗi!","Phải nhập số lượng khác 0");
//                flag = false;
//                return;
//            }
//            if (parseIntOrNull(txtUnitInStock.getText()) > parseIntOrNull(txtAllowedUnitInStock.getText())) {
//                Utils.showAlert(Alert.AlertType.ERROR, owner, "Lỗi!","Số lượng thuốc nhập vào phải nhỏ hơn số lượng cho phép");
//                flag=false;
//                return;
//            }
//            
//            if(flag = true)
//                medicine.setUnitInStock(parseIntOrNull(txtUnitInStock.getText()));
//            
//        }else{
//            if(check == false)
//                Utils.showAlert(Alert.AlertType.ERROR, owner, "Lỗi!","Chưa nhập số lượng tối đa");
//            else
//                Utils.showAlert(Alert.AlertType.ERROR, owner, "Lỗi!","Chưa nhập số lượng nhập vào kho");
//        }
//        
//        
//        if (!txtUnitPrice.getText().isEmpty()) {
//            boolean flag = true;
//            if (parseIntOrNull(txtUnitPrice.getText()) == 0) {
//                Utils.showAlert(Alert.AlertType.ERROR, owner, "Lỗi!","Phải nhập giá khác 0");
//                flag = false;
//                return;
//            }
//            if(flag = true)
//                medicine.setUnitPrice(parseFloatOrNull(txtUnitPrice.getText()));
//        }else{
//            Utils.showAlert(Alert.AlertType.ERROR, owner, "Lỗi!","Chưa nhập giá");
//        }
//        
// 
//               
//        if (txtProducingCountry.getText().isEmpty()) {
//            Utils.showAlert(Alert.AlertType.ERROR, owner, "Lỗi!","Chưa nhập quốc gia sản xuất");
//            return;
//        }
//           
//        MedicineServices s = new MedicineServices();       
//        if(s.addMedicine(medicine) == true) {
//            Utils.getBox("Them thuoc thanh cong!", Alert.AlertType.INFORMATION).show();
//            refresh();
//        }
//        else {
//            Utils.getBox("Da co loi xay ra!", Alert.AlertType.WARNING).show();
//        }
//    }
//    
    
//    public void editMedicineHandler(ActionEvent evt) throws SQLException {
//        if(this.txtBrandName.getText().isBlank() == false) {
//            
//        
//            Medicine medicine = new Medicine();
//
//            medicine.setId(parseIntOrNull(txtId.getText()));
//            medicine.setBrandName(txtBrandName.getText());
//            medicine.setChemicalName(txtChemicalName.getText());
//            medicine.setUnitId(1);
//            if(cbxUnit.getValue() != null)
//                medicine.setUnitId(cbxUnit.getSelectionModel().getSelectedItem().getId());
//            medicine.setUnitInStock(parseIntOrNull(txtUnitInStock.getText()));
//            medicine.setUnitPrice(parseFloatOrNull(txtUnitPrice.getText()));
//            medicine.setAllowedUnitInStock(parseIntOrNull(txtAllowedUnitInStock.getText()));
//            medicine.setProducingCountry(txtProducingCountry.getText());
//           
//
//
//            MedicineServices s = new MedicineServices();
//
//            if(s.editMedicine(medicine) == true) {
//                refresh();
//                Utils.getBox("Sua thanh cong!", Alert.AlertType.INFORMATION).show();
//            }
//            else {
//                Utils.getBox("Da co loi xay ra!", Alert.AlertType.WARNING).show();
//            }
//        }
//        
//        else {
//            Utils.getBox("Ban chua nhap ten thuoc!", Alert.AlertType.WARNING).show();
//        }
//    }
//       
//    
}
