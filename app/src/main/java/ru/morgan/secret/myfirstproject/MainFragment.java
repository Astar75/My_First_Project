package ru.morgan.secret.myfirstproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainFragment extends Fragment {



    public static MainFragment newInstance(String param1, String param2) {
        MainFragment fragment = new MainFragment();
        // Bundle args = new Bundle();
        // fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // if (getArguments() != null) {
        //     mParam1 = getArguments().getString(ARG_PARAM1);
        //     mParam2 = getArguments().getString(ARG_PARAM2);
        // }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}