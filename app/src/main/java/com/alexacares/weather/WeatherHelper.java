package com.alexacares.weather;

import com.alexacares.Constants;

public class WeatherHelper {

    private WeatherObserver observer;

    public WeatherHelper() {}

    public void register(WeatherObserver observer) {
        this.observer = observer;
    }

    public void get() {
        String url = Constants.ACCUWEATHER_API_GET_LOCATION_KEY
                .replace("?1", Constants.ACCUWEATHER_API_KEY)
                .replace("?2", Constants.ACCUWEATHER_CITY);

        observer.update(new Weather("", 0));
    }
}
