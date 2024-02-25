package com.example.midterm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class second extends AppCompatActivity {
    private ListView lstPrefer;
    private String TAG="myLOG";

    int[] tem =new int[]{R.drawable.t152,R.drawable.t157,R.drawable.t161};
    String[] name=new String[]{"恒吉宮媽祖廟","南興打鐵街","靈巖山寺"};
    String[] add=new String[]{"南投縣埔里鎮南興街367號","南投縣埔里鎮南興打鐵街","南投縣埔里鎮中正路105-1號"};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        lstPrefer=findViewById(R.id.listPrefer);
        MyAdapter adapter=new MyAdapter(this);
        lstPrefer.setAdapter(adapter);
        lstPrefer.setOnItemClickListener(myListener);
        Toast.makeText(getApplicationContext(),"onCreate(2)",Toast.LENGTH_LONG).show();
        Log.d(TAG,"onCreate(2)");
    }
    private AdapterView.OnItemClickListener myListener=new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            if(i==0) {
                Intent intent2 = new Intent();
                intent2.setClass(second.this, third.class);
                startActivity(intent2);
            }
        }
    };
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart(2)");
        Toast.makeText(getApplicationContext(),"onStart(2)",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume(2)");
        Toast.makeText(getApplicationContext(),"onResume(2)",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy(2)");
        Toast.makeText(getApplicationContext(),"onDestroy(2)",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop(2)");
        Toast.makeText(getApplicationContext(),"onStop(2)",Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause(2)");
        Toast.makeText(getApplicationContext(),"onPause(2)",Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"onRestart(2)");
        Toast.makeText(getApplicationContext(),"onRestart(2)",Toast.LENGTH_LONG).show();

    }
    class MyAdapter extends BaseAdapter{
        private LayoutInflater myInflater;
        public MyAdapter(Context c){
            myInflater=LayoutInflater.from(c);
        }
        @Override
        public int getCount() {
            return name.length;
        }

        @Override
        public Object getItem(int i) {
            return name[i];
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view=myInflater.inflate(R.layout.itamlayout,null);
            ImageView imgLogo=view.findViewById(R.id.imageView6);
            TextView txtName=view.findViewById(R.id.textView6);
            TextView address=view.findViewById(R.id.textView7);
            imgLogo.setImageResource(tem[i]);
            txtName.setText(name[i]);
            address.setText(add[i]);
            return view;
        }
    };
}
