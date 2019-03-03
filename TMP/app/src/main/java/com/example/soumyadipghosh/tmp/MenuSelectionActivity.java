package com.example.soumyadipghosh.tmp;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
public class MenuSelectionActivity extends AppCompatActivity {

    FloatingActionButton button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_selection);
        button = (FloatingActionButton) findViewById(R.id.fabMenuSelection);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MenuSelectionActivity.this,Summary.class);
                startActivity(i);
            }
        });
    }
    public void ToHotCold(View view) {
        Intent i = new Intent(this, HotAndCold.class);
        startActivity(i);

    }

    public void ToSnacks(View view) {
        Intent i = new Intent(this, SnacksActivity.class);
        startActivity(i);
    }


    public void ToRolls(View view) {
        Intent i = new Intent(this,RollsActivity.class);
        startActivity(i);
    }
}

