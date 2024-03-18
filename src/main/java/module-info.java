module com.example.lab5sef {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab5sef to javafx.fxml;
    exports com.example.lab5sef;
}