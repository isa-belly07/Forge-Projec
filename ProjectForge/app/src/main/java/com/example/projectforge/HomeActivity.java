package com.example.projectforge;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        findViewById(R.id.timeline_button).setOnClickListener(v -> startActivity(new Intent(this, TimelineActivity.class)));
        findViewById(R.id.search_button).setOnClickListener(v -> startActivity(new Intent(this, SearchActivity.class)));
        findViewById(R.id.messages_button).setOnClickListener(v -> startActivity(new Intent(this, MessagesActivity.class)));
        findViewById(R.id.post_button).setOnClickListener(v -> startActivity(new Intent(this, PostActivity.class)));
        findViewById(R.id.profile_button).setOnClickListener(v -> startActivity(new Intent(this, ProfileActivity.class)));
        findViewById(R.id.settings_button).setOnClickListener(v -> startActivity(new Intent(this, SettingsActivity.class)));
        findViewById(R.id.manage_posts_button).setOnClickListener(v -> startActivity(new Intent(this, ManagePostsActivity.class)));
    }
}
