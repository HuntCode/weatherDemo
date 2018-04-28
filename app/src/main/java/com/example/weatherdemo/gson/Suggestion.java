package com.example.weatherdemo.gson;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Suggestion implements Serializable {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort implements Serializable {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash implements Serializable {
        @SerializedName("txt")
        public String info;
    }

    public class Sport implements Serializable {
        @SerializedName("txt")
        public String info;
    }
}
