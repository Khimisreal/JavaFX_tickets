module com.baokhiem.java_baitaplon {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.baokhiem.java_baitaplon to javafx.fxml;
    exports com.baokhiem.java_baitaplon;
}
