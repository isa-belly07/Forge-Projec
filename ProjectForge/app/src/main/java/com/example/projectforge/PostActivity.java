package com.example.appsocialjava;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PostActivity extends AppCompatActivity {

    private EditText postText;
    private Button postButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);

        postText = findViewById(R.id.post_text);
        postButton = findViewById(R.id.post_button);

        postButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String postContent = postText.getText().toString();
                if (!postContent.isEmpty()) {
                    Toast.makeText(PostActivity.this, "Postagem criada!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(PostActivity.this, "Insira algum texto!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
