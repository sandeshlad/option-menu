package com.example.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.new1:
                Toast.makeText(getApplicationContext(), "New Option Selected", Toast.LENGTH_LONG).show();
                break;

            case R.id.open1:
                Toast.makeText(getApplicationContext(), "Open Option Selected", Toast.LENGTH_LONG).show();
                break;

            case R.id.save1:
                Toast.makeText(getApplicationContext(), "Save Option Selected", Toast.LENGTH_LONG).show();
                break;

            case R.id.exit1:
                Toast.makeText(getApplicationContext(), "Exit Option Selected", Toast.LENGTH_LONG).show();
                break;
        }

            return super.onOptionsItemSelected(item);
        }
    }
