package com.ipl2017.imran.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ipl2017.imran.Model.ScheduleDataModel;
import com.ipl2017.imran.R;

import java.util.ArrayList;


public class ScheduleCustomAdapter extends RecyclerView.Adapter<ScheduleCustomAdapter.MyViewHolder> {

    private ArrayList<ScheduleDataModel> dataSet;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textViewMatchNo;
        TextView textViewTeam;
        TextView textViewDate;
        TextView textViewTime;
        TextView textViewVenue;
        ImageView imageViewIcon;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.textViewMatchNo = (TextView) itemView.findViewById(R.id.textmatchno);
            this.textViewTeam = (TextView) itemView.findViewById(R.id.textTeam);
            this.textViewDate = (TextView) itemView.findViewById(R.id.textdate);
            this.textViewTime = (TextView) itemView.findViewById(R.id.texttime);
            this.textViewVenue = (TextView) itemView.findViewById(R.id.textvenue);
            this.imageViewIcon = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }

    public ScheduleCustomAdapter(ArrayList<ScheduleDataModel> data) {
        this.dataSet = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                           int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.schedule_cards_layout, parent, false);

      /*  view.setOnClickListener(ScheduleActivity.myOnClickListener);*/

        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {

        TextView textViewMatchNo = holder.textViewMatchNo;
        TextView textViewTeam = holder.textViewTeam;
        TextView textViewDate = holder.textViewDate;
        TextView textViewTime = holder.textViewTime;
        TextView textViewVenue = holder.textViewVenue;
        ImageView imageView = holder.imageViewIcon;

        textViewMatchNo.setText(dataSet.get(listPosition).getMatchname());
        textViewTeam.setText(dataSet.get(listPosition).getTeam());
        textViewDate.setText(dataSet.get(listPosition).getDate());
        textViewTime.setText(dataSet.get(listPosition).getTime());
        textViewVenue.setText(dataSet.get(listPosition).getVenue());
        imageView.setImageResource(dataSet.get(listPosition).getImage());
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}
