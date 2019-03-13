package com.abdelazim.x.aqark.home.presenter;

import com.abdelazim.x.aqark.home.HomeContract;
import com.abdelazim.x.aqark.home.model.HomeModel;

public class HomePresenter {

    private HomeModel homeModel;
    private HomeContract.View view;

    public HomePresenter(HomeContract.View view) {

        this.view = view;
        homeModel = new HomeModel();
    }

    public void searchButtonClicked(String searchTerm) {

        String searchData = homeModel.getDataFromRepo(searchTerm);
        view.displayData(searchData);
    }
}
