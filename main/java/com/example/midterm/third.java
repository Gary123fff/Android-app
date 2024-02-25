package com.example.midterm;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class third extends second{
    int[] tem2 =new int[]{R.drawable.map_003,R.drawable.phoneee};
    String[] name2=new String[]{"導航","打電話"};
    WebView webview;
    private String TAG="myLOG";
    private ImageButton imb5;
    WebSettings webSettings;
    String url="https://travel.nantou.gov.tw/attractions/hengji-gong/";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Toast.makeText(getApplicationContext(),"onCreate(3)",Toast.LENGTH_LONG).show();
        Log.d(TAG,"onCreate(3)");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web);
        imb5=(ImageButton) findViewById(R.id.imageButton2);
        webview = findViewById(R.id.webview);
        webSettings=webview.getSettings();
        webSettings.setJavaScriptEnabled(true);//開啟javascript功能
        webview.setWebViewClient(new WebViewClient());

        imb5.setOnClickListener(imblistener);
        webview.loadUrl(url);


    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart(3)");
        Toast.makeText(getApplicationContext(),"onStart(3)",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume(3)");
        Toast.makeText(getApplicationContext(),"onResume(3)",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy(3)");
        Toast.makeText(getApplicationContext(),"onDestroy(3)",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop(3)");
        Toast.makeText(getApplicationContext(),"onStop(3)",Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause(3)");
        Toast.makeText(getApplicationContext(),"onPause(3)",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"onRestart(3)");
        Toast.makeText(getApplicationContext(),"onRestart(3)",Toast.LENGTH_LONG).show();

    }
    private View.OnClickListener imblistener=new View.OnClickListener(){
        public void onClick(View v){
            Uri uri=Uri.parse("tel:+886492982920");
            Intent intent=new Intent(Intent.ACTION_DIAL,uri);
            startActivity(intent);
        }
    };


}
