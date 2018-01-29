package com.example.administrator.weather.gson;

import com.google.gson.annotations.SerializedName;

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }

    @SerializedName("wind")
    public Wind wind;
    public class Wind {
        @SerializedName("dir")
        public String info;
        @SerializedName("sc")
        public String info1;
    }
}
