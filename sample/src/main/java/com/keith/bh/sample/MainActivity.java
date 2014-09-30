package com.keith.bh.sample;

import android.app.Activity;
import android.os.Bundle;
import com.keith.bh.BounceHud;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BounceHud hud = (BounceHud)findViewById(R.id.hud);
        hud.start();
    }
}
