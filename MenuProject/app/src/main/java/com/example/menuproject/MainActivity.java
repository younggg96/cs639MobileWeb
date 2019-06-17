package com.example.menuproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button1 = findViewById(R.id.button_1);
        button1.setOnClickListener(this);

        Button button2 = findViewById(R.id.button_2);
        button2.setOnClickListener(this);

        Button button3 = findViewById(R.id.button_3);
        button3.setOnClickListener(this);

        Button button4 = findViewById(R.id.button_4);
        button4.setOnClickListener(this);

        Button button5 = findViewById(R.id.button_5);
        button5.setOnClickListener(this);

        Button button6 = findViewById(R.id.button_6);
        button6.setOnClickListener(this);

    }

    public void onClick(View view){
        switch (view.getId()){
            case (R.id.button_1):
                Intent intent1 = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:5512082669"));
                intent1.putExtra("sms_body", "Guanggeng Yang");
                startActivity(intent1);
                break;
            case (R.id.button_2):
                Intent intent2 = new Intent(Intent.ACTION_DIAL);
                intent2.setData(Uri.parse("tel:5512082669"));
                startActivity(intent2);
                break;
            case (R.id.button_3):
                Intent intent3 = new Intent(Intent.ACTION_VIEW);
                intent3.setData(Uri.parse("http://www.google.com"));
                startActivity(intent3);
                break;
            case (R.id.button_4):
                Uri uri = Uri.parse("geo:25.779110, 113.057109");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, uri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
                break;
            case (R.id.button_5):
                Intent intent5 = new Intent(MainActivity.this, ShareTheLoveActivity.class);
                startActivity(intent5);
                break;
            case (R.id.button_6):
                Intent intent6 = new Intent(MainActivity.this, NewActivity.class);
                startActivity(intent6);
                break;
            default:
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.help_item:
                Intent intent = new Intent(MainActivity.this, HelpActivity.class);
                startActivity(intent);
                break;
            case R.id.setting_item:
                Toast.makeText(this, "You clicked Settings", Toast.LENGTH_SHORT).show();
                break;
            default:

        }
        return true;
    }
}
