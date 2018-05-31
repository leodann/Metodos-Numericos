package NM.Controllers;

import NM.Metods.Interpolacion;
import NM.Metods.InterpolaciónCuadratica;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class InterpolacionController implements Initializable {
    @FXML
    Label lblx0,lblx1 ,lblf0,lblf1,lblres,lblerror;
    @FXML
    Button btnGo;
    @FXML
    TextField tfFx,tfx,tfx0,tfx1;

    private Interpolacion i;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btnGo();
        btnGo.setOnAction(
                e-> Build_i()
        );

    }

    private void btnGo(){
        if(tfx.getText() == null && tfx0.getText() == null && tfx1.getText() == null
                && tfFx.getText() == null ){
            btnGo.setDisable(true);
        }else{btnGo.setDisable(false);}
    }

    private void Build_i(){
        double x = Double.parseDouble(tfx.getText());
        double x0 = Double.parseDouble(tfx0.getText());
        double x1 = Double.parseDouble(tfx1.getText());
        String fx = "f(x) = " + tfFx.getText();

        i = new Interpolacion(fx,x,x0,x1);
        setlbls();
    }

    private void setlbls(){
        lblx0.setText(""+i.getX0());  lblf0.setText(""+i.getF0());
        lblx1.setText(""+i.getX1());  lblf1.setText(""+i.getF1());
        lblres.setText(""+i.getRealfx());
        lblerror.setText(""+i.getError());
    }
}
