package com.example.w3033034.myapp;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(this);

    }

    //ボタンが押された時の処理
    public void onClick(View view){
        Intent intent = new Intent(this, Main2Activity.class);  //インテントの作成
        startActivity(intent);                                 //画面遷移
    }
}