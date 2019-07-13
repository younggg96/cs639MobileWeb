package com.example.materialdesigntest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ContentActivity extends AppCompatActivity {
    private ArrayList<FoodBean> foodList;
    ImageView mContentImageView = null;
    TextView mTitleTextView = null;
    TextView mIngredientsTextView = null;
    TextView mInstructionsTextView = null;
    ImageView mBackImageView = null;
    ImageView mShareImageView = null;
    ImageView mLocationImageView = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        DataStore dataStore = new DataStore();
        foodList = dataStore.initData();

        mContentImageView = findViewById(R.id.content_img);
        mTitleTextView = findViewById(R.id.content_title);
        mIngredientsTextView = findViewById(R.id.content_ingredients);
        mInstructionsTextView = findViewById(R.id.content_instructions);

        mShareImageView = findViewById(R.id.recipe_button_share);
        mLocationImageView = findViewById(R.id.recipe_button_location);
        mBackImageView = findViewById(R.id.recipe_button_back);

        mBackImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackArrowClicked();
            }
        });



        Intent intent = getIntent();
        int position = intent.getIntExtra("position", -1);
        switch (position) {
            case 0:
                FoodBean food = foodList.get(0);
                mContentImageView.setImageResource(food.getImg());
                mTitleTextView.setText(food.getTitle());
                mIngredientsTextView.setText(food.getIngredients());
                mInstructionsTextView.setText(food.getInstructions());

                mLocationImageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Uri uri = Uri.parse(foodList.get(0).getLocation());
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        intent.setPackage("com.google.android.apps.maps");
                        startActivity(intent);
                    }
                });

                mShareImageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_SEND);
                        intent.setType("text/plain");
                        intent.putExtra(Intent.EXTRA_TEXT, "SHARE");
                        startActivity(Intent.createChooser(intent, foodList.get(0).getTitle()));
                        startActivity(intent);
                    }
                });
                break;
            case 1:
                FoodBean food1 = foodList.get(1);
                mContentImageView.setImageResource(food1.getImg());
                mTitleTextView.setText(food1.getTitle());
                mIngredientsTextView.setText(food1.getIngredients());
                mInstructionsTextView.setText(food1.getInstructions());
                mLocationImageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Uri uri = Uri.parse(foodList.get(1).getLocation());
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        intent.setPackage("com.google.android.apps.maps");
                        startActivity(intent);
                    }
                });

                mShareImageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_SEND);
                        intent.setType("text/plain");
                        intent.putExtra(Intent.EXTRA_TEXT, "SHARE");
                        startActivity(Intent.createChooser(intent, foodList.get(1).getTitle()));
                        startActivity(intent);
                    }
                });
                break;
            case 2:
                FoodBean food2 = foodList.get(2);
                mContentImageView.setImageResource(food2.getImg());
                mTitleTextView.setText(food2.getTitle());
                mIngredientsTextView.setText(food2.getIngredients());
                mInstructionsTextView.setText(food2.getInstructions());
                mLocationImageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Uri uri = Uri.parse(foodList.get(2).getLocation());
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        intent.setPackage("com.google.android.apps.maps");
                        startActivity(intent);
                    }
                });

                mShareImageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_SEND);
                        intent.setType("text/plain");
                        intent.putExtra(Intent.EXTRA_TEXT, "SHARE");
                        startActivity(Intent.createChooser(intent, foodList.get(2).getTitle()));
                        startActivity(intent);
                    }
                });
                break;
            case 3:
                FoodBean food3 = foodList.get(3);
                mContentImageView.setImageResource(food3.getImg());
                mTitleTextView.setText(food3.getTitle());
                mIngredientsTextView.setText(food3.getIngredients());
                mInstructionsTextView.setText(food3.getInstructions());
                mLocationImageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Uri uri = Uri.parse(foodList.get(3).getLocation());
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        intent.setPackage("com.google.android.apps.maps");
                        startActivity(intent);
                    }
                });

                mShareImageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_SEND);
                        intent.setType("text/plain");
                        intent.putExtra(Intent.EXTRA_TEXT, "SHARE");
                        startActivity(Intent.createChooser(intent, foodList.get(3).getTitle()));
                        startActivity(intent);
                    }
                });
                break;
            case 4:
                FoodBean food4 = foodList.get(4);
                mContentImageView.setImageResource(food4.getImg());
                mTitleTextView.setText(food4.getTitle());
                mIngredientsTextView.setText(food4.getIngredients());
                mInstructionsTextView.setText(food4.getInstructions());
                mLocationImageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Uri uri = Uri.parse(foodList.get(4).getLocation());
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        intent.setPackage("com.google.android.apps.maps");
                        startActivity(intent);
                    }
                });

                mShareImageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_SEND);
                        intent.setType("text/plain");
                        intent.putExtra(Intent.EXTRA_TEXT, "SHARE");
                        startActivity(Intent.createChooser(intent, foodList.get(4).getTitle()));
                        startActivity(intent);
                    }
                });
                break;
            case 5:
                FoodBean food5 = foodList.get(5);
                mContentImageView.setImageResource(food5.getImg());
                mTitleTextView.setText(food5.getTitle());
                mIngredientsTextView.setText(food5.getIngredients());
                mInstructionsTextView.setText(food5.getInstructions());
                mLocationImageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Uri uri = Uri.parse(foodList.get(5).getLocation());
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        intent.setPackage("com.google.android.apps.maps");
                        startActivity(intent);
                    }
                });

                mShareImageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_SEND);
                        intent.setType("text/plain");
                        intent.putExtra(Intent.EXTRA_TEXT, "SHARE");
                        startActivity(Intent.createChooser(intent, foodList.get(5).getTitle()));
                        startActivity(intent);
                    }
                });
                break;
            default:
                break;

        }



    }

    public void onBackArrowClicked() {
        this.finish();
    }
}
