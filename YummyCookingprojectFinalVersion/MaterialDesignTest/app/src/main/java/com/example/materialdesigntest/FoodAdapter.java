package com.example.materialdesigntest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class FoodAdapter extends RecyclerView.Adapter<FoodViewHolder> implements View.OnClickListener {
    private ArrayList<FoodBean> foodList;
    private OnItemClickListener mOnItemClickListener = null;


    public void setData(ArrayList<FoodBean> itemList){
        this.foodList = itemList;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_foodcard, parent, false);
        FoodViewHolder foodViewHolder = new FoodViewHolder(view);
        view.setOnClickListener(this);
        return foodViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        if (foodList != null && position < foodList.size()) {
            FoodBean foodBean = foodList.get(position);
            FoodViewHolder mFoodViewHolder = holder;
            mFoodViewHolder.foodImage.setImageResource(foodBean.getImg());
            mFoodViewHolder.foodTime.setText(foodBean.getTime());
            mFoodViewHolder.foodCost.setText(foodBean.getCost());
            mFoodViewHolder.foodTitle.setText(foodBean.getTitle());
        }
        holder.itemView.setTag(position);
    }

    @Override
    public void onClick(View v) {
        if (mOnItemClickListener != null) {
            mOnItemClickListener.onItemClick(v, (int) v.getTag());//注意这里使用getTag方法获取position
        }
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.mOnItemClickListener = listener;
    }

    @Override
    public int getItemCount() {

        return foodList == null ? 0 : foodList.size();
    }

}
