package com.example.algorithmsandmethods;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button_sort;
    Button button_protect_hack;
    Button button_fun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView);
        button_sort = (Button)findViewById(R.id.button2);
        button_protect_hack = (Button)findViewById(R.id.button4);
        button_fun = (Button)findViewById(R.id.button_fun);

    }

    public void clickButtonSort(View view) {
        Intent intent = new Intent(MainActivity.this, SortActivity.class);
        startActivity(intent);
    }

    public void clickButtonProtectHack(View view) {
        Intent intent = new Intent(MainActivity.this, ProtectHackActivity.class);
        startActivity(intent);
    }

    public void clickButtonFun(View view) {
        Intent intent = new Intent(MainActivity.this, FunActivity.class);
        startActivity(intent);
    }
}
