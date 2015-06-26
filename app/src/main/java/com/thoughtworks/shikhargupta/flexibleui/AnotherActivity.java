package com.thoughtworks.shikhargupta.flexibleui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by shikhargupta on 25/06/15.
 */
public class AnotherActivity extends ActionBarActivity{





    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        Intent intent = getIntent();
        int index = intent.getIntExtra("index", 0);
        FragmentB f2 = (FragmentB) getFragmentManager().findFragmentById(R.id.fragment2);
        if( f2 != null )
        f2.changeData(index);
    }
}
