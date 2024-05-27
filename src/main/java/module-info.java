module com.milkvita.oopmilkvita {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.milkvita.oopmilkvita to javafx.fxml;
    exports com.milkvita.oopmilkvita;
}