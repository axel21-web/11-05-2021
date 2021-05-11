module uni.edeu.ni.programacion2.activofx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens uni.edeu.ni.programacion2.activofx to javafx.fxml;
    exports uni.edeu.ni.programacion2.activofx;
    exports uni.edeu.ni.programacion2.activofx.Controller;
}
