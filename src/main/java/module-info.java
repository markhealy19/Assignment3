module com.java.assignment3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.java.assignment3 to javafx.fxml;
    exports com.java.assignment3;
}