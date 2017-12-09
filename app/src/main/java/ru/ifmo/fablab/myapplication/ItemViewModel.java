package ru.ifmo.fablab.myapplication;

/**
 * Created by mlebedev on 02/12/2017.
 */

public class ItemViewModel {
    public ItemModel itemModel;

    ViewModel vm;

    public ItemViewModel(ItemModel itemModel, ViewModel vm) {
        this.itemModel = itemModel;
        this.vm = vm;
    }

    public void onClick(){

    }
}
