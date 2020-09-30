package com.smeet.allinoneshopping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        videoView = (VideoView)findViewById(R.id.videoView);

        Uri all =Uri.parse("android.resource://" + getPackageName() +"/" + R.raw.all);

        videoView.setVideoURI(all);

        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
              startActivity(new Intent(MainActivity.this,SplashActivity.class));
              finish();
            }
        });
        videoView.start();
    }
}