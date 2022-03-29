module com.example.proiectse {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires com.google.gson;

    opens com.example.proiectse to javafx.fxml;
    exports com.example.proiectse;
    exports Controllers;
    opens Controllers to javafx.fxml;
}