package NM.Controllers;

import NM.Metods.AproxFuncional;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import javax.swing.table.TableColumn;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class AproxFuncionalController implements Initializable {
    @FXML
    Label fcn, r;
    @FXML
    Button go, addx, addy;
    @FXML
    TextField xs, ys;

    double[] x ;/*= {10, 12.5, 17.5, 20, 50, 30};*/
    double[] y ;/*= {400, 500, 500, 600, 1500, 900};*/
    ArrayList<Double> arrx = new ArrayList<Double>();
    ArrayList<Double> arry = new ArrayList<Double>();



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        addx.setOnAction(handler);
        go.setOnAction(handler );
        addy.setOnAction(handler);
    }

    EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            if(event.getSource()==go){
                initResults();
            }
            if (event.getSource()==addx){
                addx(arrx);
            }
            if (event.getSource()==addy){
                addy(arry);
            }
        }
    };

    public void initResults(){
        AproxFuncional aproxFuncional = new AproxFuncional(x.length, x,y);
        fcn.setText("y = "+ aproxFuncional.getA0()+" + "+aproxFuncional.getA1()+"x");
        r.setText("r = "+aproxFuncional.getR());
    }

    public double[] addx(ArrayList<Double> list){
        double aux = Double.parseDouble(xs.getText());
        list.add(aux);
        x = new double[list.size()];
        for(int i = 0; i<list.size(); i++){
            x[i] = list.get(i);
            System.out.println("X");
            System.out.println(x[i]);
        }
        return x;
    }

    public double[] addy(ArrayList<Double> list){
        double aux = Double.parseDouble(ys.getText());
        list.add(aux);
        y = new double[list.size()];
        for(int i = 0; i<list.size(); i++){
           y[i] = list.get(i);
            System.out.println("Y");
            System.out.println(y[i]);
        }
        return y;
    }
}
