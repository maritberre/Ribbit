package com.maritberre.ribbit;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by marit on 7/15/14.
 */
public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "lmzYXh9Yzq9jPUFgRS1s3ZuJ3Q6tT8THbxbtMyEt", "ZoN13tCAadmY9gGGIiqDLo8SxGt7vcv5JqQeHEmq");
    }
}