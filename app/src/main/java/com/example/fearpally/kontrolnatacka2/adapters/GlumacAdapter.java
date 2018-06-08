package com.example.fearpally.kontrolnatacka2.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fearpally.kontrolnatacka2.R;
import com.example.fearpally.kontrolnatacka2.fragments.MasterFragment;

import java.util.List;

public class GlumacAdapter extends RecyclerView.Adapter<GlumacAdapter.ViewHolder> {
    private List<String> glumac;
    private MasterFragment.OnItemSelectedListener listener;

    public GlumacAdapter(MasterFragment.OnItemSelectedListener listener, List<String> glumac) {
        this.glumac = glumac;
        this.listener = listener;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview_glumac_item, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final int pos = position;
        holder.textView.setText(glumac.get(position));
        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemSelected(pos);
            }
        });
    }
    @Override
    public int getItemCount() {
        return glumac.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;

        public ViewHolder(View v) {
            super(v);
            textView = (TextView) v.findViewById(R.id.text);
        }
    }

}
