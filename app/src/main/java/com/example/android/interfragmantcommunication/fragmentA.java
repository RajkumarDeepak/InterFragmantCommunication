package com.example.android.interfragmantcommunication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import org.jetbrains.annotations.Nullable;

/**
 * Created by Raushan on 10/19/2016.
 */



public class fragmentA extends Fragment implements View.OnClickListener{

    Button button;
    int counter=0;
    Communicator communicator;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        communicator= (Communicator)getActivity();
        button= (Button) getActivity().findViewById(R.id.button);
    }

    @Override
    public void onClick(View view) {

    }

    public int getCounter() {
        return counter++;
        Communicator.respond("The button was clicked" + counter + "times")
    }
}
