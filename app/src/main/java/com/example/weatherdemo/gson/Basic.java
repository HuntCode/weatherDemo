package com.example.weatherdemo.gson;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Basic implements Serializable{
    @SerializedName("city") //Gson通过注解映射字段
    public String cityName;

    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update implements Serializable{
        @SerializedName("loc")
        public String updateTime;
    }
}
