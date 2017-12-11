package com.delaroystudios.javadevelopers.api;

import com.delaroystudios.javadevelopers.model.ItemResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by delaroy on 3/22/17.
 */
public interface Service {
    @GET("/tutorial/jsonparsetutorial.txt")
    Call<ItemResponse> getItems();
}
