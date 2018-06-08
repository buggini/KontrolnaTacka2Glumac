package com.example.fearpally.kontrolnatacka2.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fearpally.kontrolnatacka2.R;
import com.example.fearpally.kontrolnatacka2.adapters.GlumacAdapter;
import com.example.fearpally.kontrolnatacka2.provaders.GlumacProvider;

import java.util.List;

public class MasterFragment extends Fragment{

    OnItemSelectedListener listener;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);


        // Loads glumaca from array resource
        final List<String> glumacNames = GlumacProvider.getGlumacNames();

        // Creates an Adapter for fruits
        GlumacAdapter dataAdapter = new GlumacAdapter((OnItemSelectedListener) getActivity(), glumacNames);
        RecyclerView listView = (RecyclerView) getActivity().findViewById(R.id.listofGlumac);
        // Set layout manager
        listView.setLayoutManager(new LinearLayoutManager(getActivity()));
        // Assigns Adapter to RecycleView
        listView.setAdapter(dataAdapter);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Shows a toast message (a pop-up message)
        //Toast.makeText(getActivity(), "MasterFragment.onCreateView()", Toast.LENGTH_SHORT).show();

        if (container == null) {
            return null;
        }

        View view = inflater.inflate(R.layout.fragment_master, container, false);

        return view;
    }
    @Override
    public void onAttach(Activity activity) {

        super.onAttach(activity);

        // Shows a toast message (a pop-up message)
        //Toast.makeText(getActivity(), "MasterFragment.onAttach()", Toast.LENGTH_SHORT).show();

        try {
            listener = (OnItemSelectedListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement OnItemSelectedListener");
        }
    }
    public interface OnItemSelectedListener {

        public void onItemSelected(int position);
    }
}
