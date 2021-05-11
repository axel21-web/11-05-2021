/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.edeu.ni.programacion2.activofx.Controller;

import java.net.URL;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import uni.edeu.ni.programacion2.activofx.Controller.pojo.Activo;

/**
 * FXML Controller class
 *
 * @author Sistemas-31
 */
public class DepresiacionFXMLController implements Initializable {

    @FXML
    public TextField txtNombre;
    @FXML
    public TextField txtValorActivo;
    @FXML
    public TextField txtValorSalvamento;
    @FXML
    public ComboBox<String> ComboBoxTipoDeActivo;
    @FXML
    public Button btnCalcular;
    @FXML
    public TableView<Activo> TblNomina;
    
    public ObservableList <Activo> Activos;
    ObservableList<String> Items = Items = FXCollections.observableArrayList("Edificio -> 20","Vehiculo -> 5","Maquinaria -> 8","Mobiliario -> 2","Equipo de Oficina -> 1");
    @FXML
    private TableColumn<Activo, String> tblNombre;
  
    public static int Colums;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Colums = TblNomina.getColumns().size();
        TableColumn <Map, String> firstNameColumn = new TableColumn <> ("firstName");
        ComboBoxTipoDeActivo.setItems(Items);
        Activos = FXCollections.observableArrayList();
        tblNombre.setCellValueFactory(new PropertyValueFactory("Nombre"));
        TblNomina.setItems(Activos);
    }    

    @FXML
    public void btnCalcularAction(ActionEvent event) {
//        String Nombre, tipo;
//        float ValorA, ValorS;
//        
//        Nombre = txtNombre.getText();
//        ValorA = Float.parseFloat(txtValorActivo.getText());
//        tipo = ComboBoxTipoDeActivo.getValue().toString();
//        ValorS = Float.parseFloat(txtValorSalvamento.toString());
        
          switch(ComboBoxTipoDeActivo.getValue().toString()){
              case "Edificio -> 20":
                  if
          }
    }
    
}
