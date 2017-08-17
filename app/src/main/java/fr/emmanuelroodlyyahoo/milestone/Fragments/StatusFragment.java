package fr.emmanuelroodlyyahoo.milestone.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fr.emmanuelroodlyyahoo.milestone.R;

/**
 * Created by Emmanuel Roodly on 17/08/2017.
 */

public class StatusFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.status_ui, container, false);
    }
}
