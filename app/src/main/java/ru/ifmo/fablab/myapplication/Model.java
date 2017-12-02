package ru.ifmo.fablab.myapplication;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mlebedev on 25/11/2017.
 */

public class Model {
    public static Model getInstance() {
        return INSTANCE;
    }

    private final static Model INSTANCE = new Model();

    public final List<ItemModel> items  = new ArrayList<>();

    private Model(){
        items.add(new ItemModel("http://pngimg.com/uploads/mario/mario_PNG125.png"));
        items.add(new ItemModel("https://vignette.wikia.nocookie.net/fantendo/images/f/fa/Mario_NASASR.png"));
        items.add(new ItemModel("http://pngimg.com/uploads/mario/mario_PNG114.png"));
        items.add(new ItemModel("http://www.pngmart.com/files/2/Mario-PNG-Clipart.png"));
        items.add(new ItemModel("http://pngimg.com/uploads/mario/mario_PNG53.png"));
        items.add(new ItemModel("https://i.pinimg.com/736x/2b/46/d4/2b46d42cfc6070d3a41776bc2227f34b--mini-mario-mario-nintendo.jpg"));
    }

}
