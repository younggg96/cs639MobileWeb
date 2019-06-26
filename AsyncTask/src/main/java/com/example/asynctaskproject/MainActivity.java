package com.example.asynctaskproject;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button button;
    private String image_url = "https://github.com/younggg96/CS6392019/blob/master/AsyncTask/53473_331447_292019.jpg?raw=true";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        imageView = findViewById(R.id.image);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageBitmap(null);
                new DownloadImageTask().execute(image_url);
            }
        });
    }

    private class DownloadImageTask extends AsyncTask<String, String, Bitmap> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onProgressUpdate(String... values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            imageView.setImageBitmap(bitmap);
            Toast.makeText(MainActivity.this, "Downloaded", Toast.LENGTH_SHORT).show();
        }

        @Override
        protected Bitmap doInBackground(String... strings) {
//            Toast.makeText(MainActivity.this, "Downloading...", Toast.LENGTH_SHORT).show();
            return getBitmapFromUrl(strings[0]);

        }
    }

    public Bitmap getBitmapFromUrl(String image_url){
        Bitmap bitmap;
        InputStream is = null;

        try {
            URL url = new URL(image_url);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            is = new BufferedInputStream(urlConnection.getInputStream());
            bitmap = BitmapFactory.decodeStream(is);
            urlConnection.disconnect();
            return  bitmap;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
