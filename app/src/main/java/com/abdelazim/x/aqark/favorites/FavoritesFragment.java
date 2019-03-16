package com.abdelazim.x.aqark.favorites;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.abdelazim.x.aqark.R;
import com.abdelazim.x.aqark.favorites.model.ApartmentDetails;
import com.abdelazim.x.aqark.favorites.model.ApartmentDetailsAdapter;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class FavoritesFragment extends Fragment {
    RecyclerView favouriteRecyclerView;
    ApartmentDetailsAdapter apartmentDetailsAdapter;
    List<ApartmentDetails> apartmentDetailsList;

    public FavoritesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_favourites, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        retrieveFavorites();
        favouriteRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        favouriteRecyclerView.setHasFixedSize(true);
        favouriteRecyclerView.setAdapter(apartmentDetailsAdapter);
    }

    private void retrieveFavorites() {
        //temporary cause there is no data source.
        apartmentDetailsList=apartmentDetailsAdapter.getApartmentDetailsList();

        apartmentDetailsAdapter.notifyDataSetChanged();
        apartmentDetailsAdapter.setApartmentDetailsList(apartmentDetailsList);
    }


    private void initViews(View view) {
        favouriteRecyclerView = view.findViewById(R.id.favouritesRecyclerView);
        apartmentDetailsAdapter= new ApartmentDetailsAdapter();
    }
}
