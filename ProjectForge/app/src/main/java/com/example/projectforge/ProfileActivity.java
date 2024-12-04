package com.example.appsocialjava;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    private EditText nameInput, emailInput;
    private Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        nameInput = findViewById(R.id.name_input);
        emailInput = findViewById(R.id.email_input);
        saveButton = findViewById(R.id.save_button);

        saveButton.setOnClickListener(v -> {
            // Salvar alterações (simulação)
        });
    }
}
