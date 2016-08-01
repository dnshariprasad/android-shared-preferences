package com.sharedpreferences;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class RetrieveActivity extends AppCompatActivity {
    private TextView tvRetrieve;

    public static void start(Context context) {
        Intent starter = new Intent(context, RetrieveActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrieve);

        tvRetrieve = (TextView) findViewById(R.id.tv_retrieve);

        //get sp object
        SharedPreferences sharedPreferences = getSharedPreferences(Constant.ME, MODE_PRIVATE);

        //get value by key with sp STEP - 5
        tvRetrieve.setText(sharedPreferences.getString(Constant.preference.DATA, getResources().getString(R.string.text_no_data)));
    }
}
