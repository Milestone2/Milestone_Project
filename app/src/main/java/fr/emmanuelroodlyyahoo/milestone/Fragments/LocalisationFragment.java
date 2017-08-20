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

import fr.emmanuelroodlyyahoo.milestone.R;

import static fr.emmanuelroodlyyahoo.milestone.R.id.map;

/**
 * Created by Emmanuel Roodly on 17/08/2017.
 */

public class LocalisationFragment extends Fragment implements OnMapReadyCallback{

    private Location currentBestLocation = null;
    TextView tvLongitude;
    TextView tvLatitude;
    GoogleMap mMap;
    MapFragment mapFragment;
    SupportMapFragment supportMapFragment;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View racine = inflater.inflate(R.layout.localisation_ui, container, false);
        tvLongitude = (TextView) racine.findViewById(R.id.tvLongitude);
        tvLatitude = (TextView) racine.findViewById(R.id.tvLatitude);

        //FragmentManager fragmentManager = getFragmentManager();

       //mapFragment = (MapFragment) getTargetFragment().findFragmentById(R.id.map);
        //mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.map);
        //mMap = ((MapFragment) fragmentManager.findFragmentById(R.id.map)).getMapAsync();

        //mapFragment.getMapAsync(this);



        return racine;
    }



    @Override
    public void onMapReady(final GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }


    /*---------- Listener class to get coordinates ------------- */

}
