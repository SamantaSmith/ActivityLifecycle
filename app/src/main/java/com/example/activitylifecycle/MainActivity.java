package com.example.activitylifecycle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.util_text);

        if (savedInstanceState != null) {

            text.setText(savedInstanceState.getString("Suka_Bundle"));
        }
        Log.d("Lifecycle", "OnCreate");
        text.append("onCreate" + "\n");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("Lifecycle", "OnRestart");
        text.append("onRestart" + "\n");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("Lifecycle", "OnStart");
        text.append("onStart" + "\n");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("Lifecycle", "OnResume");
        text.append("onResume" + "\n");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("Lifecycle", "OnPause");
        text.append("onPause" + "\n");
    }



    @Override
    protected void onStop() {
        super.onStop();

        Log.d("Lifecycle", "OnStop");
        text.append("onStop" + "\n");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("Lifecycle", "OnDestroy");
        text.append("onDestroy" + "\n");
    }



    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("Suka_Bundle", text.getText().toString());
    }
}
