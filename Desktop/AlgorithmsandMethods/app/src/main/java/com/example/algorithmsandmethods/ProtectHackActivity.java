package com.example.algorithmsandmethods;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class ProtectHackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_protect_hack);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void clickTextViewCryptograph(View view) {
    }

    public void clickTextViewAttacks(View view) {
    }

    public void clickTextViewSteganography(View view) {
    }

    public void clickTextViewFamAlgorithms(View view) {
    }

    public void clickTextViewNewAlgorithms(View view) {
    }

    public void clickTextViewAuth_and_hashfunc(View view) {
    }
}
