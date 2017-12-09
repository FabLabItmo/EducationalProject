package ru.ifmo.fablab.myapplication;

import android.databinding.ObservableArrayList;

import me.tatarka.bindingcollectionadapter2.ItemBinding;

/**
 * Created by mlebedev on 04/11/2017.
 */

public class ViewModel {

    public ObservableArrayList<ItemViewModel> models = new ObservableArrayList<>();

    public ItemBinding<ItemViewModel> itemBinding = ItemBinding.of(BR.item,R.layout.item_layout);

    public ViewModel() {
        for(ItemModel itemModel : Model.getInstance().items){
            models.add(new ItemViewModel(itemModel,this));
        }
    }

    public void delete(ItemViewModel item){
        models.remove(item);
    }
}
