package fr.emmanuelroodlyyahoo.milestone.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import fr.emmanuelroodlyyahoo.milestone.R;

/**
 * Created by Emmanuel Roodly on 19/08/2017.
 */

public class AddContact extends DialogFragment {

    FragmentManager fm;
    EditText etName;
    EditText etPrenom;
    EditText etEmail;
    EditText etNumber1;
    EditText etNumber2;
    Button btSave;
    Button btCancel;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View racine_addC = inflater.inflate(R.layout.dialog_add_contact, null);

        fm = getFragmentManager();
        etName = (EditText) racine_addC.findViewById(R.id.etName);
        etPrenom = (EditText) racine_addC.findViewById(R.id.etPrenom);
        etEmail = (EditText) racine_addC.findViewById(R.id.etEmail);
        etNumber1 = (EditText) racine_addC.findViewById(R.id.etNumber1);
        etNumber2 = (EditText) racine_addC.findViewById(R.id.etNumber2);
        btSave = (Button) racine_addC.findViewById(R.id.btSaveContact);
        btCancel = (Button) racine_addC.findViewById(R.id.btCancel);

        btCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
            }
        });

        return  racine_addC;
    }
}
