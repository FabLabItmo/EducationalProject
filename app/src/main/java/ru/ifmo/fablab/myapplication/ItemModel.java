package ru.ifmo.fablab.myapplication;

import java.util.regex.Pattern;

/**
 * Created by mlebedev on 25/11/2017.
 */

public class ItemModel {
    public static Pattern IMAGE_PATTERN = Pattern.compile("^https?://(?:[a-z0-9\\-]+\\.)+[a-z]{2,6}(?:/[^/#?]+)+\\.(?:jpg|gif|png)$");

    public final String url;

    public ItemModel(String url) {
        this.url = url;
    }

}
