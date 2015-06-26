package com.thoughtworks.shikhargupta.flexibleui;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;


public class MainActivity extends ActionBarActivity implements FragmentA.Communicator{

    FragmentA f1;
    FragmentB f2;
    FragmentManager manager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getFragmentManager();
        f1 = (FragmentA) manager.findFragmentById(R.id.fragment1);
        f1.setCommunicator(this);
    }


    @Override
    public void respond(int index) {

        f2 = (FragmentB) manager.findFragmentById(R.id.fragment2);
        if( f2 != null && f2.isVisible()){
            f2.changeData(index);
        }
        else{
            Intent intent = new Intent(this , AnotherActivity.class);
            intent.putExtra("index" , index);
            startActivity(intent);
        }
    }
}
