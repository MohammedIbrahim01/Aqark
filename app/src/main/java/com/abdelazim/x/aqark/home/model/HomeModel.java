package com.abdelazim.x.aqark.home.model;

import com.abdelazim.x.aqark.repository.Repository;

public class HomeModel {

    private Repository repository;

    public HomeModel() {

        repository = new Repository();
    }

    public String getDataFromRepo(String searchTerm) {

        return repository.getData(searchTerm);
    }
}
