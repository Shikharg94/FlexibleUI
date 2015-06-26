package com.thoughtworks.shikhargupta.flexibleui;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by shikhargupta on 25/06/15.
 */
public class FragmentB extends Fragment {



    TextView text;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_b , container , false);
        text = (TextView) view.findViewById(R.id.textView);
        return view;
    }

    public void changeData(int data ){
        Resources res = getResources();
        String[] desc = res.getStringArray(R.array.Details);
        text.setText(desc[data]);
    }

}
