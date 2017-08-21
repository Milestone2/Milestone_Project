package fr.emmanuelroodlyyahoo.milestone.Fragments;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.GooglePlayServicesAvailabilityException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.vision.text.Text;

import android.support.v4.app.FragmentManager;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

import fr.emmanuelroodlyyahoo.milestone.MenuActivity;
import fr.emmanuelroodlyyahoo.milestone.R;

import static android.os.Build.VERSION_CODES.O;
import static fr.emmanuelroodlyyahoo.milestone.R.id.map;
import static fr.emmanuelroodlyyahoo.milestone.R.id.mapView;

/**
 * Created by Emmanuel Roodly on 17/08/2017.
 */

public class LocalisationFragment extends Fragment implements OnMapReadyCallback{

    private Location currentBestLocation = null;
    TextView tvLongitude;
    TextView tvLatitude;
    GoogleMap map;
    MapView mapView;
    SupportMapFragment supportMapFragment;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View racine = inflater.inflate(R.layout.localisation_ui, container, false);
        tvLongitude = (TextView) racine.findViewById(R.id.tvLongitude);
        tvLatitude = (TextView) racine.findViewById(R.id.tvLatitude);
        mapView = (MapView) racine.findViewById(R.id.mapView);

        tvLongitude.setText(String.valueOf(151));
        tvLatitude.setText(String.valueOf(-34));


        mapView.onCreate(savedInstanceState);
        mapView.onResume();

        //Initialisation de la carte
        mapView.getMapAsync(this);
        MapsInitializer.initialize(this.getContext());



        return racine;
    }



    @Override
    public void onMapReady(GoogleMap googleMap) {

        this.map = googleMap;
        this.map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        LatLng sydney = new LatLng(-34, 151);
        this.map.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        this.map.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }


    @Override
    public void onResume() {
        mapView.onResume();
        super.onResume();
    }

    @Override
    public void onDestroy() {
        mapView.onDestroy();
        super.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }


    /*---------- Listener class to get coordinates ------------- */

}
