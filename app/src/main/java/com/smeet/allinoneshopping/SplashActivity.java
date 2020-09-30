package com.smeet.allinoneshopping;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class SplashActivity extends AppCompatActivity {


    private Button button;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }
    public void about(){
        com.smeet.allinoneshopping.AboutApp aboutApp = new com.smeet.allinoneshopping.AboutApp();
        aboutApp.show(getSupportFragmentManager(),"about app");
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case  R.id.item1:
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");

            intent.putExtra(Intent.EXTRA_TEXT,"https://play.googl.com/store/apps/details?id=com.smeet.allinoneshopping");
            startActivity(Intent.createChooser(intent,"Send to"));
            return true;
            case R.id.item2:
                about();
                return true;
            case R.id.item3:
                String url = "https://sleepy-dijkstra-3033c9.netlify.app/index.html";
                Intent openurl = new Intent(Intent.ACTION_VIEW);
                openurl.setData(Uri.parse(url));
                startActivity(openurl);
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        button = (Button) findViewById(R.id.button7);
        button1 = (Button) findViewById(R.id.button8);
        button2 = (Button) findViewById(R.id.button9);
        button3 = (Button) findViewById(R.id.button10);
        button4 = (Button) findViewById(R.id.button11);
        button5 = (Button) findViewById(R.id.button12);
        button6 = (Button) findViewById(R.id.button13);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SplashActivity.this, amazon.class);
                startActivity(intent);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(SplashActivity.this, flipkart.class);
                startActivity(intent1);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(SplashActivity.this, myntra.class);
                startActivity(intent2);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(SplashActivity.this, snapdeal.class);
                startActivity(intent3);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(SplashActivity.this, paytm.class);
                startActivity(intent3);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(SplashActivity.this, shopclue.class);
                startActivity(intent3);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(SplashActivity.this, eBay.class);
                startActivity(intent3);
            }
        });


        }
    }


