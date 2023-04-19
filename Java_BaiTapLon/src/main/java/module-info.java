module com.baokhiem.java_baitaplon {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.base;

    opens com.baokhiem.java_baitaplon to javafx.fxml;
    exports com.baokhiem.java_baitaplon;
}
