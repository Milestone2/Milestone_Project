package fr.emmanuelroodlyyahoo.milestone.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import fr.emmanuelroodlyyahoo.milestone.bluetooth.DeviceScanActivity;

/**
 * Created by Emmanuel Roodly on 22/08/2017.
 */

public class BluetoothFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i= new Intent(getContext(), DeviceScanActivity.class);
        startActivity(i);
    }
}
