package NM.Controllers;

import NM.Metods.InterpolaciónCuadratica;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;


public class InterpolaciónCuadController implements Initializable {
    @FXML
    Label lblx0, lblx1,lblx2,lblf0,lblf1,lblf2,lblres;
    @FXML
    Button btnGo;
    @FXML
    TextField tfFx,tfx,tfx0,tfx1,tfx2;

    private InterpolaciónCuadratica i;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btnGo();
        btnGo.setOnAction(
                e-> Build_i()
        );

    }

    private void btnGo(){
        if(tfx.getText() == null && tfx0.getText() == null && tfx1.getText() == null &&
                tfx2.getText() == null && tfFx.getText() == null ){
            btnGo.setDisable(true);
        }else{btnGo.setDisable(false);}
    }

    private void Build_i(){
        double x = Double.parseDouble(tfx.getText());
        double x0 = Double.parseDouble(tfx0.getText());
        double x1 = Double.parseDouble(tfx1.getText());
        double x2 = Double.parseDouble(tfx2.getText());
        String fx = "f(x) = " + tfFx.getText();

        i = new InterpolaciónCuadratica(fx,x,x0,x1,x2);
        setlbls();
    }

    private void setlbls(){
        lblx0.setText(""+i.getX_0());  lblf0.setText(""+i.getF_0());
        lblx1.setText(""+i.getX_1());  lblf1.setText(""+i.getF_1());
        lblx2.setText(""+i.getX_2());  lblf2.setText(""+i.getF_2());
        lblres.setText(""+i.getRes());
    }
}
