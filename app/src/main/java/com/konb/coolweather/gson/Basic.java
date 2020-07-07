package com.konb.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public update update;
    public class update {
        @SerializedName("loc")
        public String updateTime;
    }
}
