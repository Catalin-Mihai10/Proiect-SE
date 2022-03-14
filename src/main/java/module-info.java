module com.example.proiectse {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.proiectse to javafx.fxml;
    exports com.example.proiectse;
}