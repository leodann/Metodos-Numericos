package Database.Model.Dao;

import Database.Model.IteracionBisec;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class IteracionBisecDAO
{
    ObservableList<ArrayList> Data = FXCollections.observableArrayList();

    public void initData(ArrayList<IteracionBisec> arrayList)
    {
        Data.add(arrayList);
    }

    public IteracionBisecDAO(ArrayList<IteracionBisec> arrayList) {
        initData(arrayList);
    }

    public ObservableList<ArrayList> getData() {
        return Data;
    }


}
