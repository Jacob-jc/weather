package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;


public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public String  more;

    @SerializedName("txt")
    public String ee;

    public class Moree {
        @SerializedName("txt")
        public String info;

    }

}
