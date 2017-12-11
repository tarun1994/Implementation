package com.delaroystudios.javadevelopers.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by delaroy on 3/22/17.
 */
public class Item {

    @SerializedName("rank")
    @Expose
    private String rank;
    @SerializedName("flag")
    @Expose
    private String flag;
    @SerializedName("population")
    @Expose
    private String population;

    public Item(String rank, String flag, String population){
        this.rank = rank;
        this.flag = flag;
        this.population = population;
    }

    public String getRank(){
        return rank;
    }

    public void setRank(String rank){
        this.rank = rank;
    }

    public String getFlag(){
        return flag;
    }

    public void setFlag(String flag){
        this.flag = flag;
    }

    public String getPopulation(){
        return population;
    }

    public void setPopulation(String population){
        this.population = population;
    }
}
