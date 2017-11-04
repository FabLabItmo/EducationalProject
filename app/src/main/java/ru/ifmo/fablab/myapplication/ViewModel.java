package ru.ifmo.fablab.myapplication;

/**
 * Created by mlebedev on 04/11/2017.
 */

public class ViewModel {

    private String url;

    public ViewModel(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
