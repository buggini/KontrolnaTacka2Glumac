package com.example.fearpally.kontrolnatacka2.fragments;

import android.app.Activity;
import android.app.Fragment;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fearpally.kontrolnatacka2.R;
import com.example.fearpally.kontrolnatacka2.model.Filmovi;
import com.example.fearpally.kontrolnatacka2.model.Glumac;
import com.example.fearpally.kontrolnatacka2.provaders.FilmoviProvider;
import com.example.fearpally.kontrolnatacka2.provaders.GlumacProvider;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class DetailFragment extends Fragment{

    private int position = 0;

    @Override
    public void onAttach(Activity activity) {

        super.onAttach(activity);

        Toast.makeText(getActivity(), "DetailFragment.onAttach()", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        Toast.makeText(getActivity(), "DetailFragment.onCreate()", Toast.LENGTH_SHORT).show();

        if (savedInstanceState != null) {
            position = savedInstanceState.getInt("position");
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        super.onCreateView(inflater, container, savedInstanceState);

        // Shows a toast message (a pop-up message)
        Toast.makeText(getActivity(), "DetailFragment.onCreateView()", Toast.LENGTH_SHORT).show();

        // Finds view in the view hierarchy and returns it.
        return inflater.inflate(R.layout.fragment_detail, container, false);
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);

        // Shows a toast message (a pop-up message)
        Toast.makeText(getActivity(), "DetailFragment.onActivityCreated()", Toast.LENGTH_SHORT).show();

        if (savedInstanceState != null) {
            position = savedInstanceState.getInt("position", 0);
        }

        // Finds "tvName" TextView and sets "text" property
        ImageView ivImage = (ImageView) getView().findViewById(R.id.iv_image);
        InputStream is = null;
        try {
            is = getActivity().getAssets().open(GlumacProvider.getGlumacById(position).getFotografija());
            Drawable drawable = Drawable.createFromStream(is, null);
            ivImage.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }
        TextView tvName = (TextView) getView().findViewById(R.id.tv_ime);
        tvName.setText(GlumacProvider.getGlumacById(position).getIme());

        TextView tvPrezime = (TextView) getView().findViewById(R.id.tv_prezime);
        tvPrezime.setText(GlumacProvider.getGlumacById(position).getPrezime());


        TextView tvBiografija = (TextView) getView().findViewById(R.id.tv_biografija);
        tvBiografija.setText(GlumacProvider.getGlumacById(position).getBiografija());

        TextView DatumRodj = (TextView) getView().findViewById(R.id.tv_Datum_rodjnenja);
        String datumStr = String.valueOf(GlumacProvider.getGlumacById(position).getDatumRodjenja());
        DatumRodj.setText(datumStr);

        TextView DatumSmr = (TextView) getView().findViewById(R.id.tv_Datum_smrti_rodjnenja);
        String datumSmrStr = String.valueOf(GlumacProvider.getGlumacById(position).getDatumSmrti());
        DatumSmr.setText(datumSmrStr);


        // Finds "rbRating" RatingBar and sets "rating" property
        RatingBar rbRating = (RatingBar) getView().findViewById(R.id.rb_rating);
        rbRating.setRating(GlumacProvider.getGlumacById(position).getRating());


        // Finds "spCategory" Spiner and sets "selection" property
        Spinner category = (Spinner) getView().findViewById(R.id.sp_filmovi);
        List<Filmovi> katogrijaNames = FilmoviProvider.getFilm();
        ArrayAdapter<String> adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_item, katogrijaNames);
        category.setAdapter(adapter);
        category.setSelection((int) GlumacProvider.getGlumacById(position).getFilmovi().getId());
    }
    @Override
    public void onStart() {
        super.onStart();

        // Shows a toast message (a pop-up message)
        Toast.makeText(getActivity(), "DetailFragment.onStart()", Toast.LENGTH_SHORT).show();
    }

    // onResume method is a life-cycle method that is called when the fragment is visible to the user and actively running.
    @Override
    public void onResume() {
        super.onResume();

        // Shows a toast message (a pop-up message)
        Toast.makeText(getActivity(), "DetailFragment.onResume()", Toast.LENGTH_SHORT).show();
    }

    // onPause method is a life-cycle method that is called when the Fragment is no longer resumed.
    @Override
    public void onPause() {
        super.onPause();

        // Shows a toast message (a pop-up message)
        Toast.makeText(getActivity(), "DetailFragment.onPause()", Toast.LENGTH_SHORT).show();
    }

    // onStop method is a life-cycle method that is called when the Fragment is no longer started.
    @Override
    public void onStop() {
        super.onStop();

        // Shows a toast message (a pop-up message)
        Toast.makeText(getActivity(), "DetailFragment.onStop()", Toast.LENGTH_SHORT).show();
    }

    // onDestroyView method is a life-cycle method that is called when the view previously created by onCreateView(LayoutInflater, ViewGroup, Bundle) has been detached from the fragment.
    @Override
    public void onDestroyView() {

        super.onDestroyView();

        // Shows a toast message (a pop-up message)
        Toast.makeText(getActivity(), "DetailFragment.onDestroyView()", Toast.LENGTH_SHORT).show();
    }

    // onDestroy method is a life-cycle method that is called when the fragment is no longer in use.
    @Override
    public void onDestroy() {
        super.onDestroy();

        // Shows a toast message (a pop-up message)
        Toast.makeText(getActivity(), "DetailFragment.onDestroy()", Toast.LENGTH_SHORT).show();
    }

    // onDetach method is a life-cycle method that is called when the fragment is no longer attached to its activity.
    @Override
    public void onDetach() {
        super.onDetach();

        // Shows a toast message (a pop-up message)
        Toast.makeText(getActivity(), "DetailFragment.onDetach()", Toast.LENGTH_SHORT).show();
    }

    // onSaveInstanceState method is a life-cycle method that is called to ask the fragment to save its current dynamic state, so it can later be reconstructed in a new instance of its process is restarted.
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {

        super.onSaveInstanceState(savedInstanceState);

        // Shows a toast message (a pop-up message)
        Toast.makeText(getActivity(), "DetailFragment.onSaveInstanceState()", Toast.LENGTH_SHORT).show();

        savedInstanceState.putInt("position", position);
    }
    public void setContent(final int position) {

        this.position = position;

        Log.v("DetailFragment", "setContent() sets position to " + position);
    }

    // Called to update fragment's content.
    public void updateContent(final int position) {

        this.position = position;

        Log.v("DetailFragment", "updateContent() sets position to " + position);

        // Finds "tvName" TextView and sets "text" property
        ImageView ivImage = (ImageView) getView().findViewById(R.id.iv_image);
        InputStream is = null;
        try {
            is = getActivity().getAssets().open(GlumacProvider.getGlumacById(position).getFotografija());
            Drawable drawable = Drawable.createFromStream(is, null);
            ivImage.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }
        TextView tvName = (TextView) getView().findViewById(R.id.tv_ime);
        tvName.setText(GlumacProvider.getGlumacById(position).getIme());

        TextView tvPrezime = (TextView) getView().findViewById(R.id.tv_prezime);
        tvPrezime.setText(GlumacProvider.getGlumacById(position).getPrezime());


        TextView tvBiografija = (TextView) getView().findViewById(R.id.tv_biografija);
        tvBiografija.setText(GlumacProvider.getGlumacById(position).getBiografija());

        TextView DatumRodj = (TextView) getView().findViewById(R.id.tv_Datum_rodjnenja);
        String datumStr = String.valueOf(GlumacProvider.getGlumacById(position).getDatumRodjenja());
        DatumRodj.setText(datumStr);

        TextView DatumSmr = (TextView) getView().findViewById(R.id.tv_Datum_smrti_rodjnenja);
        String datumSmrStr = String.valueOf(GlumacProvider.getGlumacById(position).getDatumSmrti());
        DatumSmr.setText(datumSmrStr);


        // Finds "rbRating" RatingBar and sets "rating" property
        RatingBar rbRating = (RatingBar) getView().findViewById(R.id.rb_rating);
        rbRating.setRating(GlumacProvider.getGlumacById(position).getRating());


        // Finds "spCategory" Spiner and sets "selection" property
        Spinner category = (Spinner) getView().findViewById(R.id.sp_filmovi);
        List<String> katogrijaNames = FilmoviProvider.getFilmNames();
        ArrayAdapter<String> adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_item, katogrijaNames);
        category.setAdapter(adapter);
        category.setSelection((int) GlumacProvider.getGlumacById(position).getFilmovi().getId());

    }
}

