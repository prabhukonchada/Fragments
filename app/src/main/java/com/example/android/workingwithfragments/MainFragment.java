package com.example.android.workingwithfragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class MainFragment extends Fragment {

    Button fragmentOne;
    Button fragmentTwo;
    Button fragmentThree;
    FragmentOne newFragmentOne;
    FragmentTwo newFragmentTwo;

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_main,container,false);

        fragmentOne = (Button)rootView.findViewById(R.id.fragmentOne);
        fragmentTwo = (Button)rootView.findViewById(R.id.fragmentTwo);
        fragmentThree = (Button)rootView.findViewById(R.id.fragmentThree);

        fragmentOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Test",Toast.LENGTH_LONG).show();
            }
        });

        return rootView;
    }


}
