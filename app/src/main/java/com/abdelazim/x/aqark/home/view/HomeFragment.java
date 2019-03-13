package com.abdelazim.x.aqark.home.view;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.abdelazim.x.aqark.R;
import com.abdelazim.x.aqark.home.HomeContract;
import com.abdelazim.x.aqark.home.presenter.HomePresenter;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener, HomeContract.View {

    private EditText searchEt;
    private ImageButton searchIb;
    private TextView dataTv;
    private HomePresenter homePresenter;


    public HomeFragment() {
        // Required empty public constructor
        homePresenter = new HomePresenter(this);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initView(view);
    }

    void initView(View view) {

        searchEt = view.findViewById(R.id.search_et);
        searchIb = view.findViewById(R.id.search_ib);
        dataTv = view.findViewById(R.id.data_tv);

        searchIb.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.search_ib:
                String searchTerm = searchEt.getText().toString();
                homePresenter.searchButtonClicked(searchTerm);
                break;
        }
    }

    @Override
    public void displayData(String searchData) {

        dataTv.setText(searchData);
    }
}
