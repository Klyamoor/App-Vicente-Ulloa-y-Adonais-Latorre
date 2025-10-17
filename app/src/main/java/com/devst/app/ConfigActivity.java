package com.devst.app;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

// Clase evento explicito abrir configuración
public class ConfigActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);
    }
}
