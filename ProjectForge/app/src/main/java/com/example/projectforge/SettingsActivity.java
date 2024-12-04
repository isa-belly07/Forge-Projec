package com.example.appsocialjava;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        findViewById(R.id.account_settings).setOnClickListener(v ->
                Toast.makeText(SettingsActivity.this, "Configurações de Conta", Toast.LENGTH_SHORT).show());

        findViewById(R.id.privacy_settings).setOnClickListener(v ->
                Toast.makeText(SettingsActivity.this, "Configurações de Privacidade", Toast.LENGTH_SHORT).show());

        findViewById(R.id.notification_settings).setOnClickListener(v ->
                Toast.makeText(SettingsActivity.this, "Configurações de Notificações", Toast.LENGTH_SHORT).show());
    }
}
