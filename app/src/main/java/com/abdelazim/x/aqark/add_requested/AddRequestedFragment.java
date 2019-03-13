package com.abdelazim.x.aqark.add_requested;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abdelazim.x.aqark.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddRequestedFragment extends Fragment {


    public AddRequestedFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_requested, container, false);
    }

}
