package com.example.intent_redirect;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ProxyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proxy);

        ConstraintLayout layout = findViewById(R.id.main);
        TextView text = findViewById(R.id.textView);

        Intent nested = getIntent().getParcelableExtra("next");

        if (nested != null) {
            startActivity(nested);
        }
        else {
            layout.setBackgroundColor(Color.RED);
            text.setText("No redirection intent received");
        }
    }
}