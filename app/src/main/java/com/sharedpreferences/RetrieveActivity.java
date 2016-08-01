package com.sharedpreferences;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class RetrieveActivity extends AppCompatActivity {
    private TextView tvRetrieve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrieve);
        tvRetrieve = (TextView) findViewById(R.id.tv_retrieve);
        //get sp object
        SharedPreferences sharedPreferences = getSharedPreferences(Constant.ME, MODE_PRIVATE);
        //get value by key with sp
        tvRetrieve.setText(sharedPreferences.getString(Constant.preference.DATA, getResources().getString(R.string.text_no_data)));
    }
}
