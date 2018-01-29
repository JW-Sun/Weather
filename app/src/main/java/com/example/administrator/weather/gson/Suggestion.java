package com.example.administrator.weather.gson;

import com.google.gson.annotations.SerializedName;

public class Suggestion {
    @SerializedName("air")
    public Air air;

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {

        @SerializedName("txt")
        public String info;

    }

    public class CarWash {

        @SerializedName("txt")
        public String info;

    }

    public class Sport {

        @SerializedName("txt")
        public String info;

    }

    public class Air {
        @SerializedName("txt")
        public String info;
    }
}
