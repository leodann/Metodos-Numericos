package NM.Controllers;

import NM.Metods.InterpolLagrange;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LagrangeController implements Initializable {
    @FXML
    TextField txtX0,txtX1,txtX2,txtX3,txtX,txtPuntos,txtFX0,txtFx1,txtFx2,txtFx3;
    @FXML
    Button btnGo;
    @FXML
    Label lblres;
    private InterpolLagrange l;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        btnGo.setOnAction(
                e -> initLagrnage()
        );
    }

    private void initLagrnage(){
        double x0 = Double.parseDouble(txtX0.getText());
        double x1 = Double.parseDouble(txtX1.getText());
        double x2 = Double.parseDouble(txtX2.getText());
        double x3 = Double.parseDouble(txtX3.getText());
        double x = Double.parseDouble(txtX.getText());

        double fx0 = Double.parseDouble(txtFX0.getText());
        double fx1 = Double.parseDouble(txtFx1.getText());
        double fx2 = Double.parseDouble(txtFx2.getText());
        double fx3 = Double.parseDouble(txtFx3.getText());

        int pts = Integer.parseInt(txtPuntos.getText());

        if(pts ==2){
            l = new InterpolLagrange(x0,fx0,x1,fx1,x);
            lblres.setText(""+l.getY());
        }
        if(pts ==3){
            l = new InterpolLagrange(x0,fx0,x1,fx1,x2,fx2,x);
            lblres.setText(""+l.getY());
        }

        if(pts ==4){
            l = new InterpolLagrange(x0,fx0,x1,fx1,x2,fx2,x3,fx3,x);
            lblres.setText(""+l.getY());
        }
    }
}
