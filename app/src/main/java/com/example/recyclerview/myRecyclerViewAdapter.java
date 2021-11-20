package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class myRecyclerViewAdapter extends RecyclerView.Adapter<myRecyclerViewAdapter.MyViewHolder> {

    List<Friends>friendlist;

    public myRecyclerViewAdapter(List<Friends>friendlist)
    {
        this.friendlist=friendlist;
    }

    @NonNull
    @Override
    public myRecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.myrecyclerview, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull myRecyclerViewAdapter.MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageViewFriend;
        TextView textViewFriendName,textViewDateFriend,textViewCity;
        Friends data;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewFriend=itemView.findViewById(R.id.imageViewFriendPicture);
            textViewFriendName=itemView.findViewById(R.id.textViewFriendName);
            textViewDateFriend= itemView.findViewById(R.id.textViewDate);
            textViewCity=itemView.findViewById(R.id.textViewCity);

        }
    }
}

