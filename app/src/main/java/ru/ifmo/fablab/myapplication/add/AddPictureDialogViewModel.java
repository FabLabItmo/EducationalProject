package ru.ifmo.fablab.myapplication.add;

import android.databinding.ObservableField;

import ru.ifmo.fablab.myapplication.ItemModel;
import ru.ifmo.fablab.myapplication.Model;

/**
 * Created by mlebedev on 22/12/2017.
 */

public class AddPictureDialogViewModel {

    public ObservableField<String> url = new ObservableField<>();

    public ObservableField<String> errorText = new ObservableField<>();

    public void onSaveClick(){
        if (ItemModel.IMAGE_PATTERN.matcher(url.get()).find()){
            Model.getInstance().addPicture(url.get());
            errorText.set(null);
        }else{
            errorText.set("Ill-formed URL");
        }
    }
}
