package com.alexacares;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import com.alexacares.weather.Weather;
import com.alexacares.weather.WeatherObserver;

public class MainActivity extends AppCompatActivity implements WeatherObserver {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initToolbar();
    }

    /**
     * Quita la Toolbar de Android por defecto y el mensaje
     */
    private void initToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }
    }

    @Override
    public void update(Weather weather) {

    }
}
