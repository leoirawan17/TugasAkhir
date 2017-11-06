package com.example.hikineet.tugasakhir;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by HikiNEET on 11/4/2017.
 */

public class ListFragment extends Fragment{

    ListView listView;
    View myView;
    String[] list = {"CPU","Motherboard","Ram","HDD","SSD","VGA","Colling Fan"};

    public ListFragment() {
        // Required empty public constructor
    }
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.list_layout, container , false);
        return myView;
    }
}
