package com.example.weather;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends Activity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        Handler hd = new Handler();
        hd.postDelayed(new splashhandler(), 1500);
    }

    private class splashhandler implements Runnable{
        public void run(){
            startActivity(new Intent((getApplication()), MMainActivity.class));
            Splash.this.finish();
        }
    }

    public void onBackPressed(){
        //초반 플래시 화면에서 뒤로가기 버튼 불가능
    }
}
