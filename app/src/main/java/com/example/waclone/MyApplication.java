package com.example.waclone;

import android.app.Application;

import java.util.ArrayList;

public class MyApplication extends Application {

    public static ArrayList<Chat> chatsList;

    @Override
    public void onCreate() {
        super.onCreate();
        chatsList = new ArrayList<>();
        chatsList.add(new Chat("Kashif","","Hi","2:20 AM"));
        chatsList.add(new Chat("Kashaf","","There?","2:20 PM"));
        chatsList.add(new Chat("Kasha","","Go to hell","8:20 AM"));
        chatsList.add(new Chat("Kashan","","Good night","2:40 AM"));

    }
}
