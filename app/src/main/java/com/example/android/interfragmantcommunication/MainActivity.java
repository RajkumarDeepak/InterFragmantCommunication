package com.example.android.interfragmantcommunication;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity implements Communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void respond(String data) {
        android.app.FragmentManager manager = getFragmentManager();
        android.app.fragmentB f2 = (fragmentB) manager.findFragmentById(R.id.fragment2);
        f2.changeText(data);

    }
}
