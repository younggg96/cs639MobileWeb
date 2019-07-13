package com.example.materialdesigntest;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class FoodViewHolder extends RecyclerView.ViewHolder {

    public ImageView foodImage;
    public TextView foodTime;
    public TextView foodCost;
    public TextView foodTitle;

    public FoodViewHolder(@NonNull View itemView) {
        super(itemView);

        foodImage = itemView.findViewById(R.id.food_image);
        foodTitle = itemView.findViewById(R.id.food_title);
        foodCost = itemView.findViewById(R.id.food_cost);
        foodTime = itemView.findViewById(R.id.food_time);

    }

}
