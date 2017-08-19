package fr.emmanuelroodlyyahoo.milestone.Fragments;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import fr.emmanuelroodlyyahoo.milestone.R;

/**
 * Created by Emmanuel Roodly on 17/08/2017.
 */

public class StatusFragment extends Fragment {

    TextView tvHeartInfo;
    TextView tvLungInfo;
    TextView tvTempInfo;
    FloatingActionButton floatingHeart;
    FloatingActionButton floatingLung;
    FloatingActionButton floatingTemp;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View racine_status = inflater.inflate(R.layout.status_ui, container, false);
        tvHeartInfo = (TextView) racine_status.findViewById(R.id.tvHeartInfo);
        tvLungInfo = (TextView) racine_status.findViewById(R.id.tvLungInfo);
        tvTempInfo = (TextView) racine_status.findViewById(R.id.tvTempInfo);
        floatingHeart = (FloatingActionButton) racine_status.findViewById(R.id.floatingHeart);
        floatingLung = (FloatingActionButton) racine_status.findViewById(R.id.floatingLung);
        floatingTemp = (FloatingActionButton) racine_status.findViewById(R.id.floatingTemp);

        return racine_status;
    }

    public static StatusFragment newInstance(){
        StatusFragment statusFragment = new StatusFragment();
        Bundle args = new Bundle();
        statusFragment.setArguments(args);
        return statusFragment;
    }
}
