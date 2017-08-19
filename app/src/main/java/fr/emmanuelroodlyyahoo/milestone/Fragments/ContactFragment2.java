package fr.emmanuelroodlyyahoo.milestone.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import fr.emmanuelroodlyyahoo.milestone.Interface.ContactAdding;
import fr.emmanuelroodlyyahoo.milestone.Models.Contact;
import fr.emmanuelroodlyyahoo.milestone.R;
import fr.emmanuelroodlyyahoo.milestone.adapters.ContactAdapter2;

/**
 * Created by Emmanuel Roodly on 19/08/2017.
 */

public class ContactFragment2 extends Fragment implements ContactAdding{

    ArrayList<Contact> contacts;
    ContactAdapter2 c_Adapter;
    ListView lvContact;
    Contact contact;
    FloatingActionButton flAddContact;
    AddContact quickAdd;
    FragmentManager fm;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View racine_contact = inflater.inflate(R.layout.contact_ui2, container, false);
        contacts = new ArrayList<>();
        c_Adapter = new ContactAdapter2(getContext(), contacts);
        flAddContact = (FloatingActionButton) racine_contact.findViewById(R.id.floatingAddContact);
        lvContact = (ListView) racine_contact.findViewById(R.id.lvContact);
        fm = getFragmentManager();
        lvContact.setAdapter(c_Adapter);
        quickAdd = new AddContact();

        flAddContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quickAdd.show(fm, "Adding contact");
            }
        });

        contact = new Contact();

        populateContact();

        return racine_contact;
    }


    public  void populateContact(){

        for(int i = 0; i < 15; i++){
            contacts.add(contact);
        }
        c_Adapter.notifyDataSetChanged();
    }

    public void getValuesFromChild(String nom, String prenom, String email, int number1, int number2){

    }
}
