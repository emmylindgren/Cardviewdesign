package se.umu.emli.ou2;

import android.app.Application;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class RecyclerView_Adapter extends RecyclerView.Adapter<ViewHolder> {

    List<Days> list = Collections.emptyList();
    Context context;

    public RecyclerView_Adapter(List<Days> data, Application application) {
        this.list = data;
        this.context = application;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Inflate the layout, initialize the View Holder
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.daycard, parent, false);
        ViewHolder holder = new ViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        ArrayList<String> events;
        ArrayList<Integer> eventColors;

        holder.day.setText(list.get(position).getDate());
        holder.daycolor.setBackgroundColor(list.get(position).getDayColor());

        events = list.get(position).getEvents();
        eventColors = list.get(position).getEventColors();

        if(events.size() > 0){
            holder.appointment1Button.setBackgroundTintList(ColorStateList.valueOf(eventColors.get(0)));
            holder.appointment1.setText(events.get(0));
        }

        if(events.size() > 1){
            holder.appointment2Button.setBackgroundTintList(ColorStateList.valueOf(eventColors.get(1)));
            holder.appointment2.setText(events.get(1));
        }

        if(events.size() > 2){
            holder.appointment3Button.setBackgroundTintList(ColorStateList.valueOf(eventColors.get(2)));
            holder.appointment3.setText(events.get(2));
        }

        if(events.size() > 3){
            holder.appointment4Button.setBackgroundTintList(ColorStateList.valueOf(eventColors.get(3)));
            holder.appointment4.setText(events.get(3));
        }

        if(events.size() > 4){
            holder.appointment5Button.setBackgroundTintList(ColorStateList.valueOf(eventColors.get(4)));
            holder.appointment5.setText(events.get(4));
        }

        if(events.size() > 5){
            holder.appointment6Button.setBackgroundTintList(ColorStateList.valueOf(eventColors.get(5)));
            holder.appointment6.setText(events.get(5));
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}