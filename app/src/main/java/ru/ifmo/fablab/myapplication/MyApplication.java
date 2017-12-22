package ru.ifmo.fablab.myapplication;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by mlebedev on 22/12/2017.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}
