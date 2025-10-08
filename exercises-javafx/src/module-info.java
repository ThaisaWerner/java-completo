module exercisesfx {
    requires javafx.controls;
    requires java.desktop;
    requires javafx.fxml;
    requires org.controlsfx.controls;

    opens basic;
    opens layout;
    opens fxml;
}