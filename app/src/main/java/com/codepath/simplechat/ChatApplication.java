package com.codepath.simplechat;

import com.parse.Parse;
import com.parse.interceptors.ParseLogInterceptor;

import android.app.Application;

public class ChatApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // set applicationId and server based on the values in the Heroku settings.
        // any network interceptors must be added with the Configuration Builder given this syntax
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("93bd0b59a90d46b1999e484431b83f41") // should correspond to APP_ID env variable
                .addNetworkInterceptor(new ParseLogInterceptor())
                .server("https://simplechatclient.herokuapp.com/parse/").build());
    }
}