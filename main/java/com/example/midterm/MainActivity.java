package com.example.midterm;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageButton imb1,imb2,imb3,imb4;
    private String TAG="myLOG";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getApplicationContext(),"onCreate(1)",Toast.LENGTH_LONG).show();
        Log.d(TAG,"onCreate(1)");
        setContentView(R.layout.activity_main);
        imb1=(ImageButton) findViewById(R.id.imageButton3);
        imb2=(ImageButton) findViewById(R.id.imageButton4);
        imb3=(ImageButton) findViewById(R.id.imageButton5);
        imb4=(ImageButton) findViewById(R.id.imageButton8);
        imb1.setOnClickListener(imblistener);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart(1)");
        Toast.makeText(getApplicationContext(),"onStart(1)",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume(1)");
        Toast.makeText(getApplicationContext(),"onResume(1)",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy(1)");
        Toast.makeText(getApplicationContext(),"onDestroy(1)",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop(1)");
        Toast.makeText(getApplicationContext(),"onStop(1)",Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause(1)");
        Toast.makeText(getApplicationContext(),"onPause(1)",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"onRestart(1)");
        Toast.makeText(getApplicationContext(),"onRestart(1)",Toast.LENGTH_LONG).show();

    }

    private View.OnClickListener imblistener=new View.OnClickListener(){
        public void onClick(View v){
            Intent intent=new Intent();
            intent.setClass(MainActivity.this,second.class);
            startActivity(intent);
        }
    };
}