package com.example.weatherdemo.gson;

import java.io.Serializable;

public class AQI implements Serializable {
    public AQICity city;

    public class AQICity implements Serializable {
        public String aqi;
        public String pm25;
    }
}
