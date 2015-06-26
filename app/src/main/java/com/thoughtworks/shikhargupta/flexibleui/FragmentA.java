package com.thoughtworks.shikhargupta.flexibleui;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by shikhargupta on 25/06/15.
 */
public class FragmentA extends Fragment implements AdapterView.OnItemClickListener{


    ListView list;
    Communicator communicator;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_a ,container , false);
        list = (ListView) view.findViewById(R.id.listView);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity() , R.array.Names , android.R.layout.simple_list_item_1);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
        return view;
    }

    public void setCommunicator(Communicator comm ){
        this.communicator = comm;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        communicator.respond(position);
    }

    public interface Communicator{

        void respond(int index);
    }
}
