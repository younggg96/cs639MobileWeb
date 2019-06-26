package com.example.milestokilometer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static boolean isNumericZidai(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        final TextView textView = findViewById(R.id.edit_text);
        final TextView textView_output = findViewById(R.id.textView_output);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(isNumericZidai(textView.getText().toString())) {
                    int parseInt = Integer.parseInt(textView.getText().toString());
                    Double res = parseInt * 1.609;
                    textView_output.setText(res.toString());
                } else {
                    textView_output.setText("Invalid input...");
                }

            }
        });
    }
}
