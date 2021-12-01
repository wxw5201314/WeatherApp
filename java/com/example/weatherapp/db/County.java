package com.example.weatherapp.db;

import org.litepal.annotation.Column;

public class County {
    @Column(unique = true)
    private int id;
    @Column(index = true)
    private String countyName;
    @Column(index = true)
    private int weatherId;
    @Column(index = true)
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
