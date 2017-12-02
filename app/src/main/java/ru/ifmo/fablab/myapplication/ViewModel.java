package ru.ifmo.fablab.myapplication;

import java.util.List;

/**
 * Created by mlebedev on 04/11/2017.
 */

public class ViewModel {

    public List<ItemModel> models = Model.getInstance().items;

}
