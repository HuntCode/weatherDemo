package com.example.weatherdemo.gson;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Now implements Serializable {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More implements Serializable {
        @SerializedName("txt")
        public String info;
    }
}
