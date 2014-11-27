package com.krswag.sling;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;


public class ParseApplication extends Application
{

    @Override
    public void onCreate()
    {
        super.onCreate();

        // Add your initialization code here
        Parse.initialize( this,
            "b9huMB0lIKIFsugN46zCrc96S3Od42rQoBA8WJNv",
            "9mgtB5BkgPWDzCMNaKj63PpDvnvxATQn3sVyIYrZ" );

        ParseUser.enableAutomaticUser();
        ParseACL defaultACL = new ParseACL();

        // If you would like all objects to be private by default, remove this
        // line.
        defaultACL.setPublicReadAccess( true );

        ParseACL.setDefaultACL( defaultACL, true );
    }
}
