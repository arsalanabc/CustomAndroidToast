package com.example.customtoastandroid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button like;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        like = findViewById(R.id.like);

        like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showLikeToast();
            }
        });
    }

    private void showLikeToast(){
        LayoutInflater layoutInflater = getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.heart_toast_layout, null);
        Toast likeToast = new Toast(this);
        likeToast.setView(view);
        likeToast.setDuration(Toast.LENGTH_LONG);
        likeToast.show();
    }
}
