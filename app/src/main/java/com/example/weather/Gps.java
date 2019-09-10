package com.example.weather;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Spinner;

public class Gps extends AppCompatActivity {
        private Location lastKnownLocation = null ;
    private Spinner spinnerLocationProvider = null ;
        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            spinnerLocationProvider = (Spinner)findViewById(R.id.spinnerLocationProvider );
            super.onCreate(savedInstanceState);
            setContentView(R.layout.gps);
        }

        LocationListener locationListener = new LocationListener() {

            @Override
            public void onLocationChanged(Location location) {
                LocationManager lm = (LocationManager)getSystemService(Context.LOCATION_SERVICE);
                lastKnownLocation = location;
                lm.removeUpdates(locationListener);

            }


            @Override
            public void onStatusChanged(String provider, int status, Bundle extras) {

            }

            @Override
            public void onProviderEnabled(String provider) {

            }

            @Override
            public void onProviderDisabled(String provider) {

            }
        };
}
