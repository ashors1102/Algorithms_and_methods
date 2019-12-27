package com.example.algorithmsandmethods;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class SortActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sort);

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

    public void clickTextViewBubbleSort(View view) {
    }

    public void clickTextViewShakerSort(View view) {
    }

    public void clickTextViewCombSort(View view) {
    }

    public void clickTextViewInsertionSort(View view) {
    }

    public void clickTextViewShellSort(View view) {
    }

    public void clickTextViewTreeSort(View view) {
    }

    public void clickTextViewGnomeSort(View view) {
    }

    public void clickTextViewSelectionSort(View view) {
    }

    public void clickTextViewHeapSort(View view) {
    }

    public void clickTextViewQuickSort(View view) {
    }

    public void clickTextViewMergeSort(View view) {
    }

    public void clickTextViewCountingSort(View view) {
    }

    public void clickTextViewBucketSort(View view) {
    }

    public void clickTextViewRadixSort(View view) {
    }

    public void clickTextViewLSDSort(View view) {
    }

    public void clickTextViewMSDSort(View view) {
    }

    public void clickTextViewBitonicSort(View view) {
    }

    public void clickTextViewTimSort(View view) {
    }
}
