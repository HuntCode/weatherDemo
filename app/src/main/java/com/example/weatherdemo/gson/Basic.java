package com.example.weatherdemo.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    @SerializedName("city") //Gson通过注解映射字段
    public String cityName;

    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
