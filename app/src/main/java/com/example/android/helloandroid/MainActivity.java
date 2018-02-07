package com.example.android.helloandroid;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    String udacityYouTube_Url = "https://www.youtube.com/user/Udacity";
    String udacityGooglePlus_Url = "https://plus.google.com/+Udacity";
    String udacityMedium_Url = "https://medium.com/udacity";
    String udacityTwitter_Url = "https://twitter.com/udacity";
    String udacityInstagram_Url = "https://www.instagram.com/udacity/";
    String udacityFacebook_Url = "https://www.facebook.com/Udacity";
    String udacityLinkeIn_url = "https://www.linkedin.com/school/udacity/";






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_main);

        ImageView officePhotos = (ImageView) findViewById(R.id.office_photos_transition);
        officePhotos.setBackgroundResource(R.drawable.office_photos_transition);

        AnimationDrawable officePhotosTransition = (AnimationDrawable) officePhotos.getBackground();
        officePhotosTransition.start();


    }

    public void udacityYouTube (View view)
    {
        Uri uriUrl = Uri.parse(udacityYouTube_Url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);

    }


    public void udactiyGooglePlus (View view)
    {
        Uri uriUrl = Uri.parse(udacityGooglePlus_Url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);

    }

    public void udacityMedium (View view)
    {
        Uri uriUrl = Uri.parse(udacityMedium_Url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);

    }

    public void udacityTwitter (View view)
    {
        Uri uriUrl = Uri.parse(udacityTwitter_Url);
        Intent launchBrowser = new Intent (Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);

    }

    public void udacityInstagram (View view)
    {
        Uri uriUrl = Uri.parse(udacityInstagram_Url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);

    }

    public void udacityFacebook (View view)
    {
        Uri uriUrl = Uri.parse(udacityFacebook_Url);
        Intent launcBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launcBrowser);

    }

    public void udacityLinkedIn (View view)
    {
        Uri uriUrl = Uri.parse(udacityLinkeIn_url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);

    }












}
