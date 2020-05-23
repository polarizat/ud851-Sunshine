package com.example.android.sunshine;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder> {
    private String[] mWeatherData;



    class ForecastAdapterViewHolder extends RecyclerView.ViewHolder{

        public final TextView mWeatherTextView;

        ForecastAdapterViewHolder(View view){
            super(view);
            mWeatherTextView = view.findViewById(R.id.tv_weather_data);
        }

    }

    @NonNull
    @Override
    public ForecastAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        Context context = viewGroup.getContext();
        int layoutIdForListItem =R.layout.forecast_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view =inflater.inflate(layoutIdForListItem, viewGroup, shouldAttachToParentImmediately);
        ForecastAdapterViewHolder viewHolder = new ForecastAdapterViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ForecastAdapterViewHolder holder, int position) {
        holder.mWeatherTextView.setText(String.valueOf(position));
    }

    @Override
    public int getItemCount() {
        if (mWeatherData == null){
            return 0;
        } else {
            return mWeatherData.length;
        }
    }

    public void setWeatherData(String[] weatherData){
        mWeatherData = weatherData;
        notifyDataSetChanged();

    }
}

