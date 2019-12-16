package com.dds.anyndk;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class ParsonActivity extends AppCompatActivity {

    private TextView text;
    private TextView text1;
    private String pro = "姓名:大大帅，\n职业：程序员，\n喜好：看书、打球、美女";

    public static void openActivity(AppCompatActivity activity) {
        Intent intent = new Intent(activity, ParsonActivity.class);
        activity.startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parson);
        text = findViewById(R.id.text);
        text1 = findViewById(R.id.text1);
        text.setText(pro);
    }
    @Override protected void onResume() {
        super.onResume();
    }



}
