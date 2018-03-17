package Database.Model.Dao;

import Database.Model.IteracionBisec;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class IteracionBisecDAO
{
    ObservableList<IteracionBisec> Data = FXCollections.observableArrayList();

    public void initData(ArrayList<IteracionBisec> arrayList)
    {
        for(int i=0; i<=arrayList.size() ; i++  )
        Data.add(arrayList.get(i));
    }

    public IteracionBisecDAO(ArrayList<IteracionBisec> arrayList) {
        initData(arrayList);
    }

    public ObservableList<IteracionBisec> getData() {
        return Data;
    }


}
