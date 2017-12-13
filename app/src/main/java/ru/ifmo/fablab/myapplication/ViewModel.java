package ru.ifmo.fablab.myapplication;

import android.databinding.ObservableArrayList;

import me.tatarka.bindingcollectionadapter2.ItemBinding;

/**
 * Created by mlebedev on 04/11/2017.
 */

public class ViewModel implements ItemSelectionListener{

    public ObservableArrayList<ItemViewModel> models = new ObservableArrayList<>();

    public ItemBinding<ItemViewModel> itemBinding = ItemBinding.of(BR.item,R.layout.item_layout);

    ItemSelectionListener itemSelectionListener;

    public ViewModel(ItemSelectionListener itemSelectionListener) {
        this.itemSelectionListener = itemSelectionListener;
        for(ItemModel itemModel : Model.getInstance().items){
            models.add(new ItemViewModel(itemModel,this));
        }
    }

    @Override
    public void onItemSelected(ItemModel item) {
        itemSelectionListener.onItemSelected(item);
    }
}
